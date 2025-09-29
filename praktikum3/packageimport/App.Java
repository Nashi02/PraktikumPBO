import dasar_pbo.praktikum3.packageimport.utils.Greetings; // mengimpor class Greetings dari package com.contoh.utils
import java.util.Scanner;          // mengimpor Scanner dari java.util

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();

        // Memanggil method dari class di package lain
        Greetings.sayHello(nama);
    }
}
