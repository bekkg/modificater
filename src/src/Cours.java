package src;


import java.util.Arrays;

public class Cours {
    private  String nameCours ;
    private int numberCours ;
    private  String nameTeacher ;
    private Gruup [] groups ;

    public Cours (){

    }

    public Cours(String nameCours, int numberCours, String nameTeacher, Gruup[] groups) {
        this.nameCours = nameCours;
        this.numberCours = numberCours;
        this.nameTeacher = nameTeacher;
        this.groups = groups;
    }

    public void setNameCours(String nameCours) {
        this.nameCours = nameCours;
    }

    public void setNumberCours(int numberCours) {
        this.numberCours = numberCours;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public void setGroups(Gruup[] groups) {
        this.groups = groups;
    }

    public String getNameCours() {
        return nameCours;
    }

    public int getNumberCours() {
        return numberCours;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public Gruup[] getGroups() {
        return groups;
    }


    @Override
    public String toString() {
        return "Cours{" +
                "\nnameCours='" + nameCours + '\'' +
                ", \nnumberCours=" + numberCours +
                ", \nnameTeacher='" + nameTeacher + '\'' +
                ", \ngroups=" + Arrays.toString(groups) +
                '}';
    }

}
