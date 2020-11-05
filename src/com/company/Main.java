package com.company;

import com.company.vehicles.Car;
import com.company.details.Engine;
import com.company.professions.Driver;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {

    public static void main(String[] args) {
	Car car =new Car("BMW x5", "Crossover ", "1500 kg");
        car.printInfo();
        car.start();
        car.stop();
        car.turnLeft();
        car.turnRight();

        Lorry lorry=new Lorry("Ford F500", "SUV ", "3500 kg","10 000 kg");
        lorry.printInfo();
        lorry.start();
        lorry.stop();
        lorry.turnLeft();
        lorry.turnRight();

        SportCar sportCar=new SportCar("Mclaren F150", "Sport", "1200 kg","380 km/h");
        sportCar.printInfo();
        sportCar.start();
        sportCar.stop();
        sportCar.turnLeft();
        sportCar.turnRight();
    }
}
