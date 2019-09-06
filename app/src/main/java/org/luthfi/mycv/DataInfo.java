package org.luthfi.mycv;

import java.util.ArrayList;

public class DataInfo {

    public static String[] [] data = new String[][] {
            {"Button", "Button salah satu komponen sebuah interface yang sudah biasa digunakan. Dengan sebuah Button pengguna dapat memerintahkan aplikasi untuk melakukan aksi yang telak di tentukan. " ,"https://www.technologycake.com/wp-content/uploads/2016/08/android.png"},
            {"Relative Layout", "Relative Layout adalah layout yang berfungsi untuk mengatur tata letak komponen atau widget aplikasi android dengan cara relative secara bebas, tidak hanya vertikal atau horisontal saja seperti pada Linear Layout." ,"https://www.technologycake.com/wp-content/uploads/2016/08/android.png"},
            {"Linear Layout", "Linear Layout adalah layout yang mengatur semua elemen di dalamnya dalam satu arah, horisontal atau vertical." ,"https://www.technologycake.com/wp-content/uploads/2016/08/android.png"},
            {"Text View", "Text View adalah isi teks yang akan tampilkan di layar." ,"https://www.technologycake.com/wp-content/uploads/2016/08/android.png"},
            {"Image View", "Image View adalah isi gambar yang akan di tampilkan di layar." ,"https://www.technologycake.com/wp-content/uploads/2016/08/android.png"},
            {"Scroll View", "Scroll View adalah jika aplikasi memiliki konten layout yang lebih panjang dari tinggi perangkat Android, maka konten tersebut harus dibuat agar dapat di scroll secara vertikal" ,"https://www.technologycake.com/wp-content/uploads/2016/08/android.png"},
            {"Circle Image View", "Circle Image View yang berfungsi membulatkan gambar yang kita tentukan." ,"https://www.technologycake.com/wp-content/uploads/2016/08/android.png"},
            {"Recycler View", "Recycler View berfungsi view yang mempu menghandle sebuah set data yang berjumlah besar." ,"https://www.technologycake.com/wp-content/uploads/2016/08/android.png"},
            {"Card View", "Card View merupakan view paketan dari Material Design diperkenalkan Android Versi Lolipop. Bentuk view ini biasa digunakan untuk pembungkusan atau penarik data." ,"https://www.technologycake.com/wp-content/uploads/2016/08/android.png"},
            {"Web View", "Glide adalah sebuah class di Android yang dapat menampilkan tampilan peramban web pada aplikasi Android." ,"https://www.technologycake.com/wp-content/uploads/2016/08/android.png"},
            {"Glide", "Glide adalah mengambil ID dari XML." ,"https://www.technologycake.com/wp-content/uploads/2016/08/android.png"},
            {"Fragments", "Fragment adalah sebuah bagian dari user interface atau perilaku sebuah aplikasi yang dapat ditempatkan pada activity yang memungkinkan untuk mendesain activity yang modular." ,"https://www.technologycake.com/wp-content/uploads/2016/08/android.png"},
            {"Progress Bar", "Progress Bar adalah widget yang berguna untuk menampilkan suatu pemrosesan dalam bentuk bar. Widget ini biasanya digunakan ketika kita membuka halaman Aplikasi dan mengunduk atau mengunggah sebuah file pada perangkat Android." ,"https://www.technologycake.com/wp-content/uploads/2016/08/android.png"},
            {"Tab Layout", "Tab Layout adalah salah satu komponen yang diperkenalkan sebagai bagian dari artefak desain material." ,"https://www.technologycake.com/wp-content/uploads/2016/08/android.png"},
            {"View Pager", "View Pager adalah menampilkan fragment." ,"https://www.technologycake.com/wp-content/uploads/2016/08/android.png"},
            {"Intent", "Intent adalah sebuah kelas dalam programming Android yang berfungsi untuk perpindahan halaman." ,"https://www.technologycake.com/wp-content/uploads/2016/08/android.png"},


    };

    public  static ArrayList<Info> getListData(){
        ArrayList<Info> list = new ArrayList<>();
        for (String[] adata: data){
            Info info = new Info();
            info.setInfo(adata[0]);
            info.setDeskripsi(adata[1]);
            info.setPhoto(adata[2]);
            list.add(info);
        }
        return  list;
    }

}
