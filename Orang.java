/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package orang;

public class Orang {

    // Class Orang
    static class DataOrang {
        String nama;
        int umur;

        void isiData(String nama, int umur) {
            this.nama = nama;
            this.umur = umur;
        }

        void tampilData() {
            System.out.println("Nama : " + nama);
            System.out.println("Umur : " + umur);
            System.out.println("----------------------");
        }
    }

    public static void main(String[] args) {

        DataOrang orang1 = new DataOrang();
        DataOrang orang2 = new DataOrang();

        orang1.isiData("Andrea Pirlo", 42);
        orang2.isiData("Cristiano Ronaldo", 35);

        orang1.tampilData();
        orang2.tampilData();
    }
}