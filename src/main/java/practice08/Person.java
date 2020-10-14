package practice08;

public class Person {
    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    private int id;
    private String name;
    private int age;

    public int getId() {
        return id;
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

