import java.util.Arrays;
import java.util.Scanner;

public class BTTachChuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chuoi");
        String input = sc.nextLine();
        String[] words = input.split(" ");

        System.out.println("cac tu trong chuoi la: " );
        for(String word:words){
            System.out.println(word);
        }
    }
}
