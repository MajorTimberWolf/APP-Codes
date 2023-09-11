class TrafficLight {
    private String colour;
    private int duration;

    TrafficLight(String colour, int duration) {
        this.colour = colour;
        this.duration = duration;
    }

    String getColour() {
        return colour;
    }

    void setColour(String colour) {
        this.colour = colour;
    }

    int getDuration() {
        return duration;
    }

    void setDuration(int duration) {
        this.duration = duration;
    }

    void printCurrent() {
        System.out.println("Current Colour: "+colour);
        System.out.println("Duration: "+duration);
    }
}
public class Tutorial6_2 {
    public static void main(String[] args) {
        TrafficLight tLight = new TrafficLight("Red", 30);
        System.out.println("INITIALLY: ");
        tLight.printCurrent();
        tLight.setColour("Green");
        tLight.setDuration(45);
        System.out.println("\nAfter changing: ");
        tLight.printCurrent();
    }
}
