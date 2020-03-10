import org.junit.Assert;
import org.junit.Test;
public class TestCalculator {
    final double  DELTA = 1e-9;
    //final String ADDITION = "-32+2";
    //final String SUBTRACTION = "5-2";
    //final String MULTIPLICATION = "2*2";
    //final String DIVISION = "8.4/2";
    //final String EXPONENTIATION = "3^2";
    @Test
    public void methodShouldPerformAddition (){
       Assert.assertEquals(-30, new Calculate().calculating("-32+2"), DELTA);
    }

    @Test
    public void methodShouldPerformSubtraction (){
        Assert.assertEquals(3, new Calculate().calculating("5-2"), DELTA);
    }

    @Test
    public void methodShouldPerformMultiplication (){
        Assert.assertEquals(4, new Calculate().calculating("2*2"), DELTA);
    }

    @Test
    public void methodShouldPerformDivision (){
        Assert.assertEquals(4.2, new Calculate().calculating("8.4/2"), DELTA);
    }

    @Test
    public void methodShouldPerformExponentiation (){
        Assert.assertEquals(9, new Calculate().calculating("3^2"), DELTA);
    }
}
