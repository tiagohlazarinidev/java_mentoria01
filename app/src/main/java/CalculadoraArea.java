public class CalculadoraArea {
    private double lado;
    private double altura;
    private double base;
    private double raio;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }


    public double Quadrado(double lado) {
        return lado * lado;
    }

    public double Retangulo(double base, double altura) {
        return base * altura;
    }

    public double Circulo(double raio) {
        return 3.1415 * (raio * raio);
    }
}
