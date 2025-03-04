class Euro extends Moeda {
    public Euro(double valor) {
        super(valor);
    }

    @Override
    public String info() {
        return "Euro (EUR)";
    }

    @Override
    public double converter() {
        // Exemplo de conversão, considerando 1 Euro = 6 Reais
        return valor * 6;
    }

    @Override
    public String toString() {
        return "€" + valor;
    }
}
