package bàiminhhoa2;

public class TestSinhVienDAO {
	public static void main(String[] args) {
		SinhVienDAO dao = new SinhVienDAO();
		
		dao.napDSSV("data/dssv_nguon.txt");
		
		System.out.println("Danh sách sinh viên trước khi sắp xếp");
		dao.getDssv().forEach(x ->System.out.println(x));
		
		dao.sapxepDSSVTheoDiemtb();
		System.out.println("\n\n Danh sách sinh viên sau khi sắp xếp điểm trung bình");
		dao.getDssv().forEach(x ->System.out.println(x));
		
		dao.ghiFile("data/dssv_object.dat");
	}
}
