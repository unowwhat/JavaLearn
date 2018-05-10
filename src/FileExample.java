/**
 * Created by Roman on 28.01.2018.
 */

import java.io.*;

public class FileExample {
    public static void main(String[] args) throws IOException {
        byte data[] = new byte[10];
        System.out.println("Введите символы: ");
        System.in.read(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print((char) data[i]);
        }
    }
}

