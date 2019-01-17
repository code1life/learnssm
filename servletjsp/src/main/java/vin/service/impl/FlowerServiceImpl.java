package vin.service.impl;

import vin.dao.FlowerDao;
import vin.dao.impl.FlowerDaoImpl;
import vin.pojo.Flower;
import vin.service.FlowerService;

import java.util.List;

public class FlowerServiceImpl implements FlowerService {
    private FlowerDao flowerDaoImpl = new FlowerDaoImpl();
    @Override
    public List<Flower> showAllFlower() {
        return flowerDaoImpl.selectAll();
    }

    @Override
    public int addFlower(Flower flower) {
        return flowerDaoImpl.insertFlower(flower);
    }
}
