package com.mycompany.tugaspbogeneric;

public class Student extends Person implements CetakData {
    private String nim;
    private String kelas;

    public Student(String nama, int umur, String nim, String kelas) {
        super(nama, umur);
        this.nim = nim;
        this.kelas = kelas;
    }

    @Override
    public void tampilData() {
        System.out.println("Nama Mahasiswa : " + getNama());
        System.out.println("Umur           : " + getUmur());
        System.out.println("NIM            : " + nim);
        System.out.println("Kelas          : " + kelas);
    }

    @Override
    public void cetak() {
        tampilData();
    }
}