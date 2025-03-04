// Classe que representa o Cofrinho, onde as moedas serão armazenadas
import java.util.ArrayList;

public class Cofrinho {
    ArrayList<Moeda> listaMoedas;  // Lista que armazena as moedas no cofrinho

    // Construtor que inicializa a lista de moedas
    public Cofrinho() {
        listaMoedas = new ArrayList<>();
    }

    // Método para adicionar uma moeda ao cofrinho
    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
    }

    // Método para remover uma moeda do cofrinho
    public void remover(Moeda moeda) {
        listaMoedas.remove(moeda);
    }

    // Método para listar todas as moedas no cofrinho
    public void listagemMoedas() {
        if (listaMoedas.isEmpty()) {
            System.out.println("O cofrinho está vazio.");  // Se o cofrinho estiver vazio
        } else {
            // Se houver moedas, percorre a lista e imprime as informações sobre cada moeda
            for (Moeda moeda : listaMoedas) {
                System.out.println(moeda.info() + " - " + moeda);
            }
        }
    }

    // Método para calcular o total de moedas no cofrinho convertido para Real
    public double totalConvertido() {
        double total = 0;
        // Percorre todas as moedas e converte cada uma para Real
        for (Moeda moeda : listaMoedas) {
            total += moeda.converter();  // Soma o valor convertido para Real
        }
        return total;  // Retorna o total convertido
    }
}
