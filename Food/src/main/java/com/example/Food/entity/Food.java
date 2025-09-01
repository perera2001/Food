package com.example.Food.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "food")

public class Food {

    @Id
    @Column(name = "food_id",length = 45)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int foodId;

    @Column(name = "food_name",length = 45)
    private String foodName;

    @Column(name = "food_photo",length = 45)
    private String foodPhoto;

    @Column(name = "food_description",length = 45)
    private String foodDescription;

    @Column(name = "food_price",length = 45)
    private String foodPrice;

    public Food() {
    }

    public Food(String foodName, String foodPhoto, String foodDescription, String foodPrice) {
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
