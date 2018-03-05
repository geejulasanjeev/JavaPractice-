package powern;

import java.util.Scanner;

public class power {
	
	int a ;
	
	public static void main (String args[]) {
		System.out.println(" power ‘n’ :");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n = scanner.nextInt();
		int n2 = 1;
		System.out.println("Enter second number :");
		int n1 = scanner.nextInt();
		System.out.println(n+" power "+n1);
		for(int i =1;i<=n1;i++) {
			n2 = n2*n;
			
			System.out.println(n2);
			
		}
		power p = new power();
		p.aaa();
		p.bbb();
		
	}
	
	public void aaa() {
		a = 100;
		System.out.println("aaaaaaaa"+a);
	}
	
	public void bbb() {
		System.out.println("bbbbbbbb"+a);
	}

}
