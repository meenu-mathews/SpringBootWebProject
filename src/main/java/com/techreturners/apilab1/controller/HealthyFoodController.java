package com.techreturners.apilab1.controller;

import com.techreturners.apilab1.model.Food;
import com.techreturners.apilab1.service.HealthyFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HealthyFoodController {



    @Autowired
    HealthyFoodService healthyFoodService;

    @GetMapping
    public ResponseEntity<List<Food>> getAllBooks() {
        List<Food> food = healthyFoodService.getAllFood();
        return new ResponseEntity<>(food, HttpStatus.OK);
    }
        }


