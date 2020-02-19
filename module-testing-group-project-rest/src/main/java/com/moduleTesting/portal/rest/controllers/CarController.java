package com.moduleTesting.portal.rest.controllers;

import com.moduleTesting.portal.dto.CarDto;
import com.moduleTesting.portal.service.car.CarService;
import com.moduleTesting.portal.service.carStatus.CarStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/car")
public class CarController {

    @Autowired
    private CarService carService;

    @Autowired
    private CarStatusService carStatusService;

    @PostMapping("/all")
    public List<CarDto> getAllCars() {

        final List<CarDto> allCars = carService.findAll();
        System.out.println(allCars);

        return allCars;
    }

    @PostMapping("/addNew")
    public List<CarDto> addNewCar(@RequestBody CarDto carDto) {

        final List<CarDto> cars = carService.addNewCar(carDto);

        return cars;
    }


    @PostMapping("/edit")
    public List<CarDto> editCar(@RequestBody CarDto carDto) {

        final List<CarDto> cars = carService.editCar(carDto);

        return cars;
    }

    @PostMapping("/remove")
    public List<CarDto> removeCar(Integer carId) {

        final List<CarDto> cars = carService.removeCar(carId);
        System.out.println(cars);

        return cars;
    }
}
