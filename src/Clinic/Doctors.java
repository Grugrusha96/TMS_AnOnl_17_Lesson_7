package Clinic;

public class Doctors {
    protected final String Doctorname;
    private final String special;

    protected Doctors(String special, String Doctorname) {
        this.special = special;
        this.Doctorname = Doctorname;
    }


    @Override
    public String toString() {
        return "Доктор :" + "Имя :" + special + "/" + "Специализация :" + Doctorname;
    }

    protected void toHeal() {
        System.out.println("Я буду лечить.");
    }
}