package com.mycompany.tugaspbogeneric;

public class Teacher extends Person implements CetakData {
    private String nidn;
    private String mataKuliah;

    public Teacher(String nama, int umur, String nidn, String mataKuliah) {
        super(nama, umur);
        this.nidn = nidn;
        this.mataKuliah = mataKuliah;
    }

    @Override
    public void tampilData() {
        System.out.println("Nama Dosen     : " + getNama());
        System.out.println("Umur           : " + getUmur());
        System.out.println("NIDN           : " + nidn);
        System.out.println("Mata Kuliah    : " + mataKuliah);
    }

    @Override
    public void cetak() {
        tampilData();
    }
}
