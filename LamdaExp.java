package com.javaprog.demo;
interface lam
{
	public void display(String name);
	}
interface addLambda
{
	public void add(int a , int b);
	}
interface even
{
	public boolean ev(int i);
	}
public class LamdaExp {
	 static String name = "Looooki";
	 static int a = 7,b=4;
	 static int i = 24;
	public static void main(String[] args) {
		
	lam l = (name)->{
		System.out.println(name);
	};	
     l.display(name);
     addLambda a1 = (a,b)->System.out.println(a+b);
     a1.add(a, b);
     even e = (i)->{
    	 boolean n = (i%2==0)?true:false;
		return n;
     };
     System.out.println(e.ev(i));
	}

}
