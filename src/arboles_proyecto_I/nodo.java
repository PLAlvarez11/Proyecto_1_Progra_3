package arboles_proyecto_I;

public class nodo {
	private int dato;
    private nodo hojaIzquierda;
    private nodo hijoDerecha;
    
    public nodo(int dato) {
        this.dato = dato;
        this.hojaIzquierda = null;
        this.hijoDerecha = null;
    }

	public int getDato() {
		return dato;
	}

	public void setDato(int dato) {
		this.dato = dato;
	}

	public nodo getHojaIzquierda() {
		return hojaIzquierda;
	}

	public void setHojaIzquierda(nodo hijoIzquierdo) {
		this.hojaIzquierda = hijoIzquierdo;
	}

	public nodo getHojaDerecha() {
		return hijoDerecha;
	}

	public void setHojaDerecha(nodo hijoDerecho) {
		this.hijoDerecha = hijoDerecho;
	}
}