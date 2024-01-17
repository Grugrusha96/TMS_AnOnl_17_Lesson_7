package NemePhone;

public class number {
    int number;
    public number() {

    }
    public number (int number){
        this.number = number;


    }
    @Override
    public String toString() {
        return ("Номер телефона :" + number);
    }
}
