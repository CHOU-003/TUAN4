/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaydiemthi;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author DINH CHAU
 */
public class DanhSachSV {
    Scanner sc = new Scanner(System.in);
    ArrayList<DiemHocVien> menu = new ArrayList<>();
    
     public void Nhap(int n) {
    int chon;

    for(int i=0; i<n;i++) {
        System.out.println("0. THOAT !!!");
        System.out.println("1. Nhap diem hoc vien vao danh sach.");
        chon = sc.nextInt();
        sc.nextLine();
        if (chon == 1) {
            System.out.print("Nhap ho va ten hoc virn: ");
            String HoTen= sc.nextLine();
            System.out.print("Nhap diem toan: ");
            double DiemToan = sc.nextDouble();
            System.out.print("Nhap diem sinh: ");
            double DiemSinh = sc.nextDouble();
            System.out.print("Nhap diem hoa: ");
            double DiemHoa = sc.nextDouble();
            System.out.print("Nhap diem anh: ");
            double DiemAnh = sc.nextDouble();
            System.out.print("Nhap diem van: ");
            double DiemVan = sc.nextDouble();
            DiemHocVien dv = new DiemHocVien(HoTen, LocalDate.now(), DiemToan, DiemSinh, DiemHoa, DiemAnh, DiemVan);
            menu.add(dv);
        }else if (chon == 0) {
            break;
        } else {
            System.out.println("Tiep tuc!");
            i--;
        }
    }
    }
     
     public void xuat() {
            for (DiemHocVien ol : menu) {
                System.out.println(ol);
            }
    }
     
    public void Ketqua(){
        double DiemTB = 0;
    for (DiemHocVien gd : menu) {
           DiemTB = (gd.getDiemHoa() + gd.getDiemHoa() + gd.getDiemSinh() + gd.getDiemToan() + gd.getDiemVan())/5;
     }
    if(DiemTB >= 7){
        System.out.println("Cac hoc vien duoc lam luan van.");
        this.xuat();
    } else if(DiemTB < 7 && DiemTB >=5){
        System.out.println("Cac hoc vỉn được thi tot nghiep.");
        this.xuat();
    } else{
        System.out.println("Cac hoc vien thi lai.");
        this.xuat();
    }
    }
     
     
}