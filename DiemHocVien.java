/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chaydiemthi;

import java.time.LocalDate;
import java.util.Locale;

/**
 *
 * @author DINH CHAU
 */
public class DiemHocVien {
    private String HoTen;
    private LocalDate NamSinh;
    private double DiemToan;
    private double DiemSinh;
    private double DiemHoa;
    private double DiemAnh;
    private double DiemVan;
    
    public DiemHocVien(){}

    public DiemHocVien(String HoTen, LocalDate NamSinh, double DiemToan, double DiemSinh, double DiemHoa, double DiemAnh, double DiemVan) {
        this.HoTen = HoTen;
        this.NamSinh = NamSinh;
        this.DiemToan = DiemToan;
        this.DiemSinh = DiemSinh;
        this.DiemHoa = DiemHoa;
        this.DiemAnh = DiemAnh;
        this.DiemVan = DiemVan;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public LocalDate getNamSinh() {
        return NamSinh;
    }

    public void setNamSinh(LocalDate NamSinh) {
        this.NamSinh = NamSinh;
    }

    public double getDiemToan() {
        return DiemToan;
    }

    public void setDiemToan(double DiemToan) {
        this.DiemToan = DiemToan;
    }

    public double getDiemSinh() {
        return DiemSinh;
    }

    public void setDiemSinh(double DiemSinh) {
        this.DiemSinh = DiemSinh;
    }

    public double getDiemHoa() {
        return DiemHoa;
    }

    public void setDiemHoa(double DiemHoa) {
        this.DiemHoa = DiemHoa;
    }

    public double getDiemAnh() {
        return DiemAnh;
    }

    public void setDiemAnh(double DiemAnh) {
        this.DiemAnh = DiemAnh;
    }

    public double getDiemVan() {
        return DiemVan;
    }

    public void setDiemVan(double DiemVan) {
        this.DiemVan = DiemVan;
    }

    @Override
    public String toString() {
        return "DiemHocVien{" + "HoTen=" + HoTen + ", NamSinh=" + NamSinh + ", DiemToan=" + DiemToan + ", DiemSinh=" + DiemSinh + ", DiemHoa=" + DiemHoa + ", DiemAnh=" + DiemAnh + ", DiemVan=" + DiemVan + '}';
    }
    
    
}
