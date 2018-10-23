import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Zadacha1 {
    public static void main(String[] args) throws IOException {
    ReadTxt red=new ReadTxt();
        String line1 = red.br.readLine();
        String line2 = red.br.readLine();
        System.out.println("ПЕРВАЯ СТРОЧКА: "+line1);
        String [] searchWords = line2.toLowerCase().split( " ");
        for (String string : searchWords) {
            line1 = line1.replace(string, "");
        }
        System.out.println("ВТОРАЯ СТРОЧКА: "+line2);
        System.out.println(" ");
        System.out.println("Первая строка после удаления повторяющих слов во второй строчке: ");
        System.out.println(line1);
    }
}