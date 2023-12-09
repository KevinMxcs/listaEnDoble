public class App {
    public static void main(String[] args) throws Exception {
        ListaDoble lista = new ListaDoble();
        lista.insertaPrimerNodo("A");
        lista.insertaAlFinal("B");
        lista.insertaAntesPrimerNodo("C");
        lista.insertaEntreNodos("C", "A");
        lista.insertarDespuesDeValor("A", "D");
        lista.intercambiarNodos("A", "D");
        lista.buscarPorValor("A");
        lista.imprimir();
    }
}
