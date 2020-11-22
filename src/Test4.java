import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test4 {
    public static void main(String[] args) {
        Fractional f = new Fractional(4, 8);
        Fractional f2 = new Fractional(2,0);
        f.add(f2);
        f.sub(f2);
        f.mul(f2);
        f.div(f2);
        
        /*addition result: 6.8
subtraction result: 2.8
multiplication result: 9.60
division result: 2.40*/
        
    }
}

class Fractional{
    long beforePoint;
    short afterPoint;

    public Fractional(long beforePoint, int afterPoint){
        this.beforePoint = beforePoint;
        this.afterPoint = (short) afterPoint;
    }

    public void add(Fractional fractional){
        String firstNum = "" + this.beforePoint + "." + this.afterPoint;
        String secondNum = "" + fractional.beforePoint + "." + fractional.afterPoint;
        BigDecimal bdFirst = new BigDecimal(firstNum);
        BigDecimal bdSecond = new BigDecimal(secondNum);

        System.out.println("addition result: " + bdFirst.add(bdSecond));
    }
    public void sub(Fractional fractional){
        String firstNum = "" + this.beforePoint + "." + this.afterPoint;
        String secondNum = "" + fractional.beforePoint + "." + fractional.afterPoint;
        BigDecimal bdFirst = new BigDecimal(firstNum);
        BigDecimal bdSecond = new BigDecimal(secondNum);

        System.out.println("subtraction result: " + bdFirst.subtract(bdSecond));
    }
    public void mul(Fractional fractional){
        String firstNum = "" + this.beforePoint + "." + this.afterPoint;
        String secondNum = "" + fractional.beforePoint + "." + fractional.afterPoint;
        BigDecimal bdFirst = new BigDecimal(firstNum);
        BigDecimal bdSecond = new BigDecimal(secondNum);

        System.out.println("multiplication result: " + bdFirst.multiply(bdSecond));
    }
    public void div(Fractional fractional){
        String firstNum = "" + this.beforePoint + "." + this.afterPoint;
        String secondNum = "" + fractional.beforePoint + "." + fractional.afterPoint;
        BigDecimal bdFirst = new BigDecimal(firstNum);
        BigDecimal bdSecond = new BigDecimal(secondNum);

        System.out.println("division result: " + bdFirst.divide(bdSecond,2, RoundingMode.DOWN));
    }
}
