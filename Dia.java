package giaodien;

import java.util.Scanner;
public class Dia extends TaiLieu {
	private int dungluong;
	public Dia() {
		ten = "a";
		dungluong = 0;
	}
	public Dia(String ten, int dungluong) {
		this.ten = ten;
		this.dungluong = dungluong;
	}
	public void nhap() {
		super.nhap();
		Scanner inp = new Scanner(System.in);
		System.out.println("Nhap dung luong cua dia:");
		dungluong = inp.nextInt();
	}
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("Dung luong:" + this.dungluong);
	}
	public int getDungLuong() {
		return dungluong;
	}
	public void setDungLuong(int dungluong) {
		this.dungluong = dungluong;
	}
}
