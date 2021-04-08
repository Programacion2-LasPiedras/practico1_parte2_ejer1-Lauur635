import java.util.Scanner;

 class Main {

	public static void main(String[] args) {
		
		
	        Scanner sc = new Scanner(System.in);
	        String nombre;
	        int edad;
	        double altura;
	        long cédula;
	       
	        System.out.println("Nombre ");
	           nombre = sc.nextLine();
	        
	        System.out.print("Edad: ");
	          edad = sc.nextInt();
	          
	         System.out.print("Ingrese altura: ");
	         altura = sc.nextDouble();

	         
	        System.out.print("Cédula  ");
	         cédula = sc.nextLong();
	        
	        System.out.println("Nombre: "+nombre);
	        System.out.println("Edad: "+ edad);
	        System.out.println("Cédula: "+cédula);
	        System.out.println("Altura: "+altura);
	    
		
		
		
  }

}
