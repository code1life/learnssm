package vin.dao;

import vin.pojo.Flower;

import java.util.List;

public interface FlowerDao {
    List<Flower> selectAll();
    int insertFlower(Flower flower);
}
