class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printAtt() {
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
public class Tutorial6_1 {
    public static void main(String[] args) {
        Person per1 = new Person("Pratyush", 19);
        Person per2 = new Person("Eren Yeager", 19);
        per1.printAtt();
        System.out.println();
        per2.printAtt();
    }
}
