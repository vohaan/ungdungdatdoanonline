package com.example.appfoodnew.Presenter;

public interface IHoaDon {
    void getDataHD(String id, String uid, String diachi, String hoten, String ngaydat, String phuongthuc, String sdt, Long tongtien,Long type);

    void OnSucess();

    void OnFail();
}
