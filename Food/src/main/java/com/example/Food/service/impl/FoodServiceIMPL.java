package com.example.Food.service.impl;

import com.example.Food.dto.requestDTO.FoodRequestDTO;
import com.example.Food.dto.responseDTO.FoodResponseDTO;
import com.example.Food.entity.Food;
import com.example.Food.repo.FoodRepo;
import com.example.Food.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodServiceIMPL implements FoodService {
    @Autowired
    private FoodRepo foodRepo;

    @Override
    public String saveFood(FoodRequestDTO foodRequestDTO) {
        Food food = new Food(
           foodRequestDTO.getFoodName(),
                foodRequestDTO.getFoodPhoto(),
                foodRequestDTO.getFoodDescription(),
                foodRequestDTO.getFoodPrice()

        );
        foodRepo.save(food);
return foodRequestDTO.getFoodName();
    }

    @Override
    public List<FoodResponseDTO> getAllFoods() {
         List<Food> getAllFoods =foodRepo.findAll();
         List<FoodResponseDTO> foodDTOList=new ArrayList<>();

         if(getAllFoods.size()>0){

         for(Food food:getAllFoods){
           FoodResponseDTO foodResponseDTO=new FoodResponseDTO(
               food.getFoodId(),
                   food.getFoodName(),
                   food.getFoodPhoto(),
                   food.getFoodDescription(),
                   food.getFoodPrice()
           );
           foodDTOList.add(foodResponseDTO);
         }
         return foodDTOList;
         }else{
                  throw new RuntimeException("No food found");
         }
    }

    @Override
    public FoodResponseDTO getFoodById(int foodId) {
        if(foodRepo.existsById(foodId)){
           Food food =foodRepo.getById(foodId);
           FoodResponseDTO foodResponseDTO=new FoodResponseDTO(
                    food.getFoodId(),
                    food.getFoodName(),
                    food.getFoodPhoto(),
                    food.getFoodDescription(),
                   food.getFoodPrice()
           );
           return foodResponseDTO;
        }else{
         throw new RuntimeException("No food found");
        }
    }

    @Override
    public String updateFood(int foodId, FoodRequestDTO foodRequestDTO) {
        //test comment

        if(foodRepo.existsById(foodId)){
            Food food =foodRepo.getById(foodId);

             food.setFoodName(foodRequestDTO.getFoodName());
             food.setFoodPhoto(foodRequestDTO.getFoodPhoto());
             food.setFoodDescription(foodRequestDTO.getFoodDescription());
             food.setFoodPrice(foodRequestDTO.getFoodPrice());

             foodRepo.save(food);
             return foodRequestDTO.getFoodName();
        }else{
            throw new RuntimeException("No food found");
        }



    }

    @Override
    public String deleteFood(int foodId) {
        if(foodRepo.existsById(foodId)){
            foodRepo.deleteById(foodId);
            return "Deleted Successfully";

        }else{
            throw new RuntimeException("No food found");
        }
    }


}
