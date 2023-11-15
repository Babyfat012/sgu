package giaodien;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class DanhSachTaiLieu {
	int n;
	TaiLieu[] ds;
	Scanner sc = new Scanner(System.in);
	public DanhSachTaiLieu() {
		n = 0;
		ds = new TaiLieu[0];
	}
	public DanhSachTaiLieu(int n, TaiLieu[] ds) {
			this.n = n;	
			this.ds = Arrays.copyOf(ds, n);
	}
	
	public void them() {
		int choiceTaiLieu;
		System.out.println("Nhap loai tai lieu can them:");
		System.out.println("1. Sach");
		System.out.println("2. Dia");
		choiceTaiLieu = sc.nextInt();
		sc.nextLine();
		switch(choiceTaiLieu) {
		case 1: 
			ds = Arrays.copyOf(ds, n+1);
			ds[n] = new Sach();
			ds[n].nhap();
			n++;
			break;
			
		case 2: 
			ds = Arrays.copyOf(ds, n+1);
			ds[n] = new Dia();
			ds[n].nhap();
			n++;
			break;
		default: 
			System.out.println("Nhap sai loai tai lieu.");
		}
	}
	
	public void sua(String ten) {
		// ham sua tai lieu theo ten tai lieu
		for(int i = 0; i < n; i++) {
			if(ds[i].getName().equals(ten)) {
				ds[i].nhap();
			}
		}
	}
	
	public void xoa (String ten) { 
		for(int i = 0; i< n; i++) {
			if(ds[i].getName().equals(ten)) {
				for(int j = i; j<n-1; j++) {
					ds[j] = ds[j+1];
				}
				ds = Arrays.copyOf(ds, n-1);
				n--;
				break;
			}
		}
	}
	
	public void timkiem(String ten) {
		for(int i = 0; i < n; i++) {
			if(ds[i].getName().equals(ten)) {
				ds[i].xuat();
			}
		}
	}
	
	public void hienthidanhsach() {
		for(int i = 0; i < n; i++) {
			ds[i].xuat();
		}
	}	
}
	
