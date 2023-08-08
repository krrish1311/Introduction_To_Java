public class LoopIter {

    public static void main(String[] args) {
        int i=0;
        for(System.out.println("Running from initializing ");stopLoop(i);ItrAlways(i)){
            System.out.println("inside body of for ");
            i++;
        }
    }
    static boolean stopLoop(int i){

        if (i==2) {
            return false;
        }
        return true;
    }

    static void ItrAlways(int i){
        System.out.println("This For loop calling me in his increment/decrement statergies for "+i+" time");
    }

}
