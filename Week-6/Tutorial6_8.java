interface Flyable {
    void fly_obj();
}

class Spacecraft implements Flyable {
    public void fly_obj() {
        System.out.println("Spacecraft is flying.");
    }
}

class Airplane implements Flyable {
    public void fly_obj() {
        System.out.println("Airplane is flying.");
    }
}

class Helicopter implements Flyable {
    public void fly_obj() {
        System.out.println("Helicopter is flying.");
    }
}

public class Tutorial6_8 {
    public static void main(String[] args) {
        Spacecraft spacecraft = new Spacecraft();
        spacecraft.fly_obj();

        Airplane airplane = new Airplane();
        airplane.fly_obj();

        Helicopter helicopter = new Helicopter();
        helicopter.fly_obj();
    }
}
