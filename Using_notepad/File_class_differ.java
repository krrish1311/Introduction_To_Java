class FirstClass{
//Here if we write two different classes in same file then their bytes code get stored in different files and thier names are based on the class names FIrstClass and SecondClass
	public static void main(String [] args){
	//the system is a package and the out is the class name which has the println function
		System.out.println("From the first class");
	}

}


class SecondClass{
	//This is the second function we have written but this bytecode get stored in the different file known as SecondClass.class
	public static void main(String[] args){

		System.out.println("From the second class");

	}

}
