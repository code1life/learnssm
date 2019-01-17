package vin.service;

import vin.pojo.Flower;

import java.util.List;

public interface FlowerService {
    List<Flower> showAllFlower();
    int addFlower(Flower flower);
}
