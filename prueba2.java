import java.util.Scanner;
public class void main(String[] args){

 Scanner lector = new Scanner(System.in);
 //tema de arte 
 System.out.println("\n \n Modelo de inventario de arte \n");
 System.out.println("Este programa calcula el inventario de materiales artisticos: ")
 System.out.println("Ejemplo: pintura acrilica, pinceles, lienzo, acuarelas" );
 Systema.out.println("\n \n \n");


 // variables principales 
 System.out.println(" ingresar la demanda anual (D): ");
 double D = lector.nextDouble();
 System.out.println(" ingrese el costo por ordenar (S): ");
 double S = lector.nextDouble();
 System.out.println("ingresa el costo de mantener el inventario por unidad (H): ");
 double H = lector.nextDouble();
 System.out.print("Costo por unidad (C): ");
 double C = lector.nextDouble();
 System.out.println("\n Hay descuento por cantidad (1 = si, 0 = No: ");
 int opcion = lector.nextInt();
double descuento = 0;

        if(d == 1){
            System.out.print("Ingresa el % de descuento (ej 0.10): ");
            descuento = lector.nextDouble();
            C = C - (C * descuento); // aqui le bajo el precio
            System.out.println("Nuevo costo unitario: "+C);
        }

        // fórmula EOQ
        double Q = Math.sqrt((2 * D * S) / H);

        // fórmula CT
        double CT = (D/Q)*S + (Q/2)*H + (D*C);

        // resultados
        System.out.println("\n---- RESULTADOS ----");
        System.out.println("EOQ o cantidad económica: " + Q);
        System.out.println("Costo total anual CT: " + CT);

        // comentario random de arte
        System.out.println("Esto sirve para no quedarte sin pintura en tu taller y sin material :)");
    }
}


