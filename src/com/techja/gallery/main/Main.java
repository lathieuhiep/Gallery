package com.techja.gallery.main;

import com.techja.gallery.media.HinhAnh;
import com.techja.gallery.media.Video;

public class Main {
    public static void main(String[] args) {
        // hinh anh
        HinhAnh hinhAnh = new HinhAnh(
                "Anh01",
                "Anh 1",
                "PNG",
                "1024M",
                "HD"
        );

        System.out.println("=> Thong tin hinh anh:");
        hinhAnh.inTT();

        // video
        Video video = new Video(
                "Video01",
                "Video 1",
                "MP4",
                "2048M",
                "5 phut"
        );
        System.out.println("=> Thong tin video:");
        video.inTT();
    }
}
