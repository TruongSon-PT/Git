/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLBN;

import java.io.Serializable;

/**
 *
 * @author Administrator
 */
public class BenhNhanRaVien extends BenhNhan implements Serializable{
    private String ngayRaVien;
    private String lyDoRaVien;
    private Integer vienPhi;

    public BenhNhanRaVien() {
    }

    public BenhNhanRaVien(String ngayRaVien, String lyDoRaVien, Integer vienPhi, String maBA, String hoTen, String gioiTinh, String ngaySinh, String chanDoan, String ngayNhapVien, String tinhTrang) {
        super(maBA, hoTen, gioiTinh, ngaySinh, chanDoan, ngayNhapVien, tinhTrang);
        this.ngayRaVien = ngayRaVien;
        this.lyDoRaVien = lyDoRaVien;
        this.vienPhi = vienPhi;
    }

    public String getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(String ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }

    public String getLyDoRaVien() {
        return lyDoRaVien;
    }

    public void setLyDoRaVien(String lyDoRaVien) {
        this.lyDoRaVien = lyDoRaVien;
    }

    public Integer getVienPhi() {
        return vienPhi;
    }

    public void setVienPhi(Integer vienPhi) {
        this.vienPhi = vienPhi;
    }
    
}
