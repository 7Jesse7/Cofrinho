import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();  // Cria um cofrinho vazio

        while (true) {
            // Exibe o menu para o usuário
            System.out.println("\n--- Menu Cofrinho ---");
            System.out.println("1. Adicionar moeda");
            System.out.println("2. Remover moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular total em Real");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();  // Lê a opção escolhida pelo usuário

            // Ação de adicionar moeda
            if (opcao == 1) {
                System.out.println("Escolha a moeda a ser adicionada:");
                System.out.println("1. Dólar");
                System.out.println("2. Euro");
                System.out.println("3. Real");
                System.out.print("Escolha uma opção: ");
                int tipoMoeda = scanner.nextInt();  // Lê o tipo da moeda
                System.out.print("Digite o valor da moeda: ");
                double valor = scanner.nextDouble();  // Lê o valor da moeda

                Moeda moeda = null;  // Variável para armazenar a moeda a ser criada
                if (tipoMoeda == 1) {
                    moeda = new Dolar(valor);  // Cria uma moeda Dólar
                } else if (tipoMoeda == 2) {
                    moeda = new Euro(valor);  // Cria uma moeda Euro
                } else if (tipoMoeda == 3) {
                    moeda = new Real(valor);  // Cria uma moeda Real
                }

                if (moeda != null) {
                    cofrinho.adicionar(moeda);  // Adiciona a moeda no cofrinho
                    System.out.println("Moeda adicionada com sucesso!");
                }
            } 
            // Ação de remover moeda
            else if (opcao == 2) {
                System.out.println("Escolha a moeda a ser removida:");
                cofrinho.listagemMoedas();  // Exibe as moedas no cofrinho
                System.out.println("Digite o índice da moeda a ser removida (inicie de 0): ");
                int indice = scanner.nextInt();  // Lê o índice da moeda a ser removida
                if (indice >= 0 && indice < cofrinho.listaMoedas.size()) {
                    cofrinho.remover(cofrinho.listaMoedas.get(indice));  // Remove a moeda
                    System.out.println("Moeda removida com sucesso!");
                } else {
                    System.out.println("Índice inválido!");  // Caso o índice seja inválido
                }
            } 
            // Ação de listar moedas
            else if (opcao == 3) {
                System.out.println("Listagem de moedas no cofrinho:");
                cofrinho.listagemMoedas();  // Exibe todas as moedas armazenadas
            } 
            // Ação de calcular total em Real
            else if (opcao == 4) {
                double total = cofrinho.totalConvertido();  // Calcula o total convertido para Real
                System.out.println("Total em Real: R$" + total);
            } 
            // Ação de sair
            else if (opcao == 5) {
                System.out.println("Saindo...");  // Encerra o programa
                break;
            } 
            // Caso o usuário escolha uma opção inválida
            else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();  // Fecha o scanner
    }
}
