package NemePhone;

import java.util.Arrays;

public class Phone {
    private int number;

    private String model;

    private int weight;

    private String name;


    public void receveCall(String name) {
        this.name = name;

        System.out.println("Звонит :" + name);
    }

    public void getNumber(int number) {
        this.number = number;

        System.out.println("Номер телефона :" + number);

    }

     public Phone (int number, String model, int weight) {

        this.number = number;
        this.model = model;
        this.weight = weight;

        System.out.println("Номер телефона :" + number + "Модель :" + model + "Масса :" + weight);

    }

    public Phone (int number, String model) {
        this.number = number;
        this.model = model;

        System.out.println("Номер телефона :" + number + "Модель :" + model);
    }

    public void oooooo() {

        System.out.println();
    }

    public void receiveCall (String name, int number){
        name = name;
        number = number;

        System.out.println("Имя :" + name + "Номер :" + number);
    }
    public void sendMesssage (int... numbers){
        System.out.println("Отправлено сообщение :" + numbers);
        System.out.println(Arrays.toString(numbers));

    }

    @Override
    public String toString() {
        return ("Введите номер телефона" + number);
    }
}
