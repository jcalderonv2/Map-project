package map;

/**
 *
 * @author Josue
 */
public class VertexList {

    private NodoList inicio;
    private int tamanio;
    int length;

    public void Lista() {
        inicio = null;
        tamanio = 0;
    }

    public boolean esVacia() {
        return inicio == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void agregarAlFinal(Vertex valor) {

        NodoList nuevo = new NodoList();

        nuevo.setValor(valor);

        if (esVacia()) {

            inicio = nuevo;

        } else {

            NodoList aux = inicio;

            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }

            aux.setSiguiente(nuevo);
        }
        tamanio++;
    }

    public void listar() {

        if (!esVacia()) {

            NodoList aux = inicio;

            int i = 1;

            while (aux != null) {

                System.out.print("\n -> " + aux.getValor());

                aux = aux.getSiguiente();

                i++;
            }
        }
    }

}
