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
public class KhachHang {
    private  String MaKH;
    private String HoTen;
    private LocalDate NgayXHD;
    private double  SoLuong;
    private double DonGia;

    public KhachHang(){}
    
    public KhachHang(String MaKH, String HoTen, LocalDate NgayXHD, double SoLuong, double DonGia) {
        this.MaKH = MaKH;
        this.HoTen = HoTen;
        this.NgayXHD = NgayXHD;
        this.SoLuong = SoLuong;
        this.DonGia = DonGia;
    }

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String MaKH) {
        this.MaKH = MaKH;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public LocalDate getNgayXHD() {
        return NgayXHD;
    }

    public void setNgayXHD(LocalDate NgayXHD) {
        this.NgayXHD = NgayXHD;
    }

    public double getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(double SoLuong) {
        this.SoLuong = SoLuong;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }

    @Override
    public String toString() {
        return "KhachHang: " + "MaKH=" + MaKH + ", HoTen=" + HoTen + ", NgayXHD=" + NgayXHD + ", SoLuong=" + SoLuong + ", DonGia=" + DonGia + '}';
    }
    
    
}
