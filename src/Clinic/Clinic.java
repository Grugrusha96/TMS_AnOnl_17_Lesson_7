package Clinic;

public final class Clinic {
    private Clinic(){
    }
    private static int countDoctors = 1;
    private static final Doctors []
        personslDoctor = new Doctors[10];

    public static void addPersonal (Doctors doctor){
        personslDoctor [countDoctors - 1] = doctor;
        countDoctors ++;
    }
 public static void startTreatment (Patient patient){
        System.out.println(patient);
        int planLechenij = patient.getPlanLechenij();

        Doctors doctor = changeDoctor (planLechenij);
        System.out.println(doctor);
        doctor.toHeal();

     System.out.println("Ваш план лечения :");
     switch (planLechenij){
         case 1 ->  System.out.println(PlanLechenij.DENTIST);
         case 2 ->  System.out.println(PlanLechenij.SURGEON);
         default -> System.out.println(PlanLechenij.THERAPIST);
     }

 }
private static Doctors changeDoctor (int PlanLecenij) {
    int count = 0;
    Doctors[] personsl = new Doctors[10];

    switch (PlanLecenij) {
        case 1 -> {
            for (Doctors doctors : personslDoctor) {
                if (doctors != null && doctors.getClass().equals(Dentist.class)) {
                    personsl[count] = doctors;
                    count++;
                }
            }

        }
        case 2 -> {
            for (Doctors doctors : personslDoctor) {
                if (doctors != null && doctors.getClass().equals(Surgeon.class)) {
                    personsl[count] = doctors;
                    count++;
                }
            }

        }

        default -> {
            for (Doctors doctors : personslDoctor) {
                if (doctors != null && doctors.getClass().equals(Therapist.class)) {
                    personsl[count] = doctors;
                    count++;
                }
            }

        }

    }
    int randomDoctor = (int) (Math.random() * count);
    System.out.println("Вас будет лечить :");
    return personsl[randomDoctor];
}

    private static class DANTIST {
    }
}
