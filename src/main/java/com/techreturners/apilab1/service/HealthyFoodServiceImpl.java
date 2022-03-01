package com.techreturners.apilab1.service;

import com.techreturners.apilab1.model.Food;
import com.techreturners.apilab1.repository.HealthyFoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class HealthyFoodServiceImpl implements HealthyFoodService{
    @Autowired
    HealthyFoodRepository healthyFoodRepository;
    @Override
    public List<Food> getAllFood() {
            List<Food> food = new ArrayList<>();
            healthyFoodRepository.findAll().forEach(food::add);
            return food;
        }
    }
