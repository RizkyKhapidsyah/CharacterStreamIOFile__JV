package com.rk.csiof;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        /* Membuka File */

        //byte stream -> FileInputStream
        //Character stream -> FileReader
        FileInputStream byteFile = new FileInputStream("Input.txt");
        FileReader charFile = new FileReader("Input.txt");

        /* Membaca File */
        System.out.println(byteFile.read());
        System.out.println(charFile.read());
        System.out.println((char) byteFile.read());
        System.out.println((char) charFile.read());

        /* Menutup File */
        byteFile.close();
        charFile.close();
    }
}
