/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package map;

/**
 *
 * @author Josue
 */
public class NodoList {
    
    private Vertex valor;
    // Variable para enlazar los nodos.
    private NodoList siguiente;
    /**
     * Constructor que inicializamos el valor de las variables.
     */
    public void Nodo(){
        this.valor = null;
        this.siguiente = null;
    }
    
    // Métodos get y set para los atributos.
    
    public Vertex getValor() {
        return valor;
    }

    public void setValor(Vertex valor) {
        this.valor = valor;
    }

    public NodoList getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoList siguiente) {
        this.siguiente = siguiente;
    }   
    
}
