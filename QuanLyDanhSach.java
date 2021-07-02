/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLBN;

import java.util.ArrayList;

/**
 *
 * @author Administrator
 */
public class QuanLyDanhSach implements QLBN_Interface{
    public ArrayList<BenhNhan> danhSach;
    public QuanLyDanhSach(){
        this.danhSach = new ArrayList<>();
    }
    @Override
    public ArrayList<BenhNhan> xuatDanhSach() {
        return this.danhSach;
    }

    @Override
    public void them(BenhNhan bn) {
        this.danhSach.add(bn);
    }

    @Override
    public void sua(int viTri, BenhNhan bn) {
        this.danhSach.set(viTri, bn);
    }

    @Override
    public void xoa(int viTri) {
        this.danhSach.remove(viTri);
    }
    
}
