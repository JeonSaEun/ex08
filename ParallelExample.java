package ex08;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import lombok.extern.log4j.Log4j;


@Log4j
public class ParallelExample {

	
	public static void main(String[] args) {
		List<String> list =
			Arrays.asList(
				"홍길동","신용권","김자바","람다식","박병렬");
		
		//-------------------------//
		
		// --1. 순차처리 스트림을 이용
		Stream<String> stream = list.stream();
	
//		stream.forEach(ParallelExample :: print);
//		stream.forEach(String::new);
		log.info("\n");
		
		//-------------------------//
		
		// --2. 병렬처리 스트림을 이용
		Stream<String> parallelStream = list.parallelStream();
	
		IntStream stream2 = IntStream.rangeClosed(0, 100000000);
		stream2.parallel();
		stream2.forEach(ParallelExample::print);
		
//		parallelStream.forEach(ParallelExample :: print);
	} // main
	
	
	public static void print(int str) {
		log.info(str + " : " + Thread.currentThread().getName());
	} // print
	
} // end class
