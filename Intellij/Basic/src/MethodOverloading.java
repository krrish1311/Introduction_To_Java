public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println("I think my Roll No. is 1 where JVM sir takes my Viva at first");

        System.out.println("Let's have coffee");

        //i wanted a coffee....
        String coffee=BeverageReceipee("Milk","Coffee powder","normal flavour",25);
        System.out.println(coffee);

        System.out.println("\nLet's have Juice Now ");

        String mango_juice=BeverageReceipee("Mangoes",5,"Milk",50,16.30f);
        System.out.println(mango_juice);

    }
    static String BeverageReceipee(String ing1,String ing2,String ing3,int time){
        String method1="On the gas and start boilling "+ing1;
        String method2=",add the "+ing2+" and "+ing3;
        String method3=",Keep it upto "+time+" min.";

        String final_cup=method1+method2+method3;

        return final_cup;

    }

    static String BeverageReceipee(String ing1,int ing1_c,String ing2,int ing2_c,float time){
        String method1="Take "+ing1_c+" "+ing1+" "+"cut them into pieces";
        String method2=",Put all the pieces into mixxer vessel and add "+ing2_c+" ml"+" of "+ing2;
        String method3=",Stir it upto "+time+" min.";

        String final_glass=method1+method2+method3;

        return final_glass;

    }

}
