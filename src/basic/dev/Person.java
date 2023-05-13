package basic.dev;

public class Person {
	private String ten;
	private int tuoi;
	private String thanhPho;
	private double thunhap;

	public Person(String ten, int tuoi, String thanhPho, double thunhap) {
		super();
		this.ten = ten;
		this.tuoi = tuoi;
		this.thanhPho = thanhPho;
		this.thunhap = thunhap;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getThanhPho() {
		return thanhPho;
	}

	public void setThanhPho(String thanhPho) {
		this.thanhPho = thanhPho;
	}

	public double getThunhap() {
		return thunhap;
	}

	public void setThunhap(double thunhap) {
		this.thunhap = thunhap;
	}

	@Override
	public String toString() {
		return "[ten=" + ten + ", tuoi=" + tuoi + ", thanhPho=" + thanhPho + ", thunhap=" + thunhap + "]";
	}

	
}
