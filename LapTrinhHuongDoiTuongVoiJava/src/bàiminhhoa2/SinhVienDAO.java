package bàiminhhoa2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;


public class SinhVienDAO {
	
	private ArrayList<SinhVien> dssv; 
	
	public SinhVienDAO(){
		dssv = new ArrayList<>();
	}
	public void napDSSV(String fileName) {
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("d/M/yyyy");
		LocalDate ngaysinh = null;
		
		File f = new File(fileName);
		if(f.exists()) {
			try {
				InputStreamReader in = new InputStreamReader(new FileInputStream("data/dssv_nguon.txt"),"utf-8");
				Scanner scn = new Scanner(in);
				String line = "";
				while(scn.hasNextLine()) {
					line = scn.nextLine();
					String[] temp = line.split("; ");
					ngaysinh = LocalDate.parse(temp[4],dft);
					SinhVien sv = new SinhVien(temp[0], temp[1], temp[2], temp[3], ngaysinh, temp[5], Float.parseFloat(temp[6]),temp[7]);
					dssv.add(sv);
					
				}
			}catch (IOException e) {
				System.out.println(e.getMessage());
			}catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("Không tồn tại file");
		}
		}
	
	public void ghiFile(String fileName) {
		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
			out.writeObject(dssv);
			out.close();
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Ghi file");
		}
	}
	
	public ArrayList<SinhVien>getDssv(){
		return dssv;
	}
	
	public void sapxepDSSVTheoDiemtb() {
		dssv.sort(new Comparator<SinhVien>() {
			@Override
			public int compare(SinhVien o1, SinhVien o2) {
				return Float.compare(o1.getDiemTB(), o2.getDiemTB());
			}
		});
	}
}
