package com.example.asm_sunrise.model;

public class CONGVIEC {
    private String viTrituyenDung;
    private String tenCongTy;
    private String tinh;
    private String kinhNghiem;
    private String luong;
    private String thoiGianTuyenDungConLai;

    public CONGVIEC() {
    }

    public CONGVIEC(String viTrituyenDung, String tenCongTy, String tinh, String kinhNghiem, String luong, String thoiGianTuyenDungConLai) {
        this.viTrituyenDung = viTrituyenDung;
        this.tenCongTy = tenCongTy;
        this.tinh = tinh;
        this.kinhNghiem = kinhNghiem;
        this.luong = luong;
        this.thoiGianTuyenDungConLai = thoiGianTuyenDungConLai;
    }

    public String getViTrituyenDung() {
        return viTrituyenDung;
    }

    public void setViTrituyenDung(String viTrituyenDung) {
        this.viTrituyenDung = viTrituyenDung;
    }

    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    public String getTinh() {
        return tinh;
    }

    public void setTinh(String tinh) {
        this.tinh = tinh;
    }

    public String getKinhNghiem() {
        return kinhNghiem;
    }

    public void setKinhNghiem(String kinhNghiem) {
        this.kinhNghiem = kinhNghiem;
    }

    public String getLuong() {
        return luong;
    }

    public void setLuong(String luong) {
        this.luong = luong;
    }

    public String getThoiGianTuyenDungConLai() {
        return thoiGianTuyenDungConLai;
    }

    public void setThoiGianTuyenDungConLai(String thoiGianTuyenDungConLai) {
        this.thoiGianTuyenDungConLai = thoiGianTuyenDungConLai;
    }
}
