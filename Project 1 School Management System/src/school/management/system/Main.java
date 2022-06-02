package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher Puneeth = new Teacher(1,"Puneeth",500);
        Teacher Suresh = new Teacher(2,"Suresh",700);
        Teacher Madhavi = new Teacher(3,"Madhavi",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Puneeth);
        teacherList.add(Suresh);
        teacherList.add(Madhavi);


        Student Sathvik = new Student(1,"Sathvik",12);
        Student Bhusan = new Student(2,"Bhusan",12);
        Student Ranjith = new Student(3,"Ranjith",11);
        List<Student> studentList = new ArrayList<>();

        studentList.add(Sathvik);
        studentList.add(Bhusan);
        studentList.add(Ranjith);




        School ghs = new School(teacherList,studentList);

        Teacher megan = new Teacher(6,"Megan", 900);

        ghs.addTeacher(megan);


        Sathvik.payFees(5000);
        Bhusan.payFees(6000);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        Puneeth.receiveSalary(Puneeth.getSalary());
        System.out.println("GHS has spent for salary to " + Puneeth.getName()
        +" and now has $" + ghs.getTotalMoneyEarned());

        Madhavi.receiveSalary(Madhavi.getSalary());
        System.out.println("GHS has spent for salary to " + Madhavi.getName()
                +" and now has $" + ghs.getTotalMoneyEarned());


        System.out.println(Bhusan);

        Suresh.receiveSalary(Suresh.getSalary());

        System.out.println(Suresh);


    }
}