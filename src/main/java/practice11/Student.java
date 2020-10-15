package practice11;

import practice11.Klass;

public class Student extends Person{
    private Klass klass;

    public Student(int id, String name, int age) {
        super(id, name, age);
    }

    public Student(int id, String name, int age, Klass klass) {
        super(id, name, age);
        this.klass = klass;
    }

    public String introduce(){
        if(isLeader()) {
            return super.introduce() + " I am a Student. I am Leader of " + klass.getDisplayName()+".";
        }
        return super.introduce() + " I am a Student. I am at " + klass.getDisplayName()+".";
    }

    public Klass getKlass() {
        return klass;
    }

    public boolean isLeader(){
        try{
            return klass.getLeader().getName().equals(getName());
        }catch (NullPointerException e){
            return false;
        }
    }

}
