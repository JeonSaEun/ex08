package ex08;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import lombok.extern.log4j.Log4j;


@Log4j
public class FromDirectoryExample {

	
	public static void main(String[] args) throws IOException {
	
		Path path = Paths.get("C:/Windows");
		
		Stream<Path> stream = Files.list(path);
		
		// 아래의 람다식도 메소드 참조로 변환불가
		stream.forEach( p -> log.info(p.getFileName()));
		
	} // main
	
} // end class