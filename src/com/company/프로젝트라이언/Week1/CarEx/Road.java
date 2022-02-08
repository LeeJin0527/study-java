package com.company.프로젝트라이언.Week1.CarEx;

import java.util.ArrayList;

public class Road {

    public ArrayList<CarInterface> CarsOnRoad;

    public Road(){

    }

    public Road(ArrayList<CarInterface> carsOnRoad) {
        this.CarsOnRoad = carsOnRoad;
    }

    public void addCar(CarInterface car){
        this.CarsOnRoad.add(car);
    }

    @Override
    public String toString() {
        return "Road{" +
                "CarsOnRoad=" + CarsOnRoad +
                '}';
    }
}