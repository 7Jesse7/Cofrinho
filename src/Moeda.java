abstract class Moeda { //Classe abstrata Moeda, que serve como base para as diferentes moedas
    protected double valor; //Atributo que armazena o valor da moeda

    public Moeda(double valor) { //Construtor que recebe o valor da moeda e inicializa o atributo
        this.valor = valor;
    }

    public double getValor() {//Método que retorna o valor da Moeda
        return valor;
    }

    // Método que retorna uma descrição da moeda
    public abstract String info();

    // Método para conversão da moeda para Real
    public abstract double converter();
}

