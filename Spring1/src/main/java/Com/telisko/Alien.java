package Com.telisko;

public class Alien {
    private int age;
    private Laptop lap;

    public Alien(){
        System.out.println("object is created");
    }
    public Alien(int age, Laptop lap1){
        System.out.println("Constructor called ");
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Set age");
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void code(){
        System.out.println("Coding");
        lap.compile();
    }
}
