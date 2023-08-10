public class Main {
    public static void main(String[] args) {
        Arbol arbolEnteros = new Arbol();

        arbolEnteros.insertar(12);
        arbolEnteros.insertar(46);
        arbolEnteros.insertar(85);
        arbolEnteros.insertar(15);
        arbolEnteros.insertar(32);
        arbolEnteros.insertar(78);
        arbolEnteros.insertar(42);
        arbolEnteros.insertar(14);
        System.out.println("Se muestran los tipos de recorridos de");
        System.out.println("árboles binarios: \n");
        System.out.println("Se imprime el árbol binario: ");
        arbolEnteros.imprimirArbol();
        System.out.println("-->Recorrido InOrder<--");
        arbolEnteros.recorridoEnOrden();
        System.out.println("\n-->Recorrido PreOrder<--");
        arbolEnteros.recorridoPreOrden();
        System.out.println("\n-->Recorrido PostOrden<--");
        arbolEnteros.recorridoPostOrden();
    }
}
