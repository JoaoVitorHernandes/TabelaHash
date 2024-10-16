public class Main {
    public static void main(String[] args) {
        TabelaHash tabelaHash = new TabelaHash();

        int[] valores = {12, 25, 37, 41, 53, 64, 78, 89};
        for (int valor : valores) {
            tabelaHash.inserir(valor);
        }

        System.out.println("\nTabela após inserções:");
        tabelaHash.exibirTabela();

        System.out.println("\nTestando buscas:");
        tabelaHash.buscar(25);
        tabelaHash.buscar(89);
        tabelaHash.buscar(100);

        System.out.println("\nTestando remoções:");
        tabelaHash.remover(25);
        tabelaHash.remover(64);

        System.out.println("\nTabela após remoções:");
        tabelaHash.exibirTabela();
    }
}
