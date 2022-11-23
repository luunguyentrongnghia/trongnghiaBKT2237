package com.example.trongnghiabkt2;

public class MainModel1 {
    String TenKH, Tenthuong,Surl,Dactinh,Congdung,Lieudung;

    MainModel1() {

    }

    public MainModel1(String tenKH, String tenthuong, String surl, String dactinh, String congdung, String lieudung) {
        TenKH = tenKH;
        Tenthuong = tenthuong;
        Surl = surl;
        Dactinh = dactinh;
        Congdung = congdung;
        Lieudung = lieudung;
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

    public String getCongdung() {
        return Congdung;
    }

    public void setCongdung(String congdung) {
        Congdung = congdung;
    }

    public String getLieudung() {
        return Lieudung;
    }

    public void setLieudung(String lieudung) {
        Lieudung = lieudung;
    }
}
