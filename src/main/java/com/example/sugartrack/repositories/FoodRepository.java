package com.example.sugartrack.repositories;

import com.example.sugartrack.entities.Food;
import com.example.sugartrack.entities.Sugar;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FoodRepository extends JpaRepository<Food, Long> {
    List<Food> findFoodBypID(Long id);
}
