/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo.com.primerparcial;
 /*
 *
 * @author Angel Carranza
 */
public class ListaSimple {
    Nodo cabeza;//referencia al primer nodo de la lista 
    
    //contructor para inicializar la lista como vacia
    
   public ListaSimple(){
   this.cabeza=null; //inicializamos la lista vacia
   }
    
   //Metodo para insertar un nuevo nodo al inicio de la lista
    public void insertarAlInicio(String dato){
        Nodo nuevoNodo = new Nodo(dato); //crea un nuevo nodo con el valor proporcionado
        nuevoNodo.siguiente = cabeza; //establece el siguiente del nuevo nodo como la cabeza actual
        cabeza = nuevoNodo; //Actualiza la cabeza para que apunte al nuevo nodo
    }

    //Metodo para hacer buscar un elemento en la lista
    public boolean buscar(String dato){
        Nodo temp = cabeza;
        while(temp != null){ //recorre la lista
            if(temp.dato.equals(dato)){//compara el valor del nodo con el dato buscado
                return true; //retorna true si lo encuentra   
            }
            temp = temp.siguiente;
        }
        return false; //retorna false si no lo encuentra
    }

    //Metodo para imprimir los elementos de la lista
    public void imprimirLista(){
        Nodo temp = cabeza;
        System.out.println("Lista: ");
        while (temp != null){//recorre la lista
            System.out.print(temp.dato + " ");//imprime el valor del nodo actual
            temp = temp.siguiente; //Avanza al siguiente nodo
        }
        System.out.println();
    }
}