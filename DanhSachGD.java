/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaygd;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author DINH CHAU
 */
public class DanhSachGD {
    Scanner sc = new Scanner(System.in);
    ArrayList<GiaoDich> ds = new ArrayList<>();
    
    public void Nhap(int n) {
    int chon;

    for(int i=0; i<n;i++) {
        System.out.println("0. THOAT !!!");
        System.out.println("1. Nhap giao dich dat vao danh sach.");
        System.out.println("2. Nhap giao dich nha vao danh sach.");
        chon = sc.nextInt();
        sc.nextLine();
        if (chon == 1) {
            System.out.print("Nhap ma GD: ");
            String MaGD = sc.nextLine();
            System.out.print("Nhap ngay CD (dd/MM/yyyy): ");
            String NgayGD = sc.nextLine();
            System.out.print("Nhap DON GIA: ");
            double Dongia = sc.nextDouble();sc.nextLine();
            System.out.print("Nhap loai dat: ");
            String LoaiDat = sc.nextLine();
            System.out.println("Nhap Dien Tich: ");
            double DT = sc.nextDouble();
            GiaoDichDat gd = new  GiaoDichDat(LoaiDat, MaGD, NgayGD, Dongia, DT, Dongia);
            ds.add(gd);
            
        }
        if (chon == 2) {
            System.out.print("Nhap ma GD: ");
            String MaGD = sc.nextLine();
            System.out.print("Nhap ngay CD: ");
            String NgayGD = sc.nextLine();
            System.out.print("Nhap DON GIA: ");
            double Dongia = sc.nextDouble();sc.nextLine();
            System.out.print("Nhap loai nha: ");
            String LoaiNha = sc.nextLine();
            System.out.println("Nhap dia chi: ");
            String DiaChi = sc.nextLine();
            System.out.println("Nhap Dien Tich: ");
            double DT = sc.nextDouble();
            GiaoDichNha gn = new GiaoDichNha(MaGD, NgayGD, LoaiNha, Dongia, DiaChi, DT);
            ds.add(gn);
        }else if (chon == 0) {
            break;
        } else {
            System.out.println("Nhap sai, vui long nhap lai!");
            i--;
        }
    }
    }
    
    public void xuat() {
        	 System.out.println( String.format("| %-15s | %-25s | %-15s | %-20s | %-20s | %n", "Ma GD", "Don gia", "Loai",
                     "Dien Tich", "Thanh Tien") + 
                     "================================================================================================================================"+ "\n");
            for (GiaoDich ol : ds) {
                System.out.println(ol);
            }
    }
   
    public void tinhTrungBinhDat() {
    double tongDat = 0;
    int soLuongDat = 0;
    for (GiaoDich gd : ds) {
        if (gd instanceof GiaoDichDat) {
            tongDat += ((GiaoDichDat) gd).getThanhTien();
            soLuongDat++;
        } 
    }
    double trungBinhDat = tongDat / soLuongDat;
    System.out.println("Trung binh thanh tien giao dich dat: " + trungBinhDat);
    }
    
    public void SoLuongLoai() {
    int soLuongDat = 0;
    int soLuongNha = 0;
    for (GiaoDich gd : ds) {
        if (gd instanceof GiaoDichDat) {
            soLuongDat++;
        } else if (gd instanceof GiaoDichNha) {
            soLuongNha++;
        }
    }
    System.out.println("So luong giao dich dat: " + soLuongDat);
    System.out.println("So luong giao dich nha: " + soLuongNha);
}
    
}

