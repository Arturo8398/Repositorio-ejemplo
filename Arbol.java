import java.util.Stack;
public class Arbol {
    private NodoArbol raiz;

    public void insertar(int valor){
        if (raiz == null) {
            raiz = new NodoArbol(valor);
        } else {
            raiz.insertar(valor);
        }
    }

    public void recorridoEnOrden(){
        if (raiz != null) {
            raiz.recorridoEnOrden();
        }
    }

    public void recorridoPreOrden(){
        if(raiz != null){
            raiz.recorridoPreOrden();
        }
    }

    public void recorridoPostOrden(){
        if(raiz != null){
            raiz.recorridoPostOrden();
        }
    }

    public void imprimirArbol(){
        Stack globalStack = new Stack();
        globalStack.push(raiz);
        int espaciosEnBlanco = 32;
        boolean estaRenglonVacio = false;
        System.out.println("\n------------------------------------------------------------------");
        while(!estaRenglonVacio){
            Stack localStack = new Stack();
            estaRenglonVacio = true;

            for (int i = 0; i < espaciosEnBlanco; i++)
                System.out.print(' ');

            while (!globalStack.isEmpty()) {
                NodoArbol temp = (NodoArbol) globalStack.pop();
                if (temp != null) {
                    System.out.print(temp.getDato());
                    localStack.push(temp.getHijoIzquierdo());
                    localStack.push(temp.getHijoDerecha());

                    if (temp.getHijoIzquierdo() != null || temp.getHijoDerecha() != null)
                    estaRenglonVacio = false;
                } else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int i = 0; i < espaciosEnBlanco * 2 - 2; i++)
                    System.out.print(' ');
            }
                System.out.println();
                espaciosEnBlanco /= 2;

                while (!localStack.isEmpty()) 
                    globalStack.push(localStack.pop());
        }
        System.out.println("------------------------------------------------------------------");
    }
}
