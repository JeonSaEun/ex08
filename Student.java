package ex08;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;


// POJO
@ToString
@Getter
@AllArgsConstructor
public class Student {

	private String name;
	private int score;
	
} // end class