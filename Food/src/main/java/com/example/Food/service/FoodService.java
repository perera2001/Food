package com.example.Food.service;

import com.example.Food.dto.requestDTO.FoodRequestDTO;
import com.example.Food.dto.responseDTO.FoodResponseDTO;

import java.util.List;

public interface FoodService {
    String saveFood(FoodRequestDTO foodRequestDTO);

    List<FoodResponseDTO> getAllFoods();


    FoodResponseDTO getFoodById(int foodId);

    String updateFood(int foodId, FoodRequestDTO foodRequestDTO);

    String deleteFood(int foodId);
}
