/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaygd;


/**
 *
 * @author DINH CHAU
 */
public class GiaoDichNha extends GiaoDich{
    private String LoaiNha;
    private String DiaChi;
    
    public GiaoDichNha(){}

    public GiaoDichNha(String MaGD, String NgayGD,String LoaiNha, double DonGia,String DiaChi, double DT) {
        super(MaGD, NgayGD, DonGia, DT);
        this.LoaiNha = LoaiNha;
        this.DiaChi = DiaChi;
    }
    

    public String getLoaiNha() {
        return LoaiNha;
    }

    public void setLoaiNha(String LoaiNha) {
        this.LoaiNha = LoaiNha;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    @Override
    public String toString() {
        return super.toString() + "LoaiNha=" + LoaiNha + ", DiaChi=" + DiaChi + '}';
    }
    
    
    public double tinhThanhTien() {
        double ThanhTien = 0;
        if (LoaiNha.equals("caocap")) {
            ThanhTien = this.getDonGia() * this.getDT();
        } else {
            ThanhTien = this.getDonGia() * this.getDT() * 0.9;
        }
        return ThanhTien;
    }
}
