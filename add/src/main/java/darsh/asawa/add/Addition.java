package darsh.asawa.add;
import java.util.Scanner;

public class Addition {
	
	public int add(int x,int y) {
		return x+y;
	}
	


	public static void main(String args[]) {
	Scanner scan=new Scanner(System.in);
	
	Addition obj= new Addition();
	int a,b,c;
	System.out.println("Enter first number :");
	a=scan.nextInt();	
	System.out.println("Enter second number :");
	b=scan.nextInt();
	c=obj.add(a, b);
	System.out.println("sum of the two numbers is : \n"+c);

}
}