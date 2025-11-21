package Com.telisko;

public class Alien {
    private int age;

    public Alien(){
        System.out.println("object is created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Set age");
        this.age = age;
    }

    public void code(){
        System.out.println("Coding");
    }
}
