package com.example.asus.listview;

/**
 * Created by A S U S on 25.7.2016.
 */
public class Kategori {
    private int ID;
    private int IDKategori;
    private String KategoriBaslik;
    private String KategoriResim;
    private int AltKategoriSayi;

    public Kategori(int ID, int IDKategori, String kategoriBaslik, String kategoriResim, int altKategoriSayi) {
        AltKategoriSayi = altKategoriSayi;
        KategoriResim = kategoriResim;
        KategoriBaslik = kategoriBaslik;
        this.IDKategori = IDKategori;
        this.ID = ID;
    }

    public int getAltKategoriSayi() {
        return AltKategoriSayi;
    }

    public void setAltKategoriSayi(int altKategoriSayi) {
        AltKategoriSayi = altKategoriSayi;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getIDKategori() {
        return IDKategori;
    }

    public void setIDKategori(int IDKategori) {
        this.IDKategori = IDKategori;
    }

    public String getKategoriBaslik() {
        return KategoriBaslik;
    }

    public void setKategoriBaslik(String kategoriBaslik) {
        KategoriBaslik = kategoriBaslik;
    }

    public String getKategoriResim() {
        return KategoriResim;
    }

    public void setKategoriResim(String kategoriResim) {
        KategoriResim = kategoriResim;
    }


}
