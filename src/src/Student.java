package src;

public class Student {
    private  int age ;
    private  String name ;
    private  String lastname ;
    private int id ;

    public Student(){

    }

    public Student(int age, String name, String lastname, int id) {
        if (getAge()>0) {
            this.age = age;
        }
        this.name = name;
        this.lastname = lastname;
        this.id = id;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public int getId() {
        return id;
    }


    @Override
    public String toString() {
        return "Student{" +
                " \nage=" + age +
                ", \nname='" + name + '\'' +
                ", \nlastname='" + lastname + '\'' +
                ", \nid=" + id +
                '}';
    }
}
