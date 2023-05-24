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
public class KhachNuocNgoai extends KhachHang{
    private String QuocTich;
    private double  ThanhTien;
    
    public KhachNuocNgoai(){}

    public KhachNuocNgoai(String QuocTich, double ThanhTien, String MaKH, String HoTen, LocalDate NgayXHD, double SoLuong, double DonGia) {
        super(MaKH, HoTen, NgayXHD, SoLuong, DonGia);
        this.QuocTich = QuocTich;
        this.ThanhTien = ThanhTien;
    }

    public String getQuocTich() {
        return QuocTich;
    }

    public void setQuocTich(String QuocTich) {
        this.QuocTich = QuocTich;
    }

    public double getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(double ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    @Override
    public String toString() {
        return super.toString() + "QuocTich=" + QuocTich + ", ThanhTien=" + ThanhTien + '}';
    }
    
    public void TinhTien() {
        this.ThanhTien = this.getSoLuong() * this.getDonGia();
    }
}
