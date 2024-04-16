package com.techja.gallery.media;

public abstract class Media {
    String id, ten, loai, size;

    public Media(String id, String ten, String loai, String size) {
        this.id = id;
        this.ten = ten;
        this.loai = loai;
        this.size = size;
    }

    public void inTT() {
        System.out.println("Id: " + id);
        System.out.println("Ten: " + ten);
        System.out.println("Loai: " + loai);
        System.out.println("Size: " + size);
    }

    public String getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public String getLoai() {
        return loai;
    }

    public String getSize() {
        return size;
    }
}
