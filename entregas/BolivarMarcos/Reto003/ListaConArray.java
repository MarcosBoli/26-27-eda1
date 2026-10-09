package entregas.BolivarMarcos.Reto003;

class ListaConArray{
    private int[] datos;
    private int cantidad;

    public ListaConArray() {
        datos= new int[4];
        cantidad = 0;
    }

    public void agregar(int dato){
        datos[cantidad]= dato;
        cantidad++;
    }

    public void imprimir(){
        System.out.print("[");
        for (int i=0; i< cantidad; i++){
            System.out.print(datos[i]);
            if (i<cantidad-1){
                System.out.print(",");
            }
        }
        System.out.println("] cantidad="+ cantidad+ " capacidad ="+datos.length);
    }   
}