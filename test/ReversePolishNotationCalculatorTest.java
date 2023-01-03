import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReversePolishNotationCalculatorTest {
    ReversePolishNotationCalculator test = new ReversePolishNotationCalculator();

    @Test
    public void shouldAddition() {
        String text = "1 1 + ";
        int result = test.calculatePolishNotation(text);
        Assertions.assertEquals((1+1),result);
    }

    @Test
    public void shouldSubtract() {
        String text = "2 1 - ";
        int result = test.calculatePolishNotation(text);
        Assertions.assertEquals((2-1),result);
    }

    @Test
    public void shouldMultiply() {
        String text = "3 2 * ";
        int result = test.calculatePolishNotation(text);
        Assertions.assertEquals((3*2),result);
    }

    @Test
    public void shouldCalculateAll() {
        String text = "4 3 2 2 * - + ";
        int result = test.calculatePolishNotation(text);
        Assertions.assertEquals((4+3-2*2),result);
    }

    @Test
    public void shouldSpaces() {
        String text = "  5   4   3 2   * -   +   ";
        int result = test.calculatePolishNotation(text);
        Assertions.assertEquals((5+4-3*2),result);
    }

    @Test
    public void shouldNegativeValue() {
        String text = "5 -4 3 -2 * - +";
        int result = test.calculatePolishNotation(text);
        Assertions.assertEquals((5+(-4)-3*(-2)),result);
    }
}