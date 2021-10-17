// Java Program to Detect
// if two integers have opposite signs.
// This Program coded is AIYUB KHAN. GIT (aiyubkhanengg/Java-Developer)

class TwoIntegerOppositeSigns {

	static boolean oppositeSigns(int x, int y)
	{
		return ((x ^ y) < 0);
	}
	
	public static void main(String[] args)
	{
		int x = 30, y = -50;
		if (oppositeSigns(x, y) == true)
			System.out.println("Signs are opposite");
		else
			System.out.println("Signs are not opposite");
	}
}

