
package dpo1_u2_a2_lumg;
import java.util.Scanner;
import java.util.InputMismatchException;

public class DPO1_U2_A2_LUMG {
     private static Scanner sc;
  
        //Método registro
     public static int registro(int numero){
                return numero; 
     }

     //Método Capicua 
    public static boolean capicua(int num){
        return num==invnumero(num);
    }
     private static int invnumero(int num){
        int cifra, inverso = 0;
        while(num>0){
            cifra = num%10; 
            inverso = cifra + inverso * 10; 
            num /= 10;
        }
        return inverso;
    }
    
     //Método primo
     
     public static boolean primo(int num){
       int contador = 2;
       boolean primo=true;
       while ((primo )&& (contador!=num)){
           if(num % contador == 0 )
               primo = false;
           contador++;
       }
       return primo;
     }
     
     
     
     //Método de elevado al cuadrado
     public static int cuadrado(int num){
         int resultado = num*2;
         return resultado;
     }
     
   
            
     //Menú, registro y llamar métodos
    public static void main(String[] args) {
         sc = new Scanner(System.in);
         boolean salir = false;
         int opcion;
        
        
        while(!salir){
            System.out.println("1. opción 1");
            System.out.println("2. opción 2");
            System.out.println("3. opción 3");
            System.out.println("3. opción 4");
            System.out.println("5. salir");
            try {
                 System.out.println("Escribe una de las opciones");
                opcion = sc.nextInt();
                   System.out.print("Registra un número: "); 
                   
                
                int nume = registro(sc.nextInt());
                 boolean capicua = capicua(nume);
                  boolean primo = primo(nume);
                 int cuadrado = cuadrado(nume);
                
                switch (opcion){
                    
                    case 1:
                         break;
                    case 2:
                        System.out.println("El número " + nume + (capicua?" sí":" no") + " es capicua.");
                        break;
                    case 3:
                         System.out.println("El número "+nume + (primo?" si":" no") + " es primo");
                         break;
                    case 4:
                         System.out.println("El cuadrado de este numero es " +  cuadrado);
                         break; 
                      case 5:
                         salir = true;
                        break;
                        default:
                        System.out.println("Solo números entre 1 y 4");
                }
            }  catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sc.next();
        }
        }
    }
}