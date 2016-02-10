package letterCount;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		FileHandler fileHandler = new FileHandler();
		
		try {
			fileHandler.readFile();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
