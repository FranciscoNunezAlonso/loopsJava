import java.util.Scanner;

	public class table {
	    public static void main(String[] args){
	        Scanner console = new Scanner(System.in);
	        int num, a;
	        a=1;
	        
	        System.out.print("Enter any positive integer: ");
	        num = console.nextInt();
	        
	        System.out.println("Multiplication Table of " + num);
	        while (a<=10) {
				System.out.println(a + "*" + num + "=" + a*num);
				a++;
			}
	        console.close();
	    }
	}