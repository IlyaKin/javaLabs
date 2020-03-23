package ru.geekbrains.labs.hardOOP;


import java.io.*;

public class Main {


    private static void inExam () throws IOException {
        InputStream file1 = new FileInputStream("1stFile.txt");
        byte[] buffer = new byte[500];
        OutputStream file3 = new FileOutputStream("3rdFile.txt", false);
        int count;
        while ((count = file1.read(buffer)) != -1){
            file3.write(buffer, 0, count);
            file3.flush();
        }
        file1.close();
        file1 = new FileInputStream("2ndFile.txt");
        while ((count = file1.read(buffer)) != -1) {
            file3.write(buffer, 0, count);
            file3.flush();
        }
        file1.close();
        file3.close();
    }

    private static void checkWord (String fileName, String word){
            try {
            FileInputStream in = new FileInputStream(fileName);
            int symbol = 0;
            int i = 0;
            byte[] wordBytes = word.getBytes();
            do {
                symbol = in.read();
                if (wordBytes[i] == symbol) {
                    i++;
                    if (i == wordBytes.length) {
                        System.out.println("Слово присутствует");
                        break;
                    }
                } else {
                    i = 0;
                }
            }while (symbol != -1);

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
       /* try {
            inExam();
        } catch (IOException e){
            e.printStackTrace();
        }*/
       checkWord("3rdFile.txt","monday");
    }
}