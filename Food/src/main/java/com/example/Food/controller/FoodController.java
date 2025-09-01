package com.example.Food.controller;

import com.example.Food.dto.requestDTO.FoodRequestDTO;
import com.example.Food.dto.responseDTO.FoodResponseDTO;
import com.example.Food.service.FoodService;
import com.example.Food.util.StandardResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/food")
@CrossOrigin
public class FoodController {
  @Autowired
     FoodService foodService;

  @PostMapping(path = "/savefood")
   public ResponseEntity<StandardResponse> saveFood(@RequestBody FoodRequestDTO foodRequestDTO) {
      String message=foodService.saveFood(foodRequestDTO);
      return new ResponseEntity<StandardResponse>(
      new StandardResponse(201,"Sucess",message),
        HttpStatus.CREATED
);
  }

  @GetMapping(path = "/get-all-foods")
    public ResponseEntity<StandardResponse>  getAllFoods() {
      List<FoodResponseDTO> foodDTOList=foodService.getAllFoods();
         return new ResponseEntity<StandardResponse>(
               new StandardResponse(200,"Sucess",foodDTOList),
                 HttpStatus.OK
         );
  }

  @GetMapping(path = "/get-by-id/{id}")
     public ResponseEntity<StandardResponse> getFoodById(@PathVariable(value = "id") int foodId) {
           FoodResponseDTO foodResponseDTO=foodService.getFoodById(foodId);
           return new ResponseEntity<StandardResponse>(
                   new StandardResponse(200,"Sucess",foodResponseDTO),
                   HttpStatus.OK
           );
  }

  @PutMapping(path = "/updatefood/{id}")
    public ResponseEntity<StandardResponse> updateFood(@RequestBody FoodRequestDTO foodRequestDTO,@PathVariable(value="id")int foodId) {
          String update =foodService.updateFood(foodId,foodRequestDTO);
           return new ResponseEntity<StandardResponse>(
                   new StandardResponse(200,"Sucess",update),
                   HttpStatus.OK
           );


  }

    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<StandardResponse> deleteFood(@PathVariable(value = "id") int foodId) {
        String deleteMessage = foodService.deleteFood(foodId);
        return new ResponseEntity<StandardResponse>(
                new StandardResponse(200, "Success", deleteMessage),
                HttpStatus.OK
        );
    }


}
