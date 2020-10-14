package practice10;

import practice10.Student;

public class Klass {
    private int number;
    private String displayName;
    private Student leader;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getDisplayName() {
        return "Class " + number;
    }

    public Student getLeader() {
        return leader;
    }

    public void assignLeader(Student leader){
        if(leader.getKlass().number != number){
            System.out.print("It is not one of us.\n");

        }else {
            this.leader = leader;
        }
    }

    public void appendMember(Student student){
    }
}
