package giaodien;

import java.util.Scanner;
public class Sach extends TaiLieu {
	private String tacgia;
	private int sotrang;
	public Sach() {
		ten = "a";
		tacgia = "";
		sotrang = -1;
	}
	
	public Sach(String ten, String tacgia, int sotrang) {
		this.ten = ten;
		this.tacgia = tacgia;
		this.sotrang = sotrang;
	}
	
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner (System.in);
		System.out.println("Nhap ten tac gia:");
		tacgia = sc.nextLine();
		System.out.println("Nhap so trang:");
		sotrang = sc.nextInt();
	}
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("Tac gia:" + this.tacgia);
		System.out.println("So trang:" + this.sotrang);		
	}
	public void setTenTacGia(String tentacgia) { 
		this.tacgia = tentacgia;
	}
	public String getTenTacGia() {
		return tacgia;
	}
	public void setSoTrang(int sotrang) {
		this.sotrang = sotrang;
	}
	public int getSoTrang() {
		return sotrang;
	}
}

	