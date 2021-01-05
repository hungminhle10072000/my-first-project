package com.dtdm.qlsv.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "SINHVIEN")
public class SinhVien {
    @Id
    @Column(name ="ma_SV")
    private int ma_SV;

    @Column(name = "ten_SV")
    private String ten_SV;

    @Column(name="ngay_Sinh")
    private Date ngay_Sinh;

    @Column(name="ten_Lop")
    private String ten_Lop;

    @Column(name="ten_Khoa")
    private String ten_Khoa;

    public SinhVien() {
    }

    public SinhVien(int ma_SV, String ten_SV, Date ngay_Sinh, String ten_Lop, String ten_Khoa) {
        this.ma_SV = ma_SV;
        this.ten_SV = ten_SV;
        this.ngay_Sinh = ngay_Sinh;
        this.ten_Lop = ten_Lop;
        this.ten_Khoa = ten_Khoa;
    }

    public int getMa_SV() {
        return ma_SV;
    }

    public void setMa_SV(int ma_SV) {
        this.ma_SV = ma_SV;
    }

    public String getTen_SV() {
        return ten_SV;
    }

    public void setTen_SV(String ten_SV) {
        this.ten_SV = ten_SV;
    }

    public Date getNgay_Sinh() {
        return ngay_Sinh;
    }

    public void setNgay_Sinh(Date ngay_Sinh) {
        this.ngay_Sinh = ngay_Sinh;
    }

    public String getTen_Lop() {
        return ten_Lop;
    }

    public void setTen_Lop(String ten_Lop) {
        this.ten_Lop = ten_Lop;
    }

    public String getTen_Khoa() {
        return ten_Khoa;
    }

    public void setTen_Khoa(String ten_Khoa) {
        this.ten_Khoa = ten_Khoa;
    }
}
