package com.mycompany.tugaspbogeneric;

public class Main {
    public static void main(String[] args) {

        DataManager<CetakData> dataManager = new DataManager<>();

        Student s1 = new Student("Ferdi", 21, "1102020", "PBO A");
        Student s2 = new Student("Budi", 20, "1102021", "PBO B");

        Teacher t1 = new Teacher("Yulhan Wahyudin", 35, "D001", "Pemrograman Berorientasi Objek");

        dataManager.tambahData(s1);
        dataManager.tambahData(s2);
        dataManager.tambahData(t1);

        System.out.println("=== APLIKASI MANAJEMEN DATA SEKOLAH ===");
        dataManager.tampilSemuaData();
    }
}