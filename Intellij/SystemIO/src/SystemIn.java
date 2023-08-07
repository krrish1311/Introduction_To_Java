import java.util.Scanner;

public class SystemIn {
    public static void main(String[] args) {
        //Here the System.In will first connect to the keyboard to get output
        //if we wanted to read the typed words on ketboard then we use scanner to scan (read) where Scanner is an Class
        Scanner sc=new Scanner(System.in);
        //it has functions to get input in which dtypes that can be mentioned
        int a=sc.nextByte();//if we trying to store less sized dtype into large then it can do typecasting and store the value
        System.out.println(a);

//        int c=sc.nextLong(); //this will gives u error because we can not store the Long dtype into int
//        System.out.println(c);
        //we can achieve above by using explicit type casting
        int c=(int)sc.nextLong();
        System.out.println(c);

        //if we use only the next() function we can only receivve the first word of the string
        String first=sc.next();
        System.out.println(first);

        //to get ALL THE STRing we us ethe nextLine() function
        String full_name=sc.nextLine();

        System.out.println(full_name);

    }
}



