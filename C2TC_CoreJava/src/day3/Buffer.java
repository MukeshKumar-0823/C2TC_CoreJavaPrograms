package day3;

import java.io.BufferedReader;
import java.io.FileReader;

public class Buffer {

	public static void main(String[] args) {
		try {
			BufferedReader bf=new BufferedReader(new FileReader("day3"));
			String result;
			while((result=bf.readLine())!=null) {
				System.out.println(result);
			}
			bf.close();

		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		
	}

}
