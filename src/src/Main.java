package src;

public class Main {
    public static void main(String[] args) {

        Student student = new Student(-1,"bek","sun",3);
        Student student1 = new Student(22,"bek2","sun2",3);
        Student [] students ={student,student1};

        Gruup gruup = new Gruup(students,"peak",07);
        Gruup gruup2 = new Gruup(students,"peak2",06);
        Gruup [] gruups = {gruup,gruup2};

        Cours cours = new Cours("peak",7,"bakyt",gruups);
        System.out.println(cours);
    }
}