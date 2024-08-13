package ippoForce;

import java.util.Scanner;

public class volg{
	public static void main(String []args) {
		
		Scanner sn =new Scanner(System.in);
		
		int a = sn.nextInt();
		int b=sn.nextInt();
		
		int min =0;
		
		
		while(a>0 && b>0) {
			
			
			if(a<b) {
				a=a+1;
				b=b-2;
			}else {
				b=b+1;
				a=a-2;
			}
			
			 min++;
		}
		
		System.out.println(min);
		
	}
}