import java.awt.*;
public class Main {
    public static void main (String[] args) {

  Car car1 = new Car ("punto" , Color.GREEN, 1999, 150);
  System.out.println(car1.year);
  System.out.println(car1.color);
  car1.changeColor(Color.BLACK);
  System.out.println(car1.color);
    }
}