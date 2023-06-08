import java.util.Scanner;

public class RegexEmail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String emailAddress = sc.nextLine();
        System.out.println("Email da duoc validate : " + checkEmail(emailAddress));
//        rikkei@gmail.com
    }

    public static boolean checkEmail(String email){
        String regex = "^[A-Za-z0-9]+@[a-z.]+[a-z.]{2,4}$";
        return email.matches(regex);
    }

}
