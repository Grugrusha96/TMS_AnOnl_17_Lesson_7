package NemePhone;
import NemePhone.number;
import NemePhone.weight;
import NemePhone.Phone;
import NemePhone.weight;

public class Main {
    public static void main(String[] args) {
        Phone Iphone = new Phone(296062530 ,"Iphone ", 100);
        Phone Sumsung = new Phone (296142281 ,"Sumsung ", 200);
        Phone Lenovo = new Phone(293404050 , "Lenovo ", 300);
        Phone Iphone1 = new Phone (299132827, "Simens", 9897);

        System.out.println(Iphone1);
        System.out.println(Iphone1);
        System.out.println(Sumsung);
        System.out.println(Lenovo);
        Iphone1.receiveCall("Lexa", 299132827);
        System.out.println(Iphone1.getNumber(299132827));
        Iphone.receiveCall("Papa", 296062530);
        System.out.println(Iphone.getNumber(296062530));
        Sumsung.receiveCall("Mama", 296142281);
        Sumsung.getNumber(296142281);
        System.out.println(Sumsung.getNumber(296142281));
        Lenovo.receiveCall("Mum",293404050);
        System.out.println(Lenovo.getNumber(293404050));
        Lenovo.getNumber(293404050);
        Iphone.receiveCall ("Mum", 296142281);
        Iphone.sendMesssage (296062530, 296142281, 293404050);
    }
}