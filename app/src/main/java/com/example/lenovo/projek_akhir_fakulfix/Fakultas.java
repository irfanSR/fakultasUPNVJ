package com.example.lenovo.projek_akhir_fakulfix;

import java.io.Serializable;

/**
 * Created by lenovo on 20/10/2017.
 */

public class Fakultas implements Serializable {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTempat() {
        return tempat;
    }

    public void setTempat(String tempat) {
        this.tempat = tempat;
    }

    private String name, tempat;

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public int getPhoto() {
        return photo;
    }

    private int photo;

    public int getFasilitas() {
        return fasilitas;
    }

    public void setFasilitas(int fasilitas) {
        this.fasilitas = fasilitas;
    }

    public int getLokasi() {
        return lokasi;
    }

    public void setLokasi(int lokasi) {
        this.lokasi = lokasi;
    }

    public int getAkseskendaraan() {
        return akseskendaraan;
    }

    public void setAkseskendaraan(int akseskendaraan) {
        this.akseskendaraan = akseskendaraan;
    }


    private int fasilitas;
    private int lokasi;
    private int akseskendaraan;
}
