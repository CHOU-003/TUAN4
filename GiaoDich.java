/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaygd;


/**
 *
 * @author DINH CHAU
 */
public class GiaoDich {
    private String MaGD;
    private String NgayGD;
    private double DonGia;
    private double DT;

    public GiaoDich() {}
    
    public GiaoDich(String MaGD, String NgayGD, double DonGia, double DT) {
        this.MaGD = MaGD;
        this.NgayGD = NgayGD;
        this.DonGia = DonGia;
        this.DT = DT;
    }
      
    public String getMaGD() {
        return MaGD;
    }

    public void setMaGD(String MaGD) {
        this.MaGD = MaGD;
    }


    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double DonGia) {
        this.DonGia = DonGia;
    }

    public double getDT() {
        return DT;
    }

    public void setDT(double DT) {
        this.DT = DT;
    }

    @Override
    public String toString() {
        return "MaGD=" + MaGD + ", NgayGD=" + NgayGD + ", DonGia=" + DonGia + ", DT=" + DT ;
    }
    
}
