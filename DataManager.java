package com.mycompany.tugaspbogeneric;

import java.util.ArrayList;

public class DataManager<T extends CetakData> {
    private ArrayList<T> daftarData = new ArrayList<>();

    public void tambahData(T data) {
        daftarData.add(data);
    }

    public void tampilSemuaData() {
        for (T data : daftarData) {
            data.cetak();
            System.out.println("---------------------");
        }
    }
}
