public class CalculadoraSimples {
    private double ValorA;
    private double ValorB;


    public double getValorA() {
        return this.ValorA;
    }

    public void setValorA(double valorA) {
        this.ValorA = valorA;
    }

    public double getValorB() {
        return this.ValorB;
    }

    public void setValorB(double valorB) {
        this.ValorB = valorB;
    }

    public double Soma(double valorA, double valorB) {
        return valorA + valorB;
    }

    public double Subtracao(double valorA, double valorB) {
        return valorA - valorB;
    }

    public double Divisao(double valorA, double valorB) throws Exception {
        if (valorB == 0) {
            throw new Exception("Não pode ser divisivel por zero");
        }
        return valorA / valorB;
    }

    public double Multiplicacao(double valorA, double valorB) {
        return valorA * valorB;
    }

    public double Potenciacao(double valorA, double valorB) {
        return Math.pow(valorA, valorB);
    }
}