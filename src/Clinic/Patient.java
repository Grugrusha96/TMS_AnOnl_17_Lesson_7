package Clinic;

public class Patient {
    private final String name;
    private final String pol;
    private final int age;
    private final int PlanLechenij;

    public Patient (String name, String pol, int age, int PlanLechenij) {
        this.name = name;
        this.pol = pol;
        this.age = age;
        this.PlanLechenij = PlanLechenij;
    }
    public int getPlanLechenij(){
        return PlanLechenij;
    }

    @Override
    public String toString() {
        return "Пациент :" + "Имя :" + name + "Пол :" + pol + "Возраст :" + age;
    }
}
