package com.example.asm_sunrise.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    public DbHelper(Context context) {
        super(context, "JOB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String User = "create table NGUOIDUNG(tendangnhap text primary key autoincrement,matkhau text,sodienthoai integer)";
                db.execSQL(User);

        String Job = "create table CONGVIEC(id integer primary key autoincrement,vitrituyendung text,tencongty text," +
                "tinh text,kinhnghiem text, luong text,thoigiantuyendungconlai text)";
        db.execSQL(Job);
        String dataJob = "insert into CONGVIEC(vitrituyendung,tencongty,tinh,kinhnghiem,luong,thoigiantuyendungconlai) values" +
                "('Nhân viên phục vụ','Caffe Holo','Hồ Chí Minh','1 năm','10 triệu','Thời gian tuyển dụng còn lại 14 ngày')," +
                "('Nhân viên phục vụ','Caffe Holo','Hồ Chí Minh','1 năm','10 triệu','Thời gian tuyển dụng còn lại 14 ngày')," +
                "('Nhân viên phục vụ','Caffe Holo','Hồ Chí Minh','1 năm','10 triệu','Thời gian tuyển dụng còn lại 14 ngày')," +
                "('Nhân viên phục vụ','Caffe Holo','Hồ Chí Minh','1 năm','10 triệu','Thời gian tuyển dụng còn lại 14 ngày')," +
                "('Nhân viên phục vụ','Caffe Holo','Hồ Chí Minh','1 năm','10 triệu','Thời gian tuyển dụng còn lại 14 ngày')";
                db.execSQL(dataJob);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists NGUOIDUNG");
        db.execSQL("drop table if exists CONGVIEC");

    }
    public void register(String tendannhap, String matkhau, int sodienthoai){
        ContentValues values = new ContentValues();
        values.put("tendanggnhap",tendannhap);
        values.put("matkhau",matkhau);
        values.put("sodienthoai",sodienthoai);
        SQLiteDatabase db = getWritableDatabase();
        db.insert("NGUOIDUNG",null,values);
        db.close();
    }
    public int login (String tendannhap, String matkhau){
        int result = 0;
        String str[] = new String[2];
        str[1] = tendannhap;
        str[2] = matkhau;
        SQLiteDatabase db = getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from NGUOIDUNG where tendangnhap =? and matkhau =?",str);
        if (cursor.moveToNext()){
            result =1;
        }
        return result;
    }
    public boolean checkUserName (String tendangnhap){
        SQLiteDatabase db = getWritableDatabase();
        Cursor cursor = db.rawQuery("select * from NGUOIDUNG where tendangnhap =?",new String[]{tendangnhap});
        if (cursor.getCount()>0){
            return true;
        }else {
            return false;
        }
    }
}
