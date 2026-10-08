package entregas.BolivarMarcos.Reto002;

public class Main  {

    public static void main(String[] args) {
        ListaEnlazada lista = crear (new int[] { 1, 1, 2, 3, 3, 4 });
        lista.imprimirLista();

        ListaEnlazada vacia = crear(new int[] {});
        vacia.imprimirLista();
        
    }

    static ListaEnlazada crear(int[] datos){
        ListaEnlazada lista = new ListaEnlazada();
        for (int i= 0; i< datos.length; i++){
            lista.insertarEnPosicion(i, datos[i]);
        }
        return lista;
    } 
}
