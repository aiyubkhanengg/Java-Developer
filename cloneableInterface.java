// Java program Cloneable interface..
//This program coded by AIYUB KHAN GIT (aiyubkhanengg/Java-Developer)
//@uthor AIYUB KHAN
import java.lang.Cloneable;

//implementing Cloneable interface
class cI implements Cloneable {
	int i;
	String s;

	// cI class constructor
	public cI(int i, String s)
	{
		this.i = i;
		this.s = s;
	}

	// Overriding clone() method
	@Override
	protected Object clone()
		throws CloneNotSupportedException
	{
		return super.clone();
	}
}

public class cloneableInterface {
	public static void main(String[] args)
		throws CloneNotSupportedException
	{
		cI ci = new cI(5555, "GIT ID:"+" "+ "aiyubkhanengg-Java-Developer");

		// casting as clone() return type is Object
		cI op = (cI)ci.clone();

		System.out.println(op.i);
		System.out.println(op.s);
	}
}
