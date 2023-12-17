public class App {
    public static void main(String[] args) throws Exception {
        ListaDoble lista = new ListaDoble();
        lista.insertaPrimerNodo("A");
        lista.insertaAlFinal("B");
        lista.insertaAntesPrimerNodo("C");
        lista.imprimir();
        lista.insertaEntreNodos("K", "A");
        lista.imprimir();
        lista.insertarDespuesDeValor("A", "D");
        lista.imprimir();
        lista.intercambiarNodos("A", "E");
        lista.imprimir();
        System.out.println(lista.buscarPorValor("A"));
        lista.borrarCualquierNodo("E");
        lista.imprimir();
        lista.borrarPrimerNodo();
        lista.imprimir();
        lista.borrarUltimoNodo();
        lista.imprimir();
    }
}
