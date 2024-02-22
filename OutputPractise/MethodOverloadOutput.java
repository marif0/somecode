//output for overloading

class MethodOverloadOutput{
	public void m1(int a, float b){
		System.out.println("Inside m1 method");
	}
	public void m1(float a, int b){
		System.out.println("Inside m1 overloaded method");
	}
	public static void main(String args[]){
		MethodOverloadOutput ss=new MethodOverloadOutput();
		ss.m1(20,20);
	}
}


//output
 /*reference to m1 is ambiguous
                ss.m1(20,20);
                  ^
  both method m1(int,float) in MethodOverloadOutput and method m1(float,int) in MethodOverloadOutput match
  
  */