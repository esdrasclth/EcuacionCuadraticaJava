/* 
 *  Programa en Java que permite realizar ecuaciones cuadraticas o tambien conocidas como ecuaciones de segundo grado, 
    de la forma ax^2 + bx + c = 0, para ello haremos uso de la formula general cuadratica.

 *  Investigado en: https://www.geogebra.org/m/x8agg4qb, https://www.montereyinstitute.org/courses/DevelopmentalMath/TEXTGROUP-15-19_RESOURCE/U16_L5_T2_text_final_es.html#:~:text=Esta%20f%C3%B3rmula%20es%20muy%20%C3%BAtil,%2B%20bx%20%2B%20c%20%3D%200.
                    https://www.superprof.es/apuntes/escolar/matematicas/algebra/ecuaciones/ejercicios-ecuaciones-de-segundo-grado.html
 *  @author EsdrasClother
 */
package tareaecuacioncuadratica;
import java.util.*;

public class TareaEcuacionCuadratica {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int valora, valorb, valorc, opcion = 0;
        double discriminante, resultadox1, resultadox2;
        boolean error;

        
        System.out.println("¡BIENVENIDO AL SISTEMA!\n");
        System.out.println("El siguiente programa le permitira resolver ecuaciones cuadraticas de la forma: ax^2 + bx + c = 0");
        
        System.out.println("1 - Continuar con la operacion.");
        System.out.println("2 - Salir. \n");
        
        do {
            try {        
                System.out.print("ELIJE UNA OPCION: ");
                opcion = entrada.nextInt();
                error = false;
            }catch(Exception e) {
                System.out.println("La opcion no esta dentro del menu, por favor ingrese una opcion valida.");
                error = true;
                entrada.nextLine();
            }
        } while(error);
        
        if (opcion != 2){
            
            System.out.print("Por favor ingrese el valor de a: ");
            valora = entrada.nextInt();
                
            System.out.print("Por favor ingrese el valor de b: ");
            valorb = entrada.nextInt(); 

            System.out.print("Por favor ingrese el valor de c: ");
            valorc = entrada.nextInt();
            
            // 0x^2 + 0x + 0 = 0
            if ((valora == 0) && (valorb == 0) && (valorc == 0)) {
                System.out.println("La ecuación tiene infinitas soluciones.");
            }
            
            // 0x^2 + 0x + c = 0  con c distinto de 0
            if ((valora == 0) && (valorb == 0) && (valorc != 0)) {
                System.out.println("La ecuación no tiene solución.");
            }
            
            // ax^2 + bx + 0 = 0  con a y b distintos de 0
            if ((valora != 0) && (valorb != 0) && (valorc == 0)) {
              System.out.println("La solucion para X1 es = 0");
              System.out.println("La solucion para X2 es = " + (-valorb / valora));
            }
            
            // 0x^2 + bx + c = 0  con b y c distintos de 0
            if ((valora == 0) && (valorb != 0) && (valorc != 0)) {
              System.out.println("x1 = x2 = " + (-valorc / valorb));
            }
            
            // ax^2 + bx + c = 0  con a, b y c distintos de 0
    
            if ((valora != 0) && (valorb != 0) && (valorc != 0)) {

                discriminante = (valorb * valorb) - (4 * valora * valorc);

              if (discriminante < 0) {
                  System.out.println("La ecuación no tiene soluciones reales");
              }  else {

                resultadox1 = (-valorb + Math.sqrt((valorb*valorb)-(4*valora*valorc)))/(2*valora);
                resultadox2 = (-valorb - Math.sqrt((valorb*valorb)-(4*valora*valorc)))/(2*valora);
              
                System.out.println("La solucion para X1 es: " + resultadox1);
                System.out.println("La solucion para X2 es: " + resultadox2);
              }

            }
       
        }
        
         System.out.println("\n¡Gracias por usa el programa! :D");
    }
}
