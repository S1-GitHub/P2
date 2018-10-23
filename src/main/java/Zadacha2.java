import java.io.*;
import java.util.*;

public class Zadacha2 {
    public static void main(String[] args) throws IOException {
        ReadTxt read = new ReadTxt();
        System.out.println("Введите слово, для получения колличества в данном предложении: ");
        int x = 0;
        String line1 = read.br.readLine();
        String line2 = read.br.readLine();
        String line3 = read.br.readLine();
        String[] text1 = line3.split("\\s+");
        String[] words = line3.replaceAll("[^а-яА-Я ]", "").toLowerCase().split("\\s+");
        System.out.println(line3);
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int count=0;

        for (int j = 0; j < words.length; j++) {
            if (word.equals(words[j])) {
                count++;
            }else { }
        }
        System.out.println(count);


        char[]c={'.',',','-',':',';','?','!'};
        int count2 = 0;

        String s=line3;
        for(int z=0;z<s.length();z++){
            for(int y=0;y<c.length;y++){
                if(s.charAt(z)==c[y]){
                    count2++;
                    break;
                }
            }
        }
        System.out.println(count2);
    }

}

