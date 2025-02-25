package ListaEstatica;

public class ListaEstaticaTest {
    ListaEstatica lista = new ListaEstatica();

    public void testRetirarElemento() {
        lista.inserir(5);
        lista.inserir(10);
        lista.inserir(15);
        lista.inserir(20);

        try {
            lista.retirar(5);
        } catch (IndexOutOfBoundsException e){

        }
    }
}