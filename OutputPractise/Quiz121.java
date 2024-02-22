//String output....

public class Quiz121{
	public static void main(String args[]){
		String str = new String("Hey Champs").intern();
		String str1 = new String("Hey Champs").intern();
		System.out.println(str1==str);
	}
}

//true
//intern()