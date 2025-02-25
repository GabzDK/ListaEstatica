package ListaEstatica;

public class Exemplo {
    public static void main(String[] args) {
        ListaEstatica lista = new ListaEstatica();
        lista.inserir(55);
        lista.inserir(66);
        lista.inserir(77);

        for (int i = 0; i < lista.getTamanho(); i++) {
            System.out.println(lista.obterElemento(i) + " esta armazenada");
        }
    }
}
