package Clinic;

public final class Surgeon extends Doctors {
    public Surgeon (String Doctorname) {
        super(Doctorname, " Хирург");
    }

    @Override
     protected void toHeal(){
        System.out.println("Я буду вас лечить как хирург.");

    }
}
