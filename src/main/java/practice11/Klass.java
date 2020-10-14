package practice11;

import practice11.Student;

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
            System.out.print("I am Tom. I know "+leader.getName()+" become Leader of "+leader.getKlass().getDisplayName()+".\n");
            this.leader = leader;
        }

    }

    public void appendMember(Student student){
        if(getLeader() != null){
            System.out.print("I am "+getLeader()+" I know "+student.getName()+" has joined "+getDisplayName());
        }
        if(getLeader() == null){
            System.out.print("I am Tom. I know "+student.getName()+" has joined "+getDisplayName()+".\n");
        }
        student.getKlass().number = number;
    }
}
