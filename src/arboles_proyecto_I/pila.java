package arboles_proyecto_I;

public class pila {
	private nodo cima;

    public void pushIzquierda(nodo nuevoNodo) {
        if (cima == null) {
            cima = nuevoNodo;
        } else {
            nuevoNodo.setHojaIzquierda(cima);
            cima = nuevoNodo;
        }
    }

    public void pushDerecha(nodo nuevoNodo) {
        if (cima == null) {
            cima = nuevoNodo;
        } else {
            nuevoNodo.setHojaDerecha(cima);
            cima = nuevoNodo;
        }
    }
    
    public nodo pullIzquierda() {
        if (cima == null) {
            return null;
        } else {
            nodo aux = cima;
            cima = cima.getHojaIzquierda();
            return aux;
        }
    }
    
    public nodo pullDerecha() {
        if (cima == null) {
            return null;
        } else {
            nodo aux = cima;
            cima = cima.getHojaDerecha();
            return aux;
        }
    }

    public boolean esVacia() {
        return cima == null;
    }

	public nodo getCima() {
		return cima;
	}

	public void setCima(nodo cima) {
		this.cima = cima;
	}
}
