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
public interface QLBN_Interface {
    public ArrayList<BenhNhan> xuatDanhSach();
    public void them(BenhNhan bn);
    public void sua(int viTri, BenhNhan bn);
    public void xoa(int viTri);
}
