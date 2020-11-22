import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test5 {
    public static void main(String[] args) {

        Money f = new Money(4, 6);
        Money f2 = new Money(3,4);
        f.add(f2);
        f.sub(f2);
        f.div(f2);
        f.fractionalDiv(1.4);
        f.fractionalMul(3.5);
        f.compare(f2);
        
        /*addition result: 8,0
  subtraction result: 1,2
  division result: 1,35
  fractional division result: 3,2857142857142856
  fractional multiplication result: 16,099999999999998
  4,6 > 3,4*/
        
    }
}

class Money{
    long uah;
    byte kopeyka;

    public Money(long uah, int kopeyka){
        this.uah = uah;
        this.kopeyka = (byte) kopeyka;
    }

    public void add(Money money){
        String firstNum = "" + this.uah + "." + this.kopeyka;
        String secondNum = "" + money.uah + "." + money.kopeyka;
        BigDecimal bdFirst = new BigDecimal(firstNum);
        BigDecimal bdSecond = new BigDecimal(secondNum);

        System.out.println("addition result: " +
                bdFirst.add(bdSecond).toString().replace(".",","));
    }
    public void sub(Money money){
        String firstNum = "" + this.uah + "." + this.kopeyka;
        String secondNum = "" + money.uah + "." + money.kopeyka;
        BigDecimal bdFirst = new BigDecimal(firstNum);
        BigDecimal bdSecond = new BigDecimal(secondNum);

        System.out.println("subtraction result: " +
                bdFirst.subtract(bdSecond).toString().replace(".",","));
    }

    public void div(Money money){
        String firstNum = "" + this.uah + "." + this.kopeyka;
        String secondNum = "" + money.uah + "." + money.kopeyka;
        BigDecimal bdFirst = new BigDecimal(firstNum);
        BigDecimal bdSecond = new BigDecimal(secondNum);

        System.out.println("division result: " +
                bdFirst.divide(bdSecond,2, RoundingMode.DOWN).toString().replace(".",","));
    }

    public void fractionalDiv(double money){
        String firstNum = "" + this.uah + "." + this.kopeyka;
        double first = new BigDecimal(firstNum).doubleValue();
        double resultAfterDiv = first / money;

        System.out.println(("fractional division result: " +
                resultAfterDiv).replace(".",","));
    }
    public void fractionalMul(double money){
        String firstNum = "" + this.uah + "." + this.kopeyka;
        double first = new BigDecimal(firstNum).doubleValue();
        double resultAfterDiv = first * money;

        System.out.println(("fractional multiplication result: " +
                resultAfterDiv).replace(".",","));
    }
    public void compare(Money money){
        BigDecimal bdFirst = new BigDecimal("" + this.uah + "." + this.kopeyka);
        BigDecimal bdSecond = new BigDecimal("" + money.uah + "." + money.kopeyka);

        if (bdFirst.compareTo(bdSecond) == 0) {
            System.out.println("money is equal");
        }else if (bdFirst.compareTo(bdSecond) > 0){
            System.out.println(bdFirst.toString().replace(".",",") +
                    " > " + bdSecond.toString().replace(".",","));
        }else {
            System.out.println(bdFirst.toString().replace(".",",") +
                    " < " + bdSecond.toString().replace(".",","));
        }
    }
}
