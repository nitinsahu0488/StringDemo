package com.javaprog.demo;

import java.util.Scanner;
class A1
{
	public void StringStart(String[] s)
	{
		 System.out.println("***********************************************" );
		for(int i=0;i<s.length;i++)
		{
			String s1 = s[i].toUpperCase();
			if(s1.startsWith("I") && s1.endsWith("S"))
				System.out.println("String is ->"+s[i]);
		}
	}
	public void StringContains(String[] s)
	{
		 System.out.println("***********************************************" );
		for(int i=0;i<s.length;i++)
		{
			int flag =0;
			String s2 = s[i].toUpperCase();
			for(int j =0 ;j<s2.length();j++) {
				
				if(s2.charAt(j)=='A')
					flag++;
				else if(s2.charAt(j)=='E')
                    flag++;
				else if(s2.charAt(j)=='I')
					flag++;
				else if(s2.charAt(j)=='O')
					flag++;
				else if(s2.charAt(j)=='U')
					flag++;
			}
		      if(flag>=3)
				System.out.println("String having atleast 3 vowels :-"+s[i]);
		}
	}
	public void ParaCheck(String s)
	{
		 char[] c = s.toCharArray();
		 String[] r = s.split(" ");
		 int word = r.length;
         int character =0;
         int spacebar =0;
         int number =0;
         int vowels =0;
         int other =0;
        
         for(int i=0; i<s.length();i++)
         {
            if(Character.isLetter(c[i]))
            {
            	if(c[i]=='A'||c[i]=='a'||c[i]=='E'||c[i]=='e'||c[i]=='I'||c[i]=='i'||c[i]=='O'||c[i]=='o'||c[i]=='U'||c[i]=='u')
                { 
                	vowels++;
                }
              character++;
            }
            else if(Character.isDigit(c[i]))
            {
              number++;
            }
            else if(Character.isSpaceChar(c[i]))
            {
               spacebar++;
            }
             
       
            else other++;
         }
         System.out.println("***********************************************" );
       System.out.println("No of letter is: " + character);
       System.out.println("No of digit is: " + number);
       System.out.println("No of space is: " + spacebar);
       System.out.println("No of vowels is: " + vowels);
       System.out.println("No of words is: " + word);
       System.out.println("No of other letter is: " + other);
	}
	public void StringCovert(String s)
	{
		System.out.println("***********************************************" );
		char[] ch = s.toCharArray();
		char[] ch1 =new char[s.length()];
		for(int i=0;i<ch.length;i++)
		{
			if(Character.isLowerCase(ch[i]))
			{
				ch1[i]=Character.toUpperCase(ch[i]);
			}
			else if(Character.isUpperCase(ch[i]))
			{
				ch1[i]=Character.toLowerCase(ch[i]);
			}
		}
		String str = new String(ch1);
		System.out.println("Converted String ->"+str);
		
	}
	}

public class StringDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		A1 a = new A1();
		System.out.println("Enter String :>");
		String st = sc.nextLine();
		String s[] = st.split(" ");
		a.StringStart(s);
		a.StringContains(s);
		a.ParaCheck(st);
		a.StringCovert(st);
        		
	}

}
