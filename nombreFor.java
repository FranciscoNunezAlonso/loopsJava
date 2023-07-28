import java.util.Scanner;

	public class nombreFor {

	public static void main(String[] args) {
		 Scanner console = new Scanner(System.in);
	        String nombre;
	        
	        System.out.print("Enter any name: ");
	        nombre = console.next();
	        
		for (int i = 0; i<nombre.length(); i++) {
			System.out.println(nombre.charAt(i));
		}
		console.close();
	}
}
