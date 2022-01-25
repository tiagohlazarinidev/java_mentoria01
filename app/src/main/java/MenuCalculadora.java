import java.util.Scanner;

public class MenuCalculadora {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        CalculadoraSimples calc = new CalculadoraSimples();
        CalculadoraImc IMC = new CalculadoraImc();
        CalculadoraArea area = new CalculadoraArea();

        System.out.println("Menu CalculadoraSimples: ");

        System.out.println("Calculadora Padrão: ");
        System.out.println("1 = Soma");
        System.out.println("2 = Subtração");
        System.out.println("3 = Multiplicação");
        System.out.println("4 = Potenciação");

        System.out.println("5 = Calcular IMC ");

        System.out.println("CalculadoraSimples área: ");
        System.out.println("6 = Circulo ");
        System.out.println("7 = Quadrado ");
        System.out.println("8 = Retângulo ");
        System.out.println("0 = Para sair ");


        int op;
        do {
            op = leitor.nextInt();
            switch (op) {
                case 1:
                    System.out.println("Entre valor de A : ");
                    calc.setValorA(leitor.nextDouble());
                    System.out.println("Entre valor de B : ");
                    calc.setValorB(leitor.nextDouble());
                    System.out.println("Soma = " + calc.Soma(calc.getValorA(), calc.getValorB()));
                    break;
                case 2:
                    System.out.println("Entre valor de A : ");
                    calc.setValorA(leitor.nextDouble());
                    System.out.println("Entre valor de B : ");
                    calc.setValorB(leitor.nextDouble());
                    System.out.println("Subtração = " + calc.Subtracao(calc.getValorA(), calc.getValorB()));
                    break;
                case 3:
                    System.out.println("Entre valor de A : ");
                    calc.setValorA(leitor.nextDouble());
                    System.out.println("Entre valor de B : ");
                    calc.setValorB(leitor.nextDouble());
                    System.out.println("Divisão = " + calc.Divisao(calc.getValorA(), calc.getValorB()));
                    break;
                case 4:
                    System.out.println("Entre valor de A : ");
                    calc.setValorA(leitor.nextDouble());
                    System.out.println("Entre valor de B : ");
                    calc.setValorB(leitor.nextDouble());
                    System.out.println("Multiplicação = " + calc.Multiplicacao(calc.getValorA(), calc.getValorB()));
                    break;
                case 5:
                    System.out.println("Entre com peso (kg) : ");
                    IMC.setPeso(leitor.nextInt());
                    System.out.println("Entre com a altura (cm) : ");
                    IMC.setAltura(leitor.nextInt());
                    System.out.println("IMC = " + IMC.CalcularIMC(IMC.getPeso(), IMC.getAltura()));
                    break;
                case 6:
                    System.out.println("Digite o valor do lado: ");
                    area.setLado(leitor.nextInt());
                    System.out.println("Area do quadrado = " + area.Quadrado(area.getLado()));
                    break;
                case 7:
                    System.out.println("Digite o valor da base: ");
                    area.setBase(leitor.nextDouble());
                    System.out.println("Digite o valor da Altura: ");
                    area.setAltura(leitor.nextDouble());
                    System.out.println("Area do Retangulo = " + area.Retangulo(area.getBase(), area.getAltura()));
                    break;
                case 8:
                    System.out.println("Digite o valor do raio: ");
                    area.setRaio(leitor.nextDouble());
                    System.out.println("Area do Circulo = " + area.Circulo(area.getRaio()));
                    break;
                default:
                    break;

            }
        } while (op != 0);
    }
}