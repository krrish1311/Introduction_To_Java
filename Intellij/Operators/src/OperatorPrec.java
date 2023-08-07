public class OperatorPrec {
    public static void main(String[] args) {
        int a;
        int x=3;
        int y=5;
//        int result =++x +(x--);
        int result=++x - y++ * (x-- + y) / (--x);
        System.out.println(result);
//        a=x+++y;//here post_increment <<<<< = operator
//        System.out.println("The output of a is: "+a+"x is :"+x);




    }
}
