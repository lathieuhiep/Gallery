package com.techja.gallery.album;

import com.techja.gallery.media.HinhAnh;
import com.techja.gallery.media.Media;
import com.techja.gallery.media.Video;

public class Album {
    String ma, ten, ngayTao;
    Media dsMedia[]
    HinhAnh dsHA[];
    Video dsVideo[];

    public Album(String ma, String ten, String ngayTao) {
        this.ma = ma;
        this.ten = ten;
        this.ngayTao = ngayTao;
    }

    void themMedia(Media media) {}

    void suaMedia(String maMedia) {}

    void xoaMedia(String maMedia) {}

    Media[] timKiemMedia(String gTriTen) {
        Media[] kq = null;

        return kq;
    }

    void thuPhongAnh(Media maMedia, double tyLe) {
        // tim trong Media, neu dsMedia->getId() = maMedia thi HinhAnh->thuPhong(tyLe)
    }

    void xoayHA(Media maMedia, int gocXoay) {
        // tim trong Media, neu dsMedia->getId() = maMedia thi HinhAnh->xoay(gocXoay)
    }

    void playVideo(Media maMedia) {
        // tim trong Media, neu dsMedia->getId() == maMedia
        // thi chay video
    }

    void inTT() {
        System.out.println("Ma:" + ma);
        System.out.println("Ten:" + ten);
        System.out.println("NgayTao:" + ngayTao);
    }
}
