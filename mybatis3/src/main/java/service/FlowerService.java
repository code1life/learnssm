package service;

import pojo.Flower;

import java.io.IOException;
import java.util.List;

public interface FlowerService {
    List<Flower> showAllFlower() throws IOException;
}
