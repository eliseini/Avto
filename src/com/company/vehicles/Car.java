package com.company.vehicles;

import com.company.details.Engine;
import com.company.professions.Driver;

public class Car {
    protected String marka;
    protected String classCar;
    protected String weight;
    public Car(String marka,String classCar,String weight){
        this.marka=marka;
        this.classCar=classCar;
        this.weight=weight;
    }

Driver driver=new Driver("Alex", 20, "10 years");
Engine engine=new Engine("380 h/p", "BMW");

public void start(){
    System.out.println("Поехали");
}
    public  void stop(){
        System.out.println("Останавливаемся");
    }
    public void turnRight(){
        System.out.println("Поворот на право");
    }
    public void turnLeft(){
        System.out.println("Поворот на лево");
    }
    public void printInfo(){
        System.out.println("\nDriver info "+driver);
        System.out.println("Marka avto "+this.marka);
        System.out.println("Class car "+ this.classCar);
        System.out.println("weigth car "+this.weight);
        System.out.println("Engine info "+engine);
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "marka='" + marka + '\'' +
                ", classCar='" + classCar + '\'' +
                ", weight=" + weight +
                ". \ndriver=" + driver +
                ". \nengine=" + engine +
                '}';
    }
}
