package com.techja.gallery.media;

public class Video extends Media {
    String thoiLuong;

    public Video(String id, String ten, String loai, String size, String thoiLuong) {
        super(id, ten, loai, size);
        this.thoiLuong = thoiLuong;
    }

    @Override
    public void inTT() {
        super.inTT();
        System.out.println("Thoi luong: " + thoiLuong);
    }

    void play() {
        System.out.println("Play video." );
    }
}
