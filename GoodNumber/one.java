package challenge_codeforce;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class goodNumber{
	public static void main(String []args) {
		
		Scanner sn = new Scanner(System.in);
		
		int n=sn.nextInt();
		int a=sn.nextInt();
		int nn=0;
		
		
		for(int i=0;i<n;i++) {
			String number=sn.next();
			
			if(result(number,a)) {
				nn++;
			}
		}
		
		System.out.println(nn);
		
		
		
	}
	
	public static  boolean result(String number,int k) {
		
		Set<Character>set=new HashSet<>();
		for(char c:number.toCharArray()) {
			set.add(c);
		}
		
		
		for(char digit='0';digit<'0'+k;digit++) {
			if(!set.contains(digit)) {
				return false;
			}
			
		}
		
		
		return true;
	}
}