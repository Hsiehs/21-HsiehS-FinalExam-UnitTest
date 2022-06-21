import org.junit.jupiter.api.*;

public class StringCalculatorTest{
    private StringCalculator calculator;
    @BeforeEach
    public void setUp(){
        calculator = new StringCalculator();
    }
    @Test
    public void addTest1() throws Exception {
        String s = "1,1000";
        int finalInt = calculator.add(s);
        assertEquals(finalInt, 1);
    }
    @Test
    public void addTest2() throws Exception {
        String s = "1,2,4,5,6,123,-5";
        assertThrows(Exception.class,()-> {
            calculator.add(s);
        });
    }





}
