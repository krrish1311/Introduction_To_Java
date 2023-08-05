class DtypeAndVariable{
	public static void main(String[] args){
		//here i am storing int and char datatypes which has value 65 and 'A' where because of datatype they use 4bytes and 2 bytes space  
		int integer_var;
		integer_var=65;
		char char_var='A';
		System.out.println("The size of the integer is"+Integer.SIZE/8);
		System.out.println("The size of the character is"+Character.SIZE/8);

		String integer_binary=Integer.toBinaryString(integer_var);
		//String char_binary=Character.toBinaryString(char_var); this function is not there for the Character 
		//the char value get stored in the ram as the ascii value where the ascii value of 'A' is 65
		int char_ascii=char_var;
		String char_binary=Integer.toBinaryString(char_ascii);
		//if we check the binary for both integer and for the char is same then how they differ from each other because both get stored in same 
		//just because of datatype 
		System.out.println("The binary of the integer "+integer_var+" is\t"+integer_binary);
		System.out.println("The binary of the char "+char_var+" is\t"+char_binary);
	
	        //when we retrieve or call the variable which has been stored in an mem they use the dtype to represent us as per we stored for example 
		//for ex: we stored the char_value as 'A' we can not represent in println function as 10000001 so it has to be converted into an char form and who help then
		//beacuse of dtype they represent as 'A' (1000001>>65>>it's char >>'A')
		System.out.println("call the integer value stored in memory"+integer_var);
		System.out.println("call the character value stored in memory"+char_var);
	}
}
