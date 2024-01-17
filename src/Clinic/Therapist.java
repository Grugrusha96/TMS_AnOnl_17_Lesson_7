package Clinic;

public final class Therapist extends Doctors {

   public Therapist (String Doctorname){
       super(Doctorname, "Терапевт");
   }

    @Override
     protected   void toHeal(){
        System.out.println("Я буду вас лечить как Терапевт.");
    }
}
