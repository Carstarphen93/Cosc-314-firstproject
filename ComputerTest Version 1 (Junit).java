package com.company;

import org.junit.Test;

class ComputerTestVersion1 {

    @Test
    public static boolean myCon(boolean a, boolean b)
    {
        if(a)
        {return b;}
        else
        {return true;}
    }

    @Test
    public static void main(String[] args) {

        boolean p, q;

        System.out.println( "P\t\tQ\t\tCONJ\tDISJ\tCON\t\tBIC\t\tXOR");

        p = true; q = true;
        boolean x = p && q;
        boolean y = p || q;
        boolean g = !!p == !!q;
        boolean u = (p || q) && !(p && q);
        System.out.println(p + "\t" + q + "\t" + x + "\t" + y + "\t" + myCon(p,q) + "\t" + g + "\t" + u);

        p = true; q = false;
        boolean j = p && q;
        boolean s = p || q;
        boolean l = !!p == !!q;
        boolean o = (p || q) && !(p && q);
        System.out.println(p + "\t" + q + "\t" + j + "\t" + s + "\t" + myCon(p,q) + "\t" + l + "\t" + o);

        p = false; q = true;
        boolean h = p && q;
        boolean m = p || q;
        boolean z = !!p == !!q;
        boolean e = (p || q) && !(p && q);
        System.out.println(p + "\t" + q + "\t" + h + "\t" + m + "\t" + myCon(p,q) + "\t" + z + "\t" + e);

        p = false; q = false;
        boolean r = p && q;
        boolean v = p || q;
        boolean f = !!p == !!q;
        boolean w = (p || q) && !(p && q);
        System.out.println(p + "\t" + q + "\t" + r + "\t" + v + "\t" + myCon(p,q) + "\t" + f + "\t" + w);

    }
}

   /* P		Q		CONJ	DISJ	CON		BIC		XOR
        true	true	true	true	true	true	false
        true	false	false	true	false	false	true
        false	true	false	true	true	false	true
        false	false	false	false	true	true	false*/