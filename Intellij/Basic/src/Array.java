public class Array {
    public static void main(String[] args) {
        //primitive datatypes
        int a=10;//here the space of the int never changes it is always be 10 just like static

        //as per we know that the arr are the pointers that's the reason why we can get continuous memory (space of1)+index*size In C++ and also we get
        //space from stack as well as heap in c++ but IN JAVA we get space for arr from heap only
        //IN JAVA we don't access the memory directly as we did in the C++ so they uses an references

        int arr[]={10,20,30,40};

        System.out.println(arr);//Here we get the reference of address from JVM which has the virtual memory and from that we get an memory

//        System.out.println(arr[4]); we will gwt an index bound error here

        //let's declare a arr in some another way

//
        int arr2[];
//        System.out.println(arr2[2]); //here the error is arr2 might not have been initialized

        int arr3[]=new int[5];
        System.out.println(arr3[4]);
        arr3[0]=10;//i have initialized an arr so at each place where not initializzed stores the value 0
        // i have tested that without initializing just declaring with size it get stored zero at each place
        System.out.println(arr3[4]);


    }
}
