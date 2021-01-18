//Programming Lab Assignment 1
//NYARKO DARLINGTON
public class GravityCalculator {
    public static void main(String[] arguments) {
        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition = 0.0;

        finalPosition=((gravity*Math.pow(fallingTime,2)/2))+(initialVelocity*fallingTime)+initialPosition;
        System.out.println(finalPosition);
    }
}

// Part 1 Output
// The object's position after 10.0 seconds is 0.0 m.