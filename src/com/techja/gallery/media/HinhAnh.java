package com.techja.gallery.media;

public class HinhAnh extends Media {
    String doPhanGiai;

    public HinhAnh(String id, String ten, String loai, String size, String doPhanGiai) {
        super(id, ten, loai, size);
        this.doPhanGiai = doPhanGiai;
    }

    public void thuPhong(double tyLe) {
        System.out.println("Thu phong anh." );
    }

    public void xoay(int gocXoay) {
        System.out.println("Xoay anh." );
    }

    @Override
    public void inTT() {
        super.inTT();
        System.out.println("Do phan giai: " + doPhanGiai );
    }
}
