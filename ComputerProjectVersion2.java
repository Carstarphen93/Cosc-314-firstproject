
import java.util.Scanner;

class ComputerProjectVersion2 {
	
	public static boolean myApp(boolean a, boolean b)
	{
		if(a)
		{return b;}
		else
		{return true;}
	} 
	
	public static boolean conJ(boolean a, boolean b)
	{
		return a && b;
	}
	
	public static boolean disJ(boolean a, boolean b)
	{
		return a || b;
	}
	
	public static boolean Bic(boolean a, boolean b) 
	{
		return !!a == !!b;
	}
	
	public static boolean Xor(boolean a, boolean b)
	{
		return (a || b) && !(a && b);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		boolean p , q;
		 Scanner sc=new Scanner(System.in);
		System.out.print("Type in true or false for 'p': ");
		p = sc.nextBoolean();
		
		System.out.print("Type in true or false for 'q': " );
		q = sc.nextBoolean();
		
		
		
		System.out.println( "P\tQ\tCONJ\tDISJ\tCON\tBIC\tXOR");

		
		
		 System.out.println(p + "\t" + q + "\t" + conJ(p,q) + "\t" + disJ(p,q) + "\t" + myApp(p,q) + "\t" + Bic(p,q) + "\t" + Xor(p,q)); 
		 
		
		
	}

}
