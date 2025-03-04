import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();

        while (true) {
            System.out.println("\n--- Menu Cofrinho ---");
            System.out.println("1. Adicionar moeda");
            System.out.println("2. Remover moeda");
            System.out.println("3. Listar moedas");
            System.out.println("4. Calcular total em Real");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Escolha a moeda a ser adicionada:");
                System.out.println("1. Dólar");
                System.out.println("2. Euro");
                System.out.println("3. Real");
                System.out.print("Escolha uma opção: ");
                int tipoMoeda = scanner.nextInt();
                System.out.print("Digite o valor da moeda: ");
                double valor = scanner.nextDouble();

                Moeda moeda = null;
                if (tipoMoeda == 1) {
                    moeda = new Dolar(valor);
                } else if (tipoMoeda == 2) {
                    moeda = new Euro(valor);
                } else if (tipoMoeda == 3) {
                    moeda = new Real(valor);
                }

                if (moeda != null) {
                    cofrinho.adicionar(moeda);
                    System.out.println("Moeda adicionada com sucesso!");
                }
            } else if (opcao == 2) {
                System.out.println("Escolha a moeda a ser removida:");
                cofrinho.listagemMoedas();
                System.out.println("Digite o índice da moeda a ser removida (inicie de 0): ");
                int indice = scanner.nextInt();
                if (indice >= 0 && indice < cofrinho.listaMoedas.size()) {
                    cofrinho.remover(cofrinho.listaMoedas.get(indice));
                    System.out.println("Moeda removida com sucesso!");
                } else {
                    System.out.println("Índice inválido!");
                }
            } else if (opcao == 3) {
                System.out.println("Listagem de moedas no cofrinho:");
                cofrinho.listagemMoedas();
            } else if (opcao == 4) {
                double total = cofrinho.totalConvertido();
                System.out.println("Total em Real: R$" + total);
            } else if (opcao == 5) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}
