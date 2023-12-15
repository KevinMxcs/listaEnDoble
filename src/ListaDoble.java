
public class ListaDoble {
    	Node topForward;
	    Node topBackward;

	//Métodos para los casos de inserción de nodos
	public boolean insertaPrimerNodo(String dato){
		if (topForward == null) { //La lista está vacía
			topForward = new Node();
			topForward.name = dato;
			topForward.previous = null;
			topForward.next = null;
			
			topBackward = topForward;

			return true;
		}
		else {
			return false;
		}
	}
	
	public void imprimir(){
		System.out.print("[X]"); 

		for (Node temp = this.topForward; temp != null; temp = temp.next){
			System.out.print(" <- [ " + temp.name + " ] -> ");
		}

		System.out.print("[X]\n"); 
	}
	
	public String toString(){
		String cadAux = "[X]";
		for (Node temp = this.topForward; temp != null; temp = temp.next){
			cadAux += " <- [ " + temp.name + " ] -> ";
		}

		cadAux += "[X]\n"; 

		return cadAux;
	}

	public void insertaAntesPrimerNodo(String nombre){
		Node temp; 
		temp = new Node ();
		temp.name = nombre;
		temp.next = this.topForward;
		this.topForward.previous = temp;
		this.topForward = temp;
		temp = null;
	}

	public void insertaAlFinal(String nombre){
		Node temp = new Node ();
		temp.name = nombre;
		temp.next = null;
		
		temp.previous = this.topBackward;
		this.topBackward.next = temp;
		this.topBackward = temp;
		temp = null;
	}

	public boolean insertaEntreNodos(String nombre, String buscado){
		Node temp = new Node();
		temp.name = nombre;
		Node temp2 = this.topForward;

		//boolean NodoNoEncontrado = true;

		while ( (temp2 != null) 
				&& temp2.name.equals(buscado) == false ) {	
		         temp2 = temp2.next;
		}

		if (temp2 != null){  //Nodo buscado se encontró
			temp.next = temp2.next;
			temp2.next = temp;

			temp.previous = temp2;
			temp.next.previous = temp;

			temp = null;
			temp2 = null;
			
			return true;
		}
		else return false;
	} 
	
	//Métodos de borrado
	public void borrarPrimerNodo(){
		this.topForward = this.topForward.next;
		this.topForward.previous.next = null;
		this.topForward.previous = null;
	}

	public void borrarUltimoNodo(){
		this.topBackward = this.topBackward.previous;
		this.topBackward.next.previous = null;
		this.topBackward.next = null;
	}

	
	//Borrar cualquier nodo que no sea el primero
	public boolean borrarCualquierNodo(String buscado){
		Node temp = this.topForward;

		while ( (temp != null) 
				&& temp.name.equals(buscado) == false ) {	
		         temp = temp.next;
		}

		if (temp != null){  //Nodo buscado se encontró
			temp.previous.next = temp.next;
			temp.next.previous = temp.previous;
			temp.next = null;
			temp.previous = null;
			temp = null;
			
			return true;
		}
		else return false;
	}

	//TODO: Crear el método para borrar el nodo buscado
	//Adecuación del método de borrado: borrarCualquierNodo()
    public Node buscarPorValor(String valor) {
        Node actual = topForward;
        Node actual2 = topBackward;

        // Buscar en sentido directo
        while (actual != null) {
            if (actual.name.equals(valor)) {
                return actual; // Nodo encontrado
            }
            actual = actual.next;
        }

        // Buscar en sentido inverso
        actual2 = obtenerUltimoNodo();

        while (actual2 != null) {
            if (actual2.name.equals(valor)) {
                return actual2; // Nodo encontrado
            }
            actual2 = actual2.previous;
        }

        return null; // Nodo no encontrado
    }

    // Método auxiliar para obtener el último nodo de la lista
    private Node obtenerUltimoNodo() {
        Node actual2 = topBackward;
        while (actual2 != null && actual2.next != null) {
            actual2 = actual2.next;
        }
        return actual2;
    }
    // Método para buscar un nodo por su campo e insertar un nuevo nodo después de él
    public void insertarDespuesDeValor(String valor, String newsValor) {
        Node actual = topForward;

        while (actual != null) {
            if (actual.name.equals(valor)) {
                // Nodo encontrado, insertar después de este nodo
                Node nuevoNodo = new Node();
                nuevoNodo.name = valor;
                nuevoNodo.next = actual.next;
                nuevoNodo.previous = actual;
                
                if (actual.next != null) {
                    actual.next.previous = nuevoNodo;
                }

                actual.next = nuevoNodo;
                return;
            }
            actual = actual.next;
        }
    }
    // Método para intercambiar un nodo por otro buscado
    public void intercambiarNodos(String valorNodo, String newsValor) {
        Node actual = topForward;

        // Buscar el nodo a intercambiar
        while (actual != null) {
            if (actual.name.equals(valorNodo)) {
                // Nodo encontrado, intercambiar este nodo
                actual.name = newsValor;
                return;
            }
            actual = actual.next;
        }
    }
}

