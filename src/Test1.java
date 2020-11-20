public class Test1 {

}

class Circle{
    private double radius;
    static final double Pi = 3.1415926535;

    public void setRadius(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }

    public double area(){
        return Pi*(getRadius() * getRadius());
    }
}