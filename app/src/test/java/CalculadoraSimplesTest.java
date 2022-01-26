import org.junit.Assert;
import org.junit.Test;

public class CalculadoraSimplesTest {

    CalculadoraSimples calc = new CalculadoraSimples();

    @Test
    public void soma() {
        double soma = calc.Soma(15, 5);

        Assert.assertEquals(20.0, soma, 0);
    }

    @Test
    public void subtracao() {
    }

    @Test
    public void divisao() {
    }

    @Test
    public void multiplicacao() {
    }

    @Test
    public void potenciacao() {
    }
}