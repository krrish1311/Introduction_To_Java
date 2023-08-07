import java.util.Scanner;

public class BinaryInput {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        sc.useRadix(2);//use base as 2

        //take in int
        int a=sc.nextInt();
        System.out.println(a);
        //take in char
        char c=(char) sc.nextInt();
        System.out.println(c);

    }
}
