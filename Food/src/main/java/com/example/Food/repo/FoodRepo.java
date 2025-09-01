package com.example.Food.repo;

import com.example.Food.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface FoodRepo extends JpaRepository<Food, Integer>{


}

