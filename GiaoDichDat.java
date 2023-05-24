/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaygd;

/**
 *
 * @author DINH CHAU
 */
public class GiaoDichDat extends GiaoDich {
    private String LoaiDat;
    private double ThanhTien;
    
    public GiaoDichDat (){}

    public GiaoDichDat(String LoaiDat, String MaGD, String NgayGD, double DonGia, double DT, double ThanhTien) {
        super(MaGD, NgayGD, DonGia, DT);
        this.LoaiDat = LoaiDat;
        this.ThanhTien = ThanhTien;
    }

    public String getLoaiDat() {
        return LoaiDat;
    }

    public void setLoaiDat(String LoaiDat) {
        this.LoaiDat = LoaiDat;
    }

    public double getThanhTien() {
        return ThanhTien;
    }

    public void setThanhTien(double ThanhTien) {
        this.ThanhTien = ThanhTien;
    }

    @Override
    public String toString() {
    return super.toString() +
        "LoaiDat=" + LoaiDat +
        ", ThanhTien=" + ThanhTien +
        '.';
    }

    
    public void TinhTien() {
        if (this.LoaiDat.equals("A")) {
            this.ThanhTien = this.getDonGia() * this.getDT() * 1.5;
        } else {
            this.ThanhTien = this.getDonGia() * this.getDT();
        }
    }
    
}
