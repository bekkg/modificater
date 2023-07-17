package src;

import java.util.Arrays;

public class Gruup {
    private Student [] students ;
    private String okuu ;
    private  int data ;

    public Gruup (){

    }

    public Gruup(Student[] students, String okuu, int data) {
        this.students = students;
        this.okuu = okuu;
        this.data = data;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setOkuu(String okuu) {
        this.okuu = okuu;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Student[] getStudents() {
        return students;
    }

    public String getOkuu() {
        return okuu;
    }

    public int getData() {
        return data;
    }

    @Override
    public String toString() {
        return "Gruup{" +
                "\nstudents=" + Arrays.toString(students) +
                ", \nokuu='" + okuu + '\'' +
                ",\n data=" + data +
                '}';
    }
}
