package com.example.mdb_spring_boot.repository;

public interface CustomItemRepository {

    void updateItemQuantity(String name, float newQuantity);
}
