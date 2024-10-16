public class TabelaHash {
    private int[] tabela;
    private static final int TAMANHO = 10;

    public TabelaHash() {
        tabela = new int[TAMANHO];
        for (int i = 0; i < TAMANHO; i++) {
            tabela[i] = 0; // Inicializa a tabela com 0 indicando vazio
        }
    }

    private int hash(int chave) {
        return chave % TAMANHO;
    }

    public void inserir(int chave) {
        int indice = hash(chave);
        tabela[indice] = chave;
        System.out.println("Inserido: " + chave + " no índice " + indice);
    }

    public boolean buscar(int chave) {
        int indice = hash(chave);
        if (tabela[indice] == chave) {
            System.out.println("Chave " + chave + " encontrada no índice " + indice);
            return true;
        }
        System.out.println("Chave " + chave + " não encontrada.");
        return false;
    }

    public void remover(int chave) {
        int indice = hash(chave);
        if (tabela[indice] == chave) {
            tabela[indice] = 0;
            System.out.println("Chave " + chave + " removida do índice " + indice);
        } else {
            System.out.println("Chave " + chave + " não encontrada para remoção.");
        }
    }

    public void exibirTabela() {
        System.out.println("Tabela Hash:");
        for (int i = 0; i < TAMANHO; i++) {
            System.out.println("Índice " + i + ": " + tabela[i]);
        }
    }
}
