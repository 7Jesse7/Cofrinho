class Real extends Moeda {
    public Real(double valor) {
        super(valor);
    }

    @Override
    public String info() {
        return "Real (BRL)";
    }

    @Override
    public double converter() {
        // O Real já está em Real, então o valor é o mesmo
        return valor;
    }

    @Override
    public String toString() {
        return "R$" + valor;
    }
}
