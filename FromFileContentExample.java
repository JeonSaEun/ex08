package ex08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

import lombok.extern.log4j.Log4j;


@Log4j
public class FromFileContentExample {

	
	public static void main(String[] args) throws IOException {
		Path path =
			Paths.get(
				"src/main/java/ex08/linedata.txt"); // get
		
		//-------------------------------//
		
		Stream<String> stream;
		
		//Files.lines() 메소드 이용
		stream = Files.lines(path, Charset.defaultCharset());
		
		stream.forEach( log::info );
		
		// 스트링 객체도 자원객체임. 따라서 사용이 끝나면 반드시 자원해제 
		stream.close(); 
		
		log.info("\n");
		
		//-------------------------------//
		
		//파일의 내용을 읽을 수 있는 준비
		//BufferedReader의 lines() 메소드 이용
		File file = path.toFile();
		
		FileReader fileReader = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fileReader);
		
		//-------------------------------//
		// 파일의 각 행을 요소로 갖는 스트림으로 최종처리 수행
		stream = br.lines();
		
		stream.forEach( log::info );
		
		stream.close(); // 스트림 자원객체 해제
	} // main
	
} // end class