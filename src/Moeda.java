abstract class Moeda {
    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    // Método que retorna uma descrição da moeda
    public abstract String info();

    // Método para conversão da moeda para Real
    public abstract double converter();
}

