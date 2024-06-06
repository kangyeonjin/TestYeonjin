package home_0606_interface;

public class Tiger extends Animal implements BrkablePredator {
 public String getFood(){
     return "banana";
 }
 public void bark(){
     System.out.println("어흥");
 }
}
