public class Functions {
    public static void main(String[] args) {
        System.out.println("hello console JVM said:first main function\n\n");

        //let's prepare a milk tea
        String milk1="milk";
        String milk2="Chaypati";
        String milk3="ilaychi";
        int milk_t=20;

        System.out.println("Here is ur normal tea receipee");
        String Normal_tea=tea(milk1,milk2,milk3,milk_t);
        System.out.println(Normal_tea);

        //let's prepare an black tea
        String b1="Water";
        String b2="Chaypati";
        String b3="Adrak";
        int b_t=15;

        System.out.println("\nHere is ur normal tea receipee");
        String black_tea=tea(b1,b2,b3,b_t);
        System.out.println(black_tea);



    }
    static String tea(String ing1,String ing2,String ing3,int time){
        String method1="On the gas and start boilling "+ing1;
        String method2=",add the "+ing2+" and "+ing3;
        String method3=",Keep it upto "+time+" min.";

        String final_cup=method1+method2+method3;

        return final_cup;


    }
}
