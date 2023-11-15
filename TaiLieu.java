package giaodien;

import java.util.Scanner;
public class TaiLieu implements IXuat {
	String ten;
	public void xuat() {
		System.out.println("Ten tai lieu:" + ten);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ten tai lieu:");
		this.ten = sc.nextLine();
	}
	public void setName(String name) {
		this.ten = name;
	}
	public String getName() {
		return ten;
	}
}


