package com.mycompany.kasirwarungberasagung120;
import java.util.Scanner;

public class KasirWarungBerasAgung120 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double jumlahBeras, hargaBeras, uangDiterima;
        System.out.println("=====SELAMAT DATANG DI KASIR AGUNG120=====");
        System.out.print("Masukkan jumlah beras yang dibeli(kg) : ");
        jumlahBeras = input.nextDouble();
        System.out.print("Masukkan harga beras per kg : Rp.");
        hargaBeras = input.nextDouble();
        double hargaSebelumDiskon = jumlahBeras * hargaBeras;
        double hargaSetelahDiskon = hargaSebelumDiskon * 0.95;
        System.out.println("==========================================");
        System.out.println("Total harga sebelum diskon = Rp." + hargaSebelumDiskon);
        System.out.println("Total harga setelah diskon = Rp." + hargaSetelahDiskon);
        System.out.println("==========================================");
        System.out.print("Masukkan jumlah uang yang diterima : Rp.");
        uangDiterima = input.nextDouble();
        double uangKembalian = uangDiterima - hargaSetelahDiskon;
        System.out.println("Jumlah kembalian = Rp." + uangKembalian);
        System.out.println("==================SELESAI==================");
        
        
    }
}
