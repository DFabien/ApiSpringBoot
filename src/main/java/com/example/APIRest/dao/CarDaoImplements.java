package com.example.APIRest.dao;

import com.example.APIRest.model.Car;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;


@Repository
public class CarDaoImplements implements CarDao {

    public static List<Car> cars = new ArrayList<>();
        static{
            cars.add(new Car (1, "Seat", "Cordoba"));
            cars.add(new Car (2, "Toyota", "Yaris"));
            cars.add(new Car (3, "Peugeot", "2008"));

        }


    @Override
    public List<Car> findAll(){
        return cars;

    }

    @Override
    public Car findById(int id) {
            for (Car car : cars){
                if (car.getId() == id){
                    return car;
                }
            }
        return null;
    }

    @Override
    public Car Save(Car car) {
            cars.add(car);
        return car;
    }
}