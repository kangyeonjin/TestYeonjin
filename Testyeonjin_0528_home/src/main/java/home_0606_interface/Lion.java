package home_0606_interface;

public class Lion extends Animal implements BrkablePredator {

    public String getFood(){
        return "apple";
    }
    public void bark(){
        System.out.println("으르렁");
    }
}
