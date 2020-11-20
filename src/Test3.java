public class Test3 {
}

class Car {
    private double speed;

    public void setSpeed(double speed){
        this.speed = speed;
    }
    public double getSpeed(){
        return speed;
    }

    void keyToTheRight(){
        System.out.println("Car engine started");
    }
    void stop(){
        System.out.println("The car engine is muffled");
    }
    void motion(){
        if (getSpeed() > 0) {
            System.out.println("Your car is motion");
        }else {
            stop();
        }
    }
    void keepSpeed(double speed){
        setSpeed(speed);
        motion();
        System.out.println("Your car will keep a speed - " + getSpeed() + " mph");
    }
}