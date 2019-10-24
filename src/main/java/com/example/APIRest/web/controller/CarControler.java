package com.example.APIRest.web.controller;
import com.example.APIRest.dao.CarDao;
import com.example.APIRest.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class CarControler {

    @Autowired
    CarDao Dao;


    @RequestMapping(value = "/modeles", method = RequestMethod.GET)
    public List<Car> carList(){

        return Dao.findAll();
    }

    @RequestMapping(value = "/modele/{id}")
    public Car afficherVoiture(@PathVariable int id){

        return Dao.findById(id);
    }

    @RequestMapping(value = "/modeles", method = RequestMethod.POST)
    public Car SaveCar(@RequestBody Car caro){

        return Dao.Save(caro);
    }
}
