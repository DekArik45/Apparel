package com.example.apparel.data;

import com.example.apparel.model.Transaction;

import java.util.ArrayList;

public class TransactionData {
        public static String[][] data = new String[][]{
                {"https://bajuyuli.com/uploads/products/data/201809/31-baju-muslim-anak-perempuan-syari-wolly-crepe-murah-salem-peach.jpg", "baju Muslim Anak Perempuan", "Pink", "Jakarta", "Belum bayar", "11-May-2019", "Belum dikirm", "", "Fit to M", "1", "78000", "78000"},
                {"https://dynamic.zacdn.com/NxOAlT1iZ1CgZs4kFiOv_LcKM8E=/fit-in/346x500/filters:quality(90):fill(ffffff)/http://static.id.zalora.net/p/osella-0338-0174271-1.jpg", "Kemeja Pria Lengan Pendek", "Merah muda", "Surabaya", "Sudah bayar", "01-May-2019", "Belum dikirm", "", "M", "2", "105000", "210000"},
                {"https://fasnina.com/wp-content/uploads/2018/10/model-baju-batik-atasan-ala-artis-1.jpg", "Baju Batik Atasan", "Coklat", "Bandung", "Sudah bayar", "29-April-2019", "Sedang pengiriman", "", "S", "2", "125000", "250000"},
                {"https://d3ife8wk53juxx.cloudfront.net/media/product-mp/41226/9259_s_(1).jpg", "Kemeja semi formal", "Putih", "Bandung", "Sudah bayar", "05-April-2019", "Sudah sampai", "09-May-2019", "L", "1", "160000", "160000"},
                {"https://imager-next.freetls.fastly.net/images/resized/480/assets-category-list/ibuanak_hm_atasan.jpg", "Baju Hamil", "Merah Muda", "Surabaya", "Belum bayar", "09-May-2019", "Belum dikirm", "", "Fit to L", "1", "90000", "90000"},
                {"https://fasnina.com/wp-content/uploads/2018/10/model-baju-batik-buat-orang-gemuk.jpg", "Baju Batik Gemuk", "Hitam", "Sidoarjo", "Sudah bayar", "10-May-2019", "Belum dikirm", "", "M", "1", "130000", "130000"},
                {"https://dynamic.zacdn.com/yX7nrpWMhK98S47-xMh82p21_LA=/fit-in/346x500/filters:quality(90):fill(ffffff)/http://static.id.zalora.net/p/osella-1603-9374271-1.jpg", "Kaos Lengan Panjang", "Abu-abu", "Jakarta", "Sudah bayar", "06-May-2019", "Sedang pengiriman", "", "L", "1", "88000", "88000"},
                {"https://cf.shopee.co.id/file/03dc686b08b9154330df5856d97524fb", "Kemeja Pria Motif Garis", "Putih", "Jakarta", "Sudah bayar", "30-April-2019", "Sudah sampai", "05-May-2019", "L", "1", "78000", "156000"},
                {"https://s3.bukalapak.com/img/8498654483/w-1000/Best_Trend_Kemeja_Pria_Baju_Pria_Kemeja_Kasual_Atasan_Pakaia.jpg", "Kemeja Pria Motif Belang", "Hitam Biru", "Denpasar", "Belum bayar", "11-May-2019", "Belum dikirm", "", "S", "1", "65000", "65000"},
                {"https://dev.osella.com/930-large_default/osella-baju-pria-kemeja-lengan-panjang-stripe-white.jpg", "Kemja Pria Strip", "Putih", "Cengkareng", "Sudah bayar", "04-May-2019", "Belum dikirm", "", "M", "1", "140000", "140000"},
                {"https://www.osella.com/2846-medium_default/osella-baju-pria-kemeja-lengan-pendek-kotak-kotak-navy.jpg", "Kemeja Kotak-kotak", "Biru", "Bandung", "Sudah bayar", "08-May-2019", "Sedang pengiriman", "", "L", "1", "90000", "90000"},
                {"https://storage.jualo.com/original/9943111/baju-baseball-baju-sp-mode-gaya-pria-9943111.jpg", "Kaos New York", "Biru", "Bogor", "Sudah bayar", "27-April-2019", "Sudah sampai", "09-May-2019", "L", "2", "60000", "120000"},
        };

        public static ArrayList<Transaction> getListData(){
            Transaction transaction= null;
            ArrayList<Transaction> list = new ArrayList<>();
            for (String[] aData : data) {
                transaction = new Transaction();
                transaction.setGambar(aData[0]);
                transaction.setNama(aData[1]);
                transaction.setWarna(aData[2]);
                transaction.setAsalProduct(aData[3]);
                transaction.setKetBayar(aData[4]);
                transaction.setTanggalTransaksi(aData[5]);
                transaction.setKetSampai(aData[6]);
                transaction.setTanggalSampai(aData[7]);
                transaction.setUkuran(aData[8]);
                transaction.setJumlah(aData[9]);
                transaction.setHarga(aData[10]);
                transaction.setTotalHarga(aData[11]);

                list.add(transaction);
            }

            return list;
        }
}