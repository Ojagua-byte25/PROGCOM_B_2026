/******************************************************************************

edad=int(input("Cuál es tu edad?"))
if edad>=18:
  print("Usted es mayor de edad.")
else:
  print("Usted es menor de edad")

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Cuál es tu edad: ");
        Scanner edad= new Scanner(System.in);
        //nextLine sirve para Leer string
        //nextLine sirve para Leer enteros
        //nextFloat sirve para leer flotante (decimales)
         int age = edad.nextInt();
	
	    if (age<10){
	        System.out.println("Eres un niño");
	    }else
	    if (age >= 10 && age < 14){   
	        System.out.println("Eres un preadolescente");
	    }else
	    if (age >= 14 && age < 18){
	        System.out.println("Eres un adolesecente");
        }else
        if (age >= 18 && age < 30){
             System.out.println("Eres un adulto joven");
        }else
            System.out.println("Eres un adulto");
	    
          
            
            
            
            
            
            if (age<10){
	             System.out.println("Eres un niño");
	         }else if (age >= 10 && age < 14){   
	                System.out.println("Eres un preadolescente");
	          }else if (age >= 14 && age < 18){
	                System.out.println("Eres un adolesecente");
             }else if (age >= 18 && age < 30){
                 System.out.println("Eres un adulto joven");
              }else{
                  System.out.println("Eres un adulto");
              }
        
	    
	}
	    }
	