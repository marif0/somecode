// output of the program.

class Base{
		protected void foo(){}
}
class Derived extends Base{
	void foo(){}
}
public class Main{
	public static void main(String args[]){
		Derived d=new Derived();
		d.foo();
	}
}