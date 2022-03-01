package com.techreturners.apilab1.repository;

import com.techreturners.apilab1.model.Food;
import org.springframework.data.repository.CrudRepository;

public interface HealthyFoodRepository extends CrudRepository<Food, Long> {
}
