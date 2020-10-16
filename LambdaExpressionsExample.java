package ex08;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import lombok.extern.log4j.Log4j;


@Log4j
public class LambdaExpressionsExample {

	
	public static void main(String[] args) {
		List<Student> list = Arrays.asList(
			new Student("홍길동", 90),
			new Student("신용권", 92)
		); // ArrayList<Student> 객체의 생성 by Array.asList(T...)
		
		//-------------------------------------------//
		// 내부반복자인 Stream을 얻어서, 각 요소마다 처리 수행
		// 이때, 요소마다 처리할 작업은 람다식으로 만들어 제공
		Stream<Student> stream = list.stream();
		
//		stream.forEach( s-> {
//			String name = s.getName();
//			int score = s.getScore();
//			
//			log.info(name + "-" + score);
//			
//		}); // forEach
//		stream.forEach(s -> log.info(s));
		
		stream.forEach(log::info); // 메소드참조
		
	} // main
	
} // end class