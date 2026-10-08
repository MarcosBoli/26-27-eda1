package entregas.BolivarMarcos.Reto002;

class ListaEnlazada {

    private Nodo cabeza;

    public ListaEnlazada() {
        this.cabeza = null;
    }
    
    public void imprimirLista(){
        Nodo actual=cabeza;
        while (actual != null) {
            System.out.print(actual.dato+"->");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }

    public void insertarEnPosicion(int posicion, int dato) {
        Nodo dummy = new Nodo(-1);
        dummy.siguiente= cabeza;
        Nodo actual= dummy;
        int pasos=0;
        while (actual.siguiente != null && pasos < posicion) {
            actual = actual.siguiente;
            pasos++;
        }
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.siguiente = actual.siguiente;
        actual.siguiente= nuevoNodo;
        cabeza= dummy.siguiente;

    }
}
