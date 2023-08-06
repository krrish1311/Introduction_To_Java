public class typecasting {
    public static void main(String[] args) {
        char a='A';
        int i=a;
        int b=66;
        System.out.println(i);//implicit typecasting
        System.out.println((char)b); //explicit typecasting

        //char came into the number family so there also typecasting happens
        char x='A';
        char y='B';

        System.out.println(x+y);//here the output will be printed as the 131 ascii of A+B

        //here the output will becomes an integer which is a typecasting
        System.out.println(((Object) (x+y)).getClass());



    }
}
