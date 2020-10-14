package practice10;

import practice10.Klass;

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
        if(klass.getLeader() != null){
            if(klass.getLeader().getName().equals(getName())){
                return super.introduce() + " I am a Student. I am Leader of " + klass.getDisplayName()+".";
            }
        }
        return super.introduce() + " I am a Student. I am at " + klass.getDisplayName()+".";
    }

    public Klass getKlass() {
        return klass;
    }
}
