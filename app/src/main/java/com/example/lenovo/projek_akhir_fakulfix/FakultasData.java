package com.example.lenovo.projek_akhir_fakulfix;

import java.util.ArrayList;

/**
 * Created by lenovo on 20/10/2017.
 */

public class FakultasData {

    public static String[][] data = new String[][] {
            {"ekonomi", "Pondok Labu"},
            {"fikes", "Pondok Labu"},
            {"fisip", "Pondok Labu"},
            {"teknik", "Pondok Labu"},
            {"hukum", "Pondok Labu"},
    };

    public static int [][] detail = new int[][] {
            {R.drawable.ekonomi,R.string.content_lokasi_ekonomi,R.string.fasilitas_ekonomi,R.string.content_akseskendaraan_ekonomi },
            {R.drawable.fikes,R.string.content_lokasi_fikes,R.string.fasilitas_fikes,R.string.content_akseskendaraan_fikes },
            {R.drawable.fisip,R.string.content_lokasi_fisip, R.string.fasilitas_fisip,R.string.content_akseskendaraan_fisip },
            {R.drawable.hukum,R.string.content_lokasi_hukum, R.string.fasilitas_hukum, R.string.content_akseskendaraan_hukum },
            {R.drawable.teknik,R.string.content_lokasi_teknik,R.string.fasilitas_teknik,R.string.content_akseskendaraan_teknik },
    };

    public static ArrayList<Fakultas> getListData(){
        Fakultas fakultas = null;
        ArrayList<Fakultas> list = new ArrayList<>();

        for (int i = 0; i<data.length; i++){
            fakultas = new Fakultas();

            fakultas.setName(data[i][0]);
            fakultas.setTempat(data[i][1]);
            fakultas.setPhoto(detail[i][0]);
            fakultas.setLokasi(detail[i][1]);
            fakultas.setFasilitas(detail[i][2]);
            fakultas.setAkseskendaraan(detail[i][3]);

            list.add(fakultas);
        }
        return list;
    }
}
