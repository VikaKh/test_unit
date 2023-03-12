import org.example.Calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;
    int x;
    int y;

    @Before
    public void setUp(){
        calculator = new Calculator();
        x = 12;
        y = 6;
    }

    @Test
    public void testAddition(){
        int expectedResult = 72;
        Assert.assertEquals("addition process failed!", expectedResult, calculator.addition(x,y));
    }
    @Test
    public void testSummary(){
        int expectedResult = 18;
        Assert.assertEquals("summary process failed!", expectedResult, calculator.summary(x,y));
    }

    @Test
    public void testDivision(){
        int expectedResult = 2;
        Assert.assertEquals("division process failed!", expectedResult, calculator.division(x,y));
    }

    @Test
    public void testMinus(){
        int expectedResult = 6;
        Assert.assertEquals("minus process failed!", expectedResult, calculator.minus(x,y));
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero(){
        int a = 12;
        int b = 0;
       // int expectedResult = 12;
       calculator.division(a,b);
    }
}
