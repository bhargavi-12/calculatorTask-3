package epamcalculatortask3.epamtask3cal;

import java.util.Scanner;

import org.junit.Test;



public class Calcmain {
	@Test
	   public void CalTest(){
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter number1");
		   int a1=sc.nextInt();
		   System.out.println("Enter number2");
		   int a2=sc.nextInt();
		   System.out.println("1.addition");
		   System.out.println("2.subtraction");
		   System.out.println("3.multiplication");
		   System.out.println("4.division");
		   System.out.println("Enter choice");
		   int ch=sc.nextInt();
		   CalcTest2 obj1=new CalcTest2(a1,a2);
		   if(ch>=1 && ch<5) {
			   int[] choice= {
					   obj1.add(a1, a2),
					   obj1.sub(a1, a2),
					   obj1.mul(a1,a2),
					   obj1.div(a1, a2)
			   };
			   System.out.println("Result:"+choice[ch-1]);
		       }
		   else {
			   System.out.println("Invalid input");
		   }
	}  
}
