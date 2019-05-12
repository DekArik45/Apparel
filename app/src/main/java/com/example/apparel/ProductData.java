package com.example.apparel;

import java.util.ArrayList;

public class ProductData {

    public static String[][] data = new String[][]{
            {"Tees Chopperland LS Black", "Rp 275.000", "S, M, L, XL","ELDERS COMPANY", "Cotton", "Black" ,"https://storage.googleapis.com/maskoolin/uploads/215e13dc-www.maskoolin.com_215e13dc-www.maskoolin.com_elderscompany-elders-company-tees-chopperland-ls-black-2_2019-03-20_06-09-34_305875_2019-03-20_06-09-34_307590-619x619.jpg"},
            {"Bluesville Longplay Navy Tshirt", "Rp 187.000", "Pakaian Pria, Kaos", "Kaos Bluesville ini cocok untuk kamu yang ingin bergaya basic military yet streetwear. Terbuat dari katun combed 20s dengan teknik sablon discharge, membuat kaos bluesville ini cocok bagi kamu yang ingin tampil effortlessly cool namun tetap berkesan clean.", "S, M, L, XL", "BLUESVILLE", "Cotton", "Navy Blue", "https://storage.googleapis.com/maskoolin/uploads/6ce983b6-www.maskoolin.com_6ce983b6-www.maskoolin.com_bluesville-bluesville-longplay-navy-tshirt-1_2019-05-06_07-50-33_633035_2019-05-06_07-50-33_634724-619x619.jpg"},
            {"Button Down LS - Steel Blue Multistripes", "Rp 309.000", "Pakaian Pria, Kemeja", "Kemeja button down yang tak lekang oleh waktu, dilengkapi dengan 1 kantong dada.", "S, M, L, XL","QUTN","Cotton", "https://storage.googleapis.com/maskoolin/uploads/www.maskoolin.com_www.maskoolin.com_qutn-qutn-button-down-ls-steel-blue-multistripes-1_2018-05-18_12-18-10_638415_2018-05-18_12-18-10_641267-619x619.jpg"},
            {"Oxford Panel Shirt Blue", "Rp 287.100","Pakaian Pria, Kemeja","Kemeja terbaru dari Jackhammer Co. bahan oxford dan chambray telah menjadi fabric unggulan kami karena karakterisitiknya yang lembut dan tough. Panel Shirt ini menggunakan cross bahan dengan perbedaan warna untuk look yang lebih dominan.","S, M, L, XL", "Jackhammer Co.", "Cotton", "Blue", "https://storage.googleapis.com/maskoolin/uploads/f243789a-www.maskoolin.com_f243789a-www.maskoolin.com_jackhammerco_2018-11-20_17-35-03_866977.-jackhammer-co-oxford-panel-shirt-blue-1_2018-11-20_17-35-03_869893-619x619.jpg"},
            {"Hibisco Shirt Navy", "Rp 187.000","Pakaian Pria, Kemeja","Kemeja Pria dari Aloha yang Relaxed Fit, memiliki detail kerah model open collar dan satu kantong di bagian dada. Kemeja pria ini sangat cocok untuk digunakan secara daily","S, M, L, XL","Aloha Attire","Cotton","Navy", "https://storage.googleapis.com/maskoolin/uploads/66ac1738-www.maskoolin.com_66ac1738-www.maskoolin.com_alohaattire-aloha-attire-hibisco-shirt-navy-1_2019-04-20_11-38-28_119731_2019-04-20_11-38-28_121426-619x619.jpg"},
            {"FTW Essentials Shirt White", "Rp 450.000","Pakaian Pria, Kemeja", "Koleksi Forever Two Wheels. Ini adalah koleksi terbaru pada tahun 2018. Terinspirasi oleh Sejarah motor dan Los Angeles Kustom Kulture modern seperti Tattoos, Low riders, Choppers and Good Times. Forever Two Wheels adalah semangat 99% dan 1% yang diberikan. Kemeja ini terbuat dari Poplins kualitas terbaik. Wear this with Attitude.", "S, M, L, XL", "Elders Company", "Cotton", "White", "https://storage.googleapis.com/maskoolin/uploads/15d2bc25-www.maskoolin.com_img-4883_2019-03-22_03-53-31_962514-619x619.jpg"},
            {"WP Pria Kantor New Tab Waterprof Aklirik", "Rp 210.000","Pakaian Pria, Jaket", "Jaket New Tab Pria Kantor Waterprof / Jaket Motor WP Kekinian, adem dipakai", "L, XL", "Harington", "Purring Aklirik ", "Black", "https://cf.shopee.co.id/file/c9d6029e1f0edfb61fab93829fe1cc6d"},
            {"Kaos polos wanita lengan panjang", "Rp 45.000","Pakaian Wanita, Kaos", "V-neck basic polos, Bahan spandek soft sangat lembut&halus", "L, XL", "-", "Spandek", "Pink", "https://cf.shopee.co.id/file/ff10e810cb321af618dd5abd46d1248b5"},
            {"Tees Nippon White", "Rp 250.000","Pakaian Pria, Kaos", "Ini adalah koleksi Tee Elders MC terlaris dari arsip 2018. Terbuat dari katun 30S berkualitas, regular fit dan ukuran standar Asia.", "S, M, L, XL", "Elders Company", "Cotton", "White", "https://storage.googleapis.com/maskoolin/uploads/b6d5641d-www.maskoolin.com_img-4748_2019-03-20_09-29-11_542102-619x619.jpg"},
            {"Kemeja Polos Slimfit", "Rp62.000","Pakaian Pria, Kemeja", "-", "S, M, L, XL", "Blanco", "Cotton", "Black Maroon", "https://cf.shopee.co.id/file/7ffac4a0e6b1f2bfd7893a2cc52df632"}
    };

    public static ArrayList<ProductActivity> getListData(){
        ProductActivity productActivity = null;
        ArrayList<ProductActivity> list = new ArrayList<>();
        for (String[] aData : data) {
            productActivity = new ProductActivity();
            productActivity.setNama(aData[0]);
            productActivity.setHarga(aData[1]);
            productActivity.setKategori(aData[2]);
            productActivity.setDeskripsi(aData[3]);
            productActivity.setUkuran(aData[4]);
            productActivity.setBrand(aData[5]);
            productActivity.setBahan(aData[6]);
            productActivity.setWarna(aData[7]);
            productActivity.setFoto(aData[8]);

            list.add(productActivity);
        }

        return list;
    }

}
