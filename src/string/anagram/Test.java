package string.anagram;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the Strings to check:");
        String A= s.nextLine();
        String B= s.nextLine();
        new Anagram(A,B).checkAnagram();
    }
    
}
