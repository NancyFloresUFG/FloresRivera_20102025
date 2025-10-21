/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package floresrivera_20102025;

/*
Nancy Beatriz Flores Rivera - FR100524
 */
public class Pila {
    
     private int [] elementos; // Elementos será un arreglo
     private int cima;
     private int capacidad;
     
     public Pila(int tamano){ // Método constructor de la clase pila
         this.capacidad = tamano; // Define el tamaño de la pila
         this.elementos = new int[this.capacidad]; // Define los elementos que estarán en la pila
         this.cima = - 1;
     }
     public boolean esta_vacia(){ // Método para verificar si la pila está vacía
         if(this.cima == - 1){
             return true;
         }
         else{
             return false;
         }
     }
     public boolean esta_llena(){ // Método para verificar si la pila está llena
         if(this.cima == (this.capacidad - 1)){
             return true;
         }
         else{
             return false;
         }
     }
     public int tamano(){ // Devuelve el valor de la cima
         return this.cima + 1;
      }
     // Método para agregar elementos al arreglo, primero se verifica el tamaño
     public void push (int elemento){
         if(esta_llena()){
             System.out.println("La pila esta llena, no puede agregar el valor: "+ elemento);
         }
         else{
             this.cima ++; // Se incrementa el valor de la cima
             this.elementos[this.cima] = elemento; // Se agrega el nuevo elemento al arreglo (PILA)
             System.out.println("El valor: " + elemento + " fue agregado a la pila.");
         }
     }
     // Método para extraer elemento de la pila
     public int pop(){
         if(esta_vacia()){
             // Se verifica que la pila no esté vacía
             System.out.println("La pila está vacia, no puede hacer la extracción del elemento.");
             return - 1; // No se realiza ninguna acción
         }
         else{ //Si hay elementos que extraer y se crea una variable para el elemento a extraer
             int elemento_extraido = this.elementos[this.cima]; // La nueva variable tiene el valor del último elemento insertado en la pila
             this.cima --; // Se reduce el valor de la cima
             return elemento_extraido; // Se devuelve el valor que fue extraído
         }
     }
     public int peek(){ // Método para verificar el último valor insertado, el posible valor a extraer
         if(esta_vacia()){ // Verifica si está vacía
             System.out.println("La pila esta vacia.");
             return - 1; // No se devuelve ningún valor
         }
         else{ // Devuelve el último elemento insertado
             return this.elementos[this.cima];
         }
     }
     public void mostrar(){ // Método para mostrar todos los valores que tiene una pila
         if(esta_vacia()){
             System.out.println("La pila esta vacia.");
         }
         else{
             System.out.print("Contenido de la pila (desde la cima, hasta la base de la pila.");
             System.out.print(" [ ");
             // Se debe recorrer el arreglo para imprimir cada valor
             // Mientras el valor de i sea mayor que 0 o sea que no ha llegado a la base, seguirá recorriendo
             for(int i = this.cima; i >= 0; i--){
                 System.out.print(this.elementos[i]);
                 if(i > 0){ // No ha llegado a 0 por lo tanto se imprime una coma
                    System.out.print(" , ");
                 }
             } // Se cierra la estructura
             System.out.print(" ] ");
         }
     }
}
