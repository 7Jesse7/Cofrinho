class Dolar extends Moeda {
    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public String info() {
        return "Dólar (USD)";
    }

    @Override
    public double converter() {
        // Exemplo de conversão, considerando 1 Dólar = 5 Reais
        return valor * 5;
    }

    @Override
    public String toString() {
        return "$" + valor;
    }
}
