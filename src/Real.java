class Real extends Moeda {//Classe para representar o Real, herdando da classe Moeda
    public Real(double valor) {//Construtor que chama o construtor da classe mãe Moeda
        super(valor);
    }

    // Implementação do método info(), que retorna informações sobre a moeda
    @Override
    public String info() {
        return "Real (BRL)";//Descrição do tipo de moeda
    }

    // Implementação do método converter(), que converte o valor da moeda para Real
    @Override
    public double converter() {
        // O Real já está em Real, então o valor é o mesmo
        return valor;
    }

    // Implementação do método toString(), que retorna o valor da moeda em formato de String
    @Override
    public String toString() {
        return "R$" + valor;//Representação da moeda em Real
    }
}
