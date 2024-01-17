package Clinic;

public final class Dentist extends Doctors {

    public Dentist (String Doctorname){
        super(Doctorname, "Дантист");
    }

    @Override
        protected void toHeal(){
            System.out.println("Я буду вас лечить как дантист.");
    }
}
