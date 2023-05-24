/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runnguoi;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author DINH CHAU
 */
public class RunNguoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        DanhSachKhach gg = new DanhSachKhach();
        int chon = 0;
        
        do {
            System.out.println("-----------DANH SACH Giao Dich----------");
            System.out.println("Chon chuc nang");
            System.out.println("0. Thoat khoi man hinh nhap.\n"
            + "1. Them giao dich.\n"
            + "2. Xuat cac giao dich.\n"
            + "3. Tong loai giao dich. \n"
            + "4. Trung binh tien giao dich.\n");
            System.out.print("Lua chon cua ban la: ");
          chon = sc.nextInt();
          sc.nextLine();
          
          if(chon == 0){}
          else if(chon ==1){     
              gg.Nhap(chon);
          }
          else if(chon ==2){
              gg.xuat();
          }    
          else if(chon ==3){
              gg.SoLuongLoai();
			}
          else if(chon ==4){
              gg.tinhTrungBinhDat();
          }
          
        } while (chon !=0);
    }
    
}
