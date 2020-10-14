package practice09;

public class Person {
    public int getId() {
        return id;
    }
    private int id;
    private String name;

    private int age;
    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String introduce(){
        return "My name is "+name+". I am "+age+" years old.";
    }

}
