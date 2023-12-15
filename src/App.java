public class App {
    public static void main(String[] args) throws Exception {
        ListaDoble lista = new ListaDoble();
        lista.insertaPrimerNodo("A");
        lista.insertaAlFinal("B");
        lista.insertaAntesPrimerNodo("C");
        lista.imprimir();
        lista.insertaEntreNodos("C", "A");
        lista.imprimir();
        lista.insertarDespuesDeValor("A", "D");
        lista.imprimir();
        lista.intercambiarNodos("A", "D");
        lista.imprimir();
        lista.buscarPorValor("A");
        lista.imprimir();
        lista.borrarCualquierNodo("D");
        lista.imprimir();
        lista.borrarPrimerNodo();
        lista.imprimir();
        lista.borrarUltimoNodo();
        lista.imprimir();
    }
}
