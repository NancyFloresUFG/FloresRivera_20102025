/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package floresrivera_20102025;

/*
Nancy Beatriz Flores Rivera - FR100524
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Pila miPila = new Pila(5);
         System.out.println("¿La pila esta vacia? " + miPila.esta_vacia());
         System.out.println("");
         System.out.println("AGREGANDO VALORES CON METODO PUSH ()");
         miPila.push(10);
         miPila.push(20);
         miPila.push(30);
         miPila.push(40);
         miPila.push(50);
         
         System.out.println();//Salto de línea
         
         miPila.mostrar();
         System.out.println("Tamaño actual de la pila: " + miPila.tamano() + " elementos.");
         System.out.println();//Salto de línea
          
         System.out.println("Agregar elemento nuevo con la pila llena.");
         miPila.push(60);
         System.out.println();//Salto de línea
         
         System.out.println("Verificacion del ultimo valor agregado:");
         System.out.println("El elemento de la cima es:" + miPila.peek());
         System.out.println();//Salto de línea
         
         System.out.println("Extraer valores de la pila:");
         System.out.println("Se ha extraido el valor de: " + miPila.pop()); // Se extrae el último elemento de la pila
         System.out.println("Se ha extraido el valor de: " + miPila.pop()); // Nuevamente se extrae el último elemento de la pila
         System.out.println();//Salto de línea
         
         System.out.println("Mostrando valores de la pila");
         miPila.mostrar();
         System.out.println("Tamano actual de la pila: " + miPila.tamano() + " elementos.");
         System.out.println();//Salto de línea
         
         System.out.println("Se extraen todos los elementos de la pila.");
         while(!miPila.esta_vacia()){ // Se recorren los valores de la pila
             System.out.println("Se ha extraido el valor de: " + miPila.pop());
         }
         System.out.println();//Salto de línea
         
         miPila.pop();
         System.out.println("Verificacion del ultimo valor agregado.");
         System.out.println("El elemento de la cima es: " +  miPila.pop());
         System.out.println();//Salto de línea
    }
    
}
