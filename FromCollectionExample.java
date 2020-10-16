package ex08;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import lombok.extern.log4j.Log4j;


@Log4j
public class FromCollectionExample {

	
	public static void main(String[] args) {
		List<Student> studentList = Arrays.asList(
			new Student("홍길동", 10),
			new Student("신용권", 20),
			new Student("유미선", 30)
		);
		
		Stream<Student> stream = studentList.stream();
		
		// 아래의 람다식도, 메소드 참조로 변환 불가
		stream.forEach(s -> log.info(s.getName()));
		
	} // main
	
} // end class