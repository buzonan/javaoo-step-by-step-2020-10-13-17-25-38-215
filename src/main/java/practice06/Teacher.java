package practice06;

public class Teacher extends Person{
    private int klass;

    public Teacher(String name, int age) {
        super(name, age);
    }

    public Teacher(String name, int age, int klass) {
        super(name, age);
        this.klass = klass;
    }

    public int getKlass() {
        return klass;
    }

    public String getClassStatus(){
        if(klass == 0){
            return "No Class";
        }
        return "Class " + klass;
    }

    public String introduce() {

        return super.introduce() + " " + "I am a Teacher. I teach " + getClassStatus() + ".";
    }
}
