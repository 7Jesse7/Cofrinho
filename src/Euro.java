class Euro extends Moeda {//Classe para representar a moeda Euro, herdando da classe Moeda
    public Euro(double valor) {//Construtor que chama o construtor da classe mãe Moeda
        super(valor);
    }

    // Implementação do método info(), que retorna informações sobre a moeda
    @Override
    public String info() {
        return "Euro (EUR)"; //Descrição do tipo de moeda
    }

    // Implementação do método converter(), que converte o valor da moeda para Real
    @Override
    public double converter() {
        // Exemplo de conversão, considerando 1 Euro = 6 Reais
        return valor * 6;
    }

    // Implementação do método toString(), que retorna o valor da moeda em formato de String
    @Override
    public String toString() {
        return "€" + valor;// Representação da moeda em Euro
    }
}
