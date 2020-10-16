package ex08;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import lombok.extern.log4j.Log4j;

@Log4j
public class IteratorVsStreamExample {

	public static void main(String[] args) {
		List<String> list =
			Arrays.asList("홍길동","신용권","김자바");
		
		//-------------------------//
		// 1st. 외부반복자(Iterator) //
		//-------------------------//
		
		// 외부반복자(Iterator)를 이용하여, 리스트 안에 있는 모든 요소를
		// 순회(traverse)함
		Iterator<String> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			String name = iterator.next();
			
			// 첫번째 작업
//			log.info(name);
			
			// 두번째 작업
			name += "!!";
			
			// Tip
//			iterator.remove();
		} // while
		
		log.info("\n");
		
		//-------------------------//
		// 2nd. 내부반복자(Stream)   //
		//-------------------------//

		// 내부반복자(Stream)을 이용하여, 리스트 안에 있는 모든 요소를
		// 순회(traverse)함
		
		// 2-1. List 컬렉션으로부터, 내부반복자(Stream) 얻기
		Stream<String> stream = list.stream();
		// 2-2. 내부반복자(Stream)을 이용하여, 컬렉션 안의 모든 요소를
		// 자동으로 순회(traverse)
//		stream.forEach( s -> log.info(s));
//		stream.forEach( s -> {s += "!!"; s += "**"; });
//		stream.forEach(log::info);
		
		Consumer<String> task = s -> s += "!!";
		
		stream.forEach(task);
		//--------------------------------------//
//		stream.forEach(new Consumer<String>() {
//
//			@Override
//			public void accept(String name) {
//				name += "!!";
//			} // accept
//		});
		
		log.info(">>> list: " + list);
	} // main
	
} // end class