package com.example.Food.dto.responseDTO;

import jakarta.persistence.Column;

public class FoodResponseDTO {

    private int foodId;
    private String foodName;
    private String foodPhoto;
    private String foodDescription;
    private String foodPrice;

    public FoodResponseDTO() {
    }

    public FoodResponseDTO(int foodId, String foodName, String foodPhoto, String foodDescription, String foodPrice) {
        this.foodId = foodId;
        this.foodName = foodName;
        this.foodPhoto = foodPhoto;
        this.foodDescription = foodDescription;
        this.foodPrice = foodPrice;
    }

    public int getFoodId() {
        return foodId;
    }

    public void setFoodId(int foodId) {
        this.foodId = foodId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public String getFoodPhoto() {
        return foodPhoto;
    }

    public void setFoodPhoto(String foodPhoto) {
        this.foodPhoto = foodPhoto;
    }

    public String getFoodDescription() {
        return foodDescription;
    }

    public void setFoodDescription(String foodDescription) {
        this.foodDescription = foodDescription;
    }

    public String getFoodPrice() {
        return foodPrice;
    }

    public void setFoodPrice(String foodPrice) {
        this.foodPrice = foodPrice;
    }
}
