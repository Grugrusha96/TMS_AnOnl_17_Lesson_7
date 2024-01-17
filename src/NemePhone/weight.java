package NemePhone;

public class weight {
    int weight;
public weight (){

}
    public weight(int weight){
        this.weight = weight;
        System.out.print("Масса :" + weight);
    }

    @Override
    public String toString() {
        return ("Масса :" + weight);
    }
}
