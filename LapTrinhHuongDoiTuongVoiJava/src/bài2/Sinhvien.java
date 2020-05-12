package bài2;

import java.io.Serializable;
import java.time.LocalDate;

public class Sinhvien implements Serializable {
	private String mssv;
	private String hosv;
	private String tensv;
	private String gioitinh;
	private LocalDate ngaysinh;
	private String malop;
	private float diemTB;
	private String heDaotao;
	public Sinhvien(String mssv, String hosv, String tensv, String gioitinh, LocalDate ngaysinh, String malop,
			float diemTB, String heDaotao) {
		super();
		this.mssv = mssv;
		this.hosv = hosv;
		this.tensv = tensv;
		this.gioitinh = gioitinh;
		this.ngaysinh = ngaysinh;
		this.malop = malop;
		this.diemTB = diemTB;
		this.heDaotao = heDaotao;
	}
	public Sinhvien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sinhvien(String mssv) {
		this(mssv,"ho","ten","gt",LocalDate.now(),"ml",0.0f,"he");
	}
	public String getMssv() {
		return mssv;
	}
	public void setMssv(String mssv) throws Exception {
		if(mssv==null)
			throw new Exception ("Không nhập giá trị rỗng");
		if(mssv.length()!=8)
			throw new Exception("Nhập mã số sv phải có 8 kí tự");
		this.mssv = mssv;
	}
	public String getHosv() {
		return hosv;
	}
	public void setHosv(String hosv) throws Exception {
		if(hosv==null)
			throw new Exception ("Không nhập giá trị rỗng");
		this.hosv = hosv;
	}
	public String getTensv() {
		return tensv;
	}
	public void setTensv(String tensv) throws Exception {
		if(tensv==null)
			throw new Exception ("Không nhập giá trị rỗng");
		this.tensv = tensv;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) throws Exception {
		if(gioitinh==null)
			throw new Exception ("Không nhập giá trị rỗng");
		this.gioitinh = gioitinh;
	}
	public LocalDate getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(LocalDate ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public String getMalop() {
		return malop;
	}
	public void setMalop(String malop) throws Exception {
		if(malop==null)
			throw new Exception ("Không nhập giá trị rỗng");
		this.malop = malop;
	}
	public float getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(float diemTB) throws Exception {
		if(diemTB<0)
			throw new Exception ("Không nhập giá trị nhỏ hơn 0");
		if(diemTB>10)
			throw new Exception("Không nhập giá trị lớn hơn 10");
		this.diemTB = diemTB;
	}
	public String getHeDaotao(){
		return heDaotao;
	}
	public void setHeDaotao(String heDaotao) throws Exception  {
		if(heDaotao==null)
			throw new Exception ("Không nhập giá trị rỗng");
		this.heDaotao = heDaotao;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mssv == null) ? 0 : mssv.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sinhvien other = (Sinhvien) obj;
		if (mssv == null) {
			if (other.mssv != null)
				return false;
		} else if (!mssv.equals(other.mssv))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return mssv + "; " + hosv + "; " + tensv + "; " + gioitinh + "; " + ngaysinh + "; " + malop + "; " + diemTB
				+ "; " + heDaotao;
	}
	
}
