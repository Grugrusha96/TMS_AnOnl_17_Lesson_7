package Clinic;


public class Main {
    public static void main(String[] args) {


        Patient patient = new Patient("Сергей", "Мужской", 21, 5);

        Clinic.addPersonal(new Dentist("Дружный Сергей"));
        Clinic.addPersonal(new Dentist("Злой Андрей"));

        Clinic.addPersonal(new Therapist("Сербская Анна"));
        Clinic.addPersonal(new Therapist("Круглик Евгений"));

        Clinic.addPersonal(new Surgeon("Сват Анатолий"));
        Clinic.addPersonal(new Surgeon("Молох Светлана"));

        Clinic.startTreatment(patient);
    }
}
