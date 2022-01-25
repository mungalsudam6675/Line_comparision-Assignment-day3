import java.lang.Math;
import java.util.*;
public class Uc7{
	public static void main(String [] a){
		Scanner scan = new Scanner(System.in);
		System.out.println("enter X1 and Y1 value");
		int x1 = scan.nextInt();
                int y1 = scan.nextInt();
		System.out.println("enter X1 and Y2 value");
                int x2 = scan.nextInt();
                int y2 = scan.nextInt();
		double ans=Math.sqrt( (x2 - x1) ^ 2 + (y2 - y1) ^ 2 );
		System.out.println("Length of line = "+ans);
		}
}




