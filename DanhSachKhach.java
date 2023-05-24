/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runnguoi;

import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
/**
 *
 * @author DINH CHAU
 */
public class DanhSachKhach {
    Scanner sc = new Scanner(System.in);
    ArrayList<KhachHang> menu = new ArrayList<>();
    
    public void Nhap(int n) {
    int chon;

    for(int i=0; i<n;i++) {
        System.out.println("0. THOAT !!!");
        System.out.println("1. Nhap khach hang viet nam vao danh sach.");
        System.out.println("2. Nhap khach hang nuoc ngoai vao danh sach.");
        chon = sc.nextInt();
        sc.nextLine();
        if (chon == 1) {
            System.out.print("Nhap ma kh: ");
            String MaKH = sc.nextLine();
            System.out.print("Nhap ho va ten kh: ");
            String HoTen= sc.nextLine();
            System.out.print("Nhap doi tuong kh: ");
            String DTKH = sc.nextLine();
            System.out.print("Nhap so luong: ");
            double SoLuong = sc.nextDouble();
            System.out.print("Nhap DON GIA: ");
            double DonGia = sc.nextDouble();sc.nextLine();
            System.out.print("Nhap dinh muc: ");
            double DinhMuc = sc.nextDouble();
            KhachHangVN vn = new KhachHangVN(DTKH, DinhMuc, MaKH, HoTen, LocalDate.now(), SoLuong, DonGia);
            menu.add(vn);
            
        }
        else if (chon == 2) {
            System.out.print("Nhap ma kh: ");
            String MaKH = sc.nextLine();
            System.out.print("Nhap ho va ten kh: ");
            String HoTen= sc.nextLine();
            System.out.print("Nhap quoc tich kh: ");
            String DTKH = sc.nextLine();
            System.out.print("Nhap so luong: ");
            double SoLuong = sc.nextDouble();
            System.out.print("Nhap DON GIA: ");
            double DonGia = sc.nextDouble();sc.nextLine();
            KhachNuocNgoai ng = new KhachNuocNgoai(DTKH, DonGia, MaKH, HoTen, LocalDate.now(), SoLuong, DonGia);
            menu.add(ng);
        }else if (chon == 0) {
            break;
        } else {
            System.out.println("Tiep tuc!");
            i--;
        }
    }
    }
    
    public void xuat() {
        	 System.out.println( String.format("| %-15s | %-25s | %-15s | %-20s | %-20s | %n", "Ma GD", "Don gia", "Loai",
                     "Dien Tich", "Thanh Tien") + 
                     "================================================================================================================================"+ "\n");
            for (KhachHang ol : menu) {
                System.out.println(ol);
            }
    }
    
    public void SoLuongLoai() {
    int soLuongKVN = 0;
    int soLuongKNN = 0;
    for (KhachHang gd : menu) {
        if (gd instanceof KhachHangVN) {
            soLuongKVN++;
        } else if (gd instanceof KhachNuocNgoai) {
            soLuongKNN++;
        }
    }
    System.out.println("So luong giao dich dat: " + soLuongKVN);
    System.out.println("So luong giao dich nha: " + soLuongKNN);
    }
    
    public void tinhTrungBinhDat() {
    double tongKhachNN = 0;
    int soLuongNN = 0;
    for (KhachHang gd : menu) {
        if (gd instanceof KhachNuocNgoai) {
            tongKhachNN += ((KhachNuocNgoai) gd).getThanhTien();
            soLuongNN++;
        } 
    }
    double trungKhachNN = tongKhachNN / soLuongNN;
    System.out.println("Trung binh thanh tien giao dich dat: " + trungKhachNN);
    }
}
