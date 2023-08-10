public class NodoArbol {
    private int dato;
    private NodoArbol hijoIzquierdo;
    private NodoArbol hijoDerecho;

    public void insertar(int valor) {
        if (valor == dato) {
            return;
        }
        if (valor < dato) {
            if (hijoIzquierdo == null) {
                hijoIzquierdo = new NodoArbol(valor);
            } else {
                hijoIzquierdo.insertar(valor);
            }
        } else {
            if (hijoDerecho == null) {
                hijoDerecho = new NodoArbol(valor);
            } else {
                hijoDerecho.insertar(valor);
            }

        }
    }

    public void recorridoEnOrden() {
        if (hijoIzquierdo != null) {
            hijoIzquierdo.recorridoEnOrden();
        }
        System.out.print(dato + "-> ");
        if (hijoDerecho != null) {
            hijoDerecho.recorridoEnOrden();
        }
    }

    public boolean externo() {
        return (hijoIzquierdo == null && hijoDerecho == null);
    }

    public void recorridoPreOrden() {
        System.out.print(dato + "-> ");
        if (hijoIzquierdo != null) {
            hijoIzquierdo.recorridoPreOrden();
        }
        if (hijoDerecho != null) {
            hijoDerecho.recorridoPreOrden();
        }
    }

    public void recorridoPostOrden() {
        if (this == null)
            return;
        if (hijoIzquierdo != null)
            if (hijoIzquierdo.externo())
                System.out.print(hijoIzquierdo.getDato() + "-> ");
            else
                hijoIzquierdo.recorridoPostOrden();
        if (hijoDerecho != null)
            if (hijoDerecho.externo())
                System.out.print(hijoDerecho.dato + "-> ");
            else
                hijoDerecho.recorridoPostOrden();
        System.out.print(dato + "-> ");

    }

    public NodoArbol(int dato) {
        this.dato = dato;
    }

    public int getDato() {
        return dato;
    }

    public NodoArbol getHijoIzquierdo() {
        return hijoIzquierdo;
    }

    public NodoArbol getHijoDerecha() {
        return hijoDerecho;
    }
}