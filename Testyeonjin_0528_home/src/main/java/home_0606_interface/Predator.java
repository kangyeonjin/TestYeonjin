package home_0606_interface;

public interface Predator {
   String getFood();

   default void printFood(){
      System.out.println(getFood());
   }
   int LEG_COUNT =4;
   static int speed(){
      return  LEG_COUNT*30;
   }
   interface Barkable{
      void bark();
   }
}
