
class ComputerProject {
	
	public static boolean myApp(boolean a, boolean b)
	{
		if(a)
		{return b;}
		else
		{return true;}
	} 
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		boolean p, q;
		
		System.out.println( "P\tQ\tCONJ\tDISJ\tCON\tBIC\tXOR");

		
		 p = true; q = true;
		 boolean x = p && q;
		 boolean y = p || q;
		 boolean g = !!p == !!q;
		 boolean u = (p || q) && !(p && q);
		 System.out.println(p + "\t" + q + "\t" + x + "\t" + y + "\t" + myApp(p,q) + "\t" + g + "\t" + u); 
		 
		
		  p = true; q = false; 
		  boolean j = p && q;
		  boolean s = p || q;
		  boolean l = !!p == !!q;
		  boolean o = (p || q) && !(p && q);
		  System.out.println(p + "\t" + q + "\t" + j + "\t" + s  + "\t" + myApp(p,q) + "\t" + l + "\t" + o); 

		  
		  p = false; q = true; 
		  boolean h = p && q;
		  boolean m = p || q;
		  boolean z = !!p == !!q;
		  boolean e = (p || q) && !(p && q);
		  System.out.println(p + "\t" + q + "\t" + h+ "\t" + m  + "\t" + myApp(p,q) + "\t" + z + "\t" + e); 

		  
		  
		  p = false; q = false; 
		  boolean r = p && q;
		  boolean v = p || q;
		  boolean f = !!p == !!q;
		  boolean n = (p || q) && !(p && q);
		  System.out.println(p + "\t" + q + "\t" + r + "\t" + v  + "\t" + myApp(p,q) + "\t" + f + "\t" + n); 

	}

}
