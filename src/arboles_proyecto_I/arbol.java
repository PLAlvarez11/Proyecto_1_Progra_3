package arboles_proyecto_I;

public class arbol extends nodo{
	private pila pilaNodos = new pila();

    public arbol(int dato) {
        super(dato);
    }

    public void agregar(int dato) {
    	nodo nuevoNodo = new nodo(dato);
        if (pilaNodos.esVacia()) {
            pilaNodos.pushIzquierda(nuevoNodo);
        } else {
        	nodo nodoActual = pilaNodos.getCima();
            if (dato < nodoActual.getDato()) {
                nodoActual.setHojaIzquierda(nuevoNodo);
                pilaNodos.pushIzquierda(nuevoNodo);
            } else {
                nodoActual.setHojaDerecha(nuevoNodo);
                pilaNodos.pushDerecha(nuevoNodo);
            }
        }
    }

    public void eliminar(int dato) {
        if (pilaNodos.esVacia()) {
            return;
        }
        nodo nodoActual = pilaNodos.getCima();
        if (dato == nodoActual.getDato()) {
            pilaNodos.pullIzquierda();
            if (!pilaNodos.esVacia()) {
                nodoActual = pilaNodos.getCima();
                if (nodoActual.getHojaIzquierda() != null) {
                    pilaNodos.pushIzquierda(nodoActual.getHojaIzquierda());
                } else if (nodoActual.getHojaDerecha() != null) {
                    pilaNodos.pushDerecha(nodoActual.getHojaDerecha());
                }
            }
        } else if (dato < nodoActual.getDato()) {
        	delete(dato, nodoActual.getHojaIzquierda());
        } else {
        	delete(dato, nodoActual.getHojaDerecha());
        }
    }

    private void delete(int dato, nodo nodo) {
        if (nodo == null) {
            return;
        }
        if (dato == nodo.getDato()) {
            pilaNodos.esVacia();
            if (nodo.getHojaIzquierda() != null) {
                pilaNodos.pushIzquierda(nodo.getHojaIzquierda());
            } else if (nodo.getHojaDerecha() != null) {
                pilaNodos.pushDerecha(nodo.getHojaDerecha());
            }
        } else if (dato < nodo.getDato()) {
        	delete(dato, nodo.getHojaIzquierda());
        } else {
        	delete(dato, nodo.getHojaDerecha());
        }
    }
}
