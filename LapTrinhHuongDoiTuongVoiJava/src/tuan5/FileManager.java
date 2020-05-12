package tuan5;

import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {
	public static List<Students> getStudents(String file){
		
		List<Students> list = new ArrayList<Students>();
		
		Scanner sc =null;
		
		try {
			LocalDate dob = LocalDate.now();
			sc = new Scanner(new FileReader(file));
			while(sc.hasNextLine()) {
				String line = sc.nextLine();
				String[] str = line.split(";");
				Students st = new Students(str[0], str[1], str[2], str[3], dob, str[5]);
				
				list.add(st);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
		
		
	}
}