package com.rk.csiof;

import java.io.*;

public class Program2 {
    public static void main(String[] args) throws IOException {
        /* Membuka File
         * Byte Stream -> FileInputStream
         * Character Stream -> FileReader
         * */

        FileInputStream byteFileInput = new FileInputStream("Input.txt");
        FileReader charFileInput = new FileReader("Input.txt");

        FileOutputStream byteFileOutput = new FileOutputStream("OutputByte.txt");
        FileWriter charFileOutput = new FileWriter("OutputChar.txt");

        /* Membaca File (Untuk ByteFile) */
        int bufffer = byteFileInput.read();
        while (bufffer != -1) {
            System.out.println((char) bufffer);
            byteFileOutput.write(bufffer);
            bufffer = byteFileInput.read();
        }

        System.out.println("\n");

        /* Membaca File (Untuk CharFile) */
        bufffer = charFileInput.read();
        while (bufffer != -1) {
            System.out.println((char) bufffer);
            charFileOutput.write(bufffer);
            bufffer = charFileInput.read();
        }

        /* Menutup File */
        byteFileInput.close();
        charFileInput.close();
        byteFileOutput.close();
        charFileOutput.close();

    }
}
