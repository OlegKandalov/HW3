public class Test3 {
}

class Car {
    private double speed;
    boolean motorOn;

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    void keyToTheRight(boolean motorOn) {
        this.motorOn = motorOn;
        if (!this.motorOn) {
            this.motorOn = true;
            System.out.println("Car engine started");
        }
    }

    void stop(boolean motorOn) {
        this.motorOn = motorOn;
        if (this.motorOn) {
            setSpeed(0.0);
            this.motorOn = false;
            System.out.println("The car engine is muffled");
        }
    }

    void motion() {
        if (getSpeed() > 0 & motorOn == true) {
            System.out.println("Your car is motion");
        } else {
            stop(true);
        }
    }

    void keepSpeed(double speed) {
        if (motorOn == true & speed < 180) {
            setSpeed(speed);
            motion();
            System.out.println("Your car will keep a speed - " + getSpeed() + " mph");
        } else {
            System.out.println("Just turn key to the right");
        }
    }
}
