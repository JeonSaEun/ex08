package ex08;

import java.util.Arrays;
import java.util.List;

import lombok.extern.log4j.Log4j;


@Log4j
public class MapAndReduceExample {

	
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
				new Student("홍길동", 10),
				new Student("신용권", 20),
				new Student("유미선", 30)
		);
		
		//-----------------------------//
		
		double avg = studentList.stream()
		// Step-1. 중간처리: 학생객체 --> 점수로 매핑
		.mapToInt(Student::getScore)
		// Step-2. 최종처리: 집계산출(모든 학생의 평균점수 산출)
		.average()
		// Step-3. 최종처리결과로부터, 최종 기본타입값이 실수 추출
		.getAsDouble();
		
		log.info("평균 점수 : " + avg);
	} // main
	
} // end class