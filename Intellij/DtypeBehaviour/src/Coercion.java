public class Coercion {
    public static void main(String[] args) {
        int a=10;
        byte b=15;
        //size of int
        System.out.println(Integer.SIZE/8);
        //size of byte
        System.out.println(Byte.SIZE/8);

        //when i tried to store the a+b then the final dtype will be the dtype of the big size here int has 4 byte and byte has 1 so int wiil be final

        System.out.println(((Object) (a+b)).getClass());

        String k="F";
        int l=20;
//        System.out.println();
        System.out.println(((Object) (k+l)).getClass());//here i understand one concept that the string requires more bytes than usual

        System.out.println("The output will be concatenated"+a+l);
        System.out.println(a+l+"The output will be added then concatenated");
        //i wanted to print the numbers on same print function
        System.out.println(a+" "+l);
        System.out.println("The output will be preffered the bodmas "+(a+l));

    }
}
