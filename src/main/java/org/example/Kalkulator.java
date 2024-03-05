package org.example;

public class Kalkulator {

    // Metode untuk melakukan penjumlahan
    public int tambah(int a, int b) {
        return a + b;
    }

    // Metode untuk melakukan pengurangan
    public int kurang(int a, int b) {
        return a - b;
    }

    // Metode untuk melakukan perkalian
    public int kali(int a, int b) {
        return a * b;
    }

    // Metode untuk melakukan pembagian
    public int bagi(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Pembagi tidak boleh nol");
        }
        return a / b;
    }
}
