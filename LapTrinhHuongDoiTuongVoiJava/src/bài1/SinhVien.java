package bài1;

import java.time.LocalDate;

public class SinhVien{
	private String mssv;
	private String hosv;
	private String tensv;
	private String gioitinh;
	private LocalDate ngaysinh;
	private String malop;
	private float diemTB;
	private String heDaotao;
	public SinhVien(String mssv, String hosv, String tensv, String gioitinh, LocalDate ngaysinh, String malop,
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
	public SinhVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public SinhVien(String mssv) {
		this(mssv,"ho","ten","gt",LocalDate.now(),"ml",0.0f,"he");
	}
	public String getMssv() {
		return mssv;
	}
	public void setMssv(String mssv) {
		this.mssv = mssv;
	}
	public String getHosv() {
		return hosv;
	}
	public void setHosv(String hosv) {
		this.hosv = hosv;
	}
	public String getTensv() {
		return tensv;
	}
	public void setTensv(String tensv) {
		this.tensv = tensv;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
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
	public void setMalop(String malop) {
		this.malop = malop;
	}
	public float getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}
	public String getHeDaotao() {
		return heDaotao;
	}
	public void setHeDaotao(String heDaotao) {
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
		SinhVien other = (SinhVien) obj;
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
