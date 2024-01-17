package NemePhone;

public class model {

     String model;
     public model(){

}
    public model (String model){
        this.model = model;
        System.out.print("Модель телефона :" + model);
    }

    @Override
    public String toString() {
        return ("Модель телефона :" + model);
    }
}
