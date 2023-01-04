import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//легче работать с тестами сделав статический импорт
//итак много писать, а без этого еще и Assertions добавлять везде
//import static org.junit.jupiter.api.Assertions.* 

public class ReversePolishNotationCalculatorTest {
    ReversePolishNotationCalculator test = new ReversePolishNotationCalculator();

    //я в целом не против и не за каждый тест выносить в новый метод, скорей всего то как ты это сделал правильно
    //но уж больно тяжело писать огромное количество методов, лучше потратить сильны на комментарии к ошибкам
    //к примеру решая ТЗ 7 я выносил в разные методы только тестирование принципиально разного функционала
    @Test
    public void shouldAddition() {
        String text = "1 1 + ";
        int result = test.calculatePolishNotation(text);
        //на мой взгляд важно писать комментарий к ошибке, да это сложней и дольше, но все же сильно помогает для анализа тестов
        //пример комментария добавил
        Assertions.assertEquals((1+1),result,"1 1 + должно быть равно 2");
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
    
    //на мой взгляд ты покрыл тестами все что требовалось по заданию, т.е. работу со всеми знаками и обработку лишних пробелов
    //но проверить то, что вся эта конструкция с неверными символами тоже нужно на мой взгляд
    //в будующем при такой задаче обязательно были бы внятные исключения для лишних знаков
}

//а так отличная работа :)
