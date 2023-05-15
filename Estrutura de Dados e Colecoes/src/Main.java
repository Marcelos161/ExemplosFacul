import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {

    static void exemploFila() {
        Queue<String> fila = new LinkedList<>();

        // Adicionar elementos
        fila.add("João");
        fila.add("Maria");
        fila.add("Pedro");

        // Verificar o tamanho
        System.out.println("Tamanho = " + fila.size());

        // Acessar o elemento da frente
        String primeiroElemento = fila.peek();
        System.out.println("Primeiro da fila: " + primeiroElemento);

        // Desenfileirar (Fila anda)
        String primeiroDaFila = fila.remove();

        // Pesquisa
        boolean contemMaria = fila.contains("Maria");

        // Iterar na fila
        // Enquanto a fila não estiver VAZIA
        while (!fila.isEmpty()) {
            String pessoa = fila.remove();
            System.out.println(pessoa + " ");

        }

        System.out.println(fila.size());
    }

    static void exemploPilha() {
        Stack<Character> pilha = new Stack<>();

        //Adicionar elementos
        pilha.push('A');
        pilha.push('E');
        pilha.push('I');
        pilha.push('O');
        pilha.push('U');

        //Tamanho da pilha
        System.out.println("Tamanho = " + pilha.size());

        //Acessar o elemento no topo da pilha
        char elementoDoTopo = pilha.peek();

        //
        boolean contemA = pilha.contains('A');

        //Iterar na pilha
        while (!pilha.isEmpty()) {
            char livro = pilha.remove();
            System.out.println();
        }

    }

    static void exemploListas() {

        ArrayList<String> lista = new ArrayList<>();

        // Verificar o Tamanho
        System.out.println("Tamanho = " + lista.size());

        // Adicionar itens
        lista.add("\uD83E\uDD13"); // 🤓 Adicionar emojis
        lista.add("\uD83E\uDD21");
        lista.add("\uD83E\uDD33");
        lista.add("\uD83D\uDC69\u200D\uD83D\uDCBB");

        // Mostrar itens
        System.out.println("Apenas um item = " + lista.get(0));
        System.out.println("Itens da lista = " + lista);


        // Iterar nos elementos com foreach
        for (String emojis : lista) {
            System.out.println(emojis);
        }

        // Verificar tamnho e existencia
        System.out.println("Tamanho = " + lista.size());
        System.out.println("A lista está vazia? " + lista.isEmpty());

        // Excluir item da lista
        lista.remove("\uD83E\uDD21");
        lista.remove(0);

        // Pesquisar item na lista
        System.out.println("Tem \uD83E\uDD21: " + lista.contains("\uD83E\uDD21" ));
        System.out.println("Indice \uD83E\uDD21: " + lista.indexOf("\uD83E\uDD21"));
    }
    public static void main(String[] args) {
        exemploListas();
        exemploFila();
    }
}