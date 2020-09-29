import java.awt.*;
public class Car {
     String model;
     Color color;
     int year;
     int maxSpeed;

    public Car (String inputModel,Color inputColor,int inputYear,int inputMaxSpeed){
        this.model=inputModel;
        this.color=inputColor;
        this.year=inputYear;
        this.maxSpeed=inputMaxSpeed;
    }

    public int getYear(){
        return year;
    }

    public void changeColor(Color colorChange){
        color=colorChange;
    }

}