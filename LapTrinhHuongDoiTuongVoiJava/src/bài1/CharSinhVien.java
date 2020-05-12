package bài1;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class CharSinhVien{
	public static void main(String[] args) throws IOException {
		Random rd = new Random();
		String line = "";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d/M/yyyy");
		LocalDate ngaysinh = null;
		float diemTB=0.0f;
		String[] dsHeDaotao = {"Đại học","Cao đẳng","Nghề"};
		String heDaotao="";
		
		InputStreamReader in = new InputStreamReader(new FileInputStream("data/dssv_nguon.txt"), "utf-8");
		FileWriter out = new FileWriter("data/dssv_dich.txt");
		
		Scanner sc = new Scanner(in);
		PrintWriter p = new PrintWriter(out,true);
		
		while(sc.hasNextLine()) {
			line = sc.nextLine();
			String[] temp = line.split("; ");
			
			ngaysinh = LocalDate.parse(temp[4],dtf);
			
			float f=rd.nextFloat()*10;
			diemTB=Float.valueOf(Float.toString(f).substring(0,4));
			
			heDaotao = dsHeDaotao[rd.nextInt(3)];
			
			SinhVien sv = new SinhVien(temp[0],temp[1],temp[2],temp[3],ngaysinh,temp[5],diemTB,heDaotao);
			
			p.print(sv.toString());
			
		}
		sc.close();
		p.close();
		
	}
}
