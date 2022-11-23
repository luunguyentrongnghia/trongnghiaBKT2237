package com.example.trongnghiabkt2;

public class MainModel {
    String TenKH, Tenthuong,Surl,Dactinh;

    MainModel() {

    }

    public MainModel(String tenKH, String tenthuong, String surl, String dactinh) {
        TenKH = tenKH;
        Tenthuong = tenthuong;
        Surl = surl;
        Dactinh = dactinh;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String tenKH) {
        TenKH = tenKH;
    }

    public String getTenthuong() {
        return Tenthuong;
    }

    public void setTenthuong(String tenthuong) {
        Tenthuong = tenthuong;
    }

    public String getSurl() {
        return Surl;
    }

    public void setSurl(String surl) {
        Surl = surl;
    }

    public String getDactinh() {
        return Dactinh;
    }

    public void setDactinh(String dactinh) {
        Dactinh = dactinh;
    }
}
