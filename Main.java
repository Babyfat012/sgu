package giaodien;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		boolean exit = false;
		int choice = -1;
		DanhSachTaiLieu dstl = new DanhSachTaiLieu();
		showMenu();
		Scanner in = new Scanner (System.in);
		while(true) {			
			System.out.println("Nhap lua chon:");
			choice = in.nextInt();
			switch(choice) {
			case 1:
				dstl.them();
				break;
			case 2:
				String tmp1;
				System.out.println("Nhap ten tai lieu can sua:");
				tmp1 = in.nextLine();
				dstl.sua(tmp1);
				break;
			case 3:
				String tmp2;
				System.out.println("Nhap ten tai lieu can sua:");
				tmp2 = in.nextLine();
				dstl.xoa(tmp2);
				break;
			case 4:
				String tmp3;
				System.out.println("Nhap ten tai lieu can tim kiem:");
				tmp3 = in.nextLine();
				dstl.timkiem(tmp3);
				break;
			case 5:
				dstl.hienthidanhsach();
				break;
			case 0:
				System.out.println("Thoat thanh cong!");
				exit = true;
				break;
			default:
				System.out.println("Cac lua chon khong hop le. Hay chon cac so o menu");
				break;
			}
			if(exit) {
				break;
			}
			showMenu();
		}
	}
	public static void showMenu() {
		System.out.println("1. Them tai lieu");
		System.out.println("2. Sua tai lieu");
		System.out.println("3. Xoa tai lieu");
		System.out.println("4. Tim kiem tai lieu theo ten");
		System.out.println("5. Xuat danh sach tai lieu");
		System.out.println("0. Thoat chuong trinh");
		System.out.println("---------------------------------------");
		System.out.println("Xin hay nhap lua chon");
	}
}
