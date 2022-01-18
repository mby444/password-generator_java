// Enter the length of password (int)

import java.util.Scanner;

public class PasswordGenerator
{
    static String generatePassword(int len){
        String characters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String output = "";
        for (int i = 0; i < len; i++){
            int random = (int)Math.round(Math.random() * (characters.length() - 1));
            output += characters.charAt(random);
        }
        return output;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        String password = generatePassword(input);
        System.out.println(password);
    }
}
