/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runnguoi;

import java.time.LocalDate;

/**
 *
 * @author DINH CHAU
 */
public class KhachHangVN extends KhachHang{
    private String DTKH;
    private double  DinhMuc;
    
    public KhachHangVN(){}

    public KhachHangVN(String DTKH, double DinhMuc, String MaKH, String HoTen, LocalDate NgayXHD, double SoLuong, double DonGia) {
        super(MaKH, HoTen, NgayXHD, SoLuong, DonGia);
        this.DTKH = DTKH;
        this.DinhMuc = DinhMuc;
    }

    public String getDTKH() {
        return DTKH;
    }

    public void setDTKH(String DTKH) {
        this.DTKH = DTKH;
    }

    public double getDinhMuc() {
        return DinhMuc;
    }

    public void setDinhMuc(double DinhMuc) {
        this.DinhMuc = DinhMuc;
    }

    @Override
    public String toString() {
        return super.toString() + "DTKH=" + DTKH + ", DinhMuc=" + DinhMuc + '}';
    }
    
     public double tinhThanhTien() {
        double ThanhTien = 0;
        if (this.getSoLuong() < this.DinhMuc) {
            ThanhTien = this.getSoLuong() * this.getDonGia();
        } else {
            ThanhTien = this.getSoLuong()*this.getDonGia()*this.getDinhMuc() + (this.getSoLuong()-this.getDinhMuc())*this.getDonGia()*2.5;
        }
        return ThanhTien;
    }
}
