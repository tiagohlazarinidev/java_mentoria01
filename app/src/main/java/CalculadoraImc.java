public class CalculadoraImc {

    private int altura;
    private int peso;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int CalcularIMC(int Peso, int Altura) {
        return Peso / (Altura * Altura);
    }
}
