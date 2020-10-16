package ex08;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import lombok.extern.log4j.Log4j;


@Log4j
public class FromArrayExample {

	
	public static void main(String[] args) {
		String[] strArray = {"홍길동", "신용권", "김미나"};
		
		Stream<String> strStream = Arrays.stream(strArray);
		
		// 아래의 람다식은 메소드 참조로 변환 X
		strStream.forEach(a -> System.out.print(a + ","));
		
		log.info("\n");
		
		//-------------------------------//
		
		int[] intArray = { 1, 2, 3, 4, 5 };
		
		IntStream intStream = Arrays.stream(intArray);
		intStream.forEach(a -> log.info(a + ","));
		
		log.info("\n");
	} // main
	
} // end class