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
}
