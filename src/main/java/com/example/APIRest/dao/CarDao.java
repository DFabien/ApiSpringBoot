package com.example.APIRest.dao;
import com.example.APIRest.model.Car;
import java.util.List;



public interface CarDao {

    public List<Car>findAll();
    public Car findById(int id);
    public Car Save (Car car);
}
