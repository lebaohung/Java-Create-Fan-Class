public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    final static double RADIUS = 5;
    final static String COLOR = "blue";
    private int speed = SLOW;
    private boolean isOn = false;
    private double radius = RADIUS;
    private String color = COLOR;

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return isOn;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        if (this.isOn) {
            return "Fan{" +
                    "speed=" + getSpeed() +
                    ", radius=" + getRadius() +
                    ", color='" + getColor() + "'" +
                    ". Fan is on }" ;
        } else {
            return "Fan{" +
                    "radius=" + getRadius() +
                    ", color='" + getColor() + "'" +
                    ". Fan is off }" ;
        }
    }
}
