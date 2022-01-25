import java.lang.Integer;
class Uc9 {

	public static int compare(Object obj1, Object obj2)
	{
		int intObj1 = (int)obj1;
		int intObj2 = (int)obj2;

		int difference = intObj1 - intObj2;

	 	if (difference == 0) {

			 System.out.println("Both lines are Equal");
		}
		else if (difference < 0) {

			 System.out.println("First line is greater");
		}
		else
		{
			 System.out.println("Second  lines is Greater");
		}
		return 0;
	}

	public static void main(String args[])
	{

		int a = 10;
		int b = 10;
		System.out.println(compare(a, b));
		int x = 30;
		int y = 30;
 		System.out.println(compare(x, y));
		int w = 15;
		int z = 15;
		System.out.println(compare(w, z));

	}

}

