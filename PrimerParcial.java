/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package poo.com.primerparcial;
import java.util.Scanner;
/**
 *
 * @author Angel Carranza
 */
public class PrimerParcial {

public static void main(String[] args){
   Scanner scanner = new Scanner(System.in); //crea un objeto Scaner para la entrada de usuario
       ListaSimple lista = new ListaSimple();

       while(true){//bucle infinito para mantener el programa en ejecucion
          // Muestra las opciones del menu
          System.out.println("\nOpciones: ");
          System.out.println("1. Insertar elemento");
          System.out.println("2. Buscar un elemento");
          System.out.println("3. Imprimir lista");
          System.out.println("4. salir");
          System.out.println("Seleccione una opcion: ");
          int opcion = scanner.nextInt(); //Lee la opcion seleccionada por el usuario

          switch(opcion){//evalua la opcion seleccionada por el usuario

              case 1:
                  System.out.print("Ingrese el elemento a insertar al inicio: "); //solicita al usuario que ingrese el elemento
                  String elementoInicio = scanner.nextLine(); //Lee el elemento proporcionado por el usuario
                  lista.insertarAlInicio(elementoInicio); //inserta el elemento al inicio de la lista
                  break;

                  
              case 2:
                  System.out.print("Ingrese el elemento a buscar: "); //solicita al usuario que ingrese el elemento
                  String buscarElemento = scanner.nextLine(); //lee ele elemento proporcionado por el usuario
                  if(lista.buscar(buscarElemento)){//verifica si el elemento esta presente en la lista
                      System.out.println("El elemento " + buscarElemento + "esta en la lista.");
                  }else{
                      System.out.println("El elemento " + buscarElemento + "no esta en la lista.");
                  }
                  break;

              case 3:
                  lista.imprimirLista();//imprime la lista actual
                  break;

              case 4:
                  System.out.println("saliendo del programa..."); //muestraun mensaje de salida
                  scanner.close(); //cierra el objeto scanner
                  System.exit(0); //Finaliza el programa
              default:
                  System.out.println("Opcion invalida. Por favor, seleccione una opcion valida.");}
                
}}}

