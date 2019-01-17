package service;

import pojo.Flower;
import pojo.PageInfo;

import java.io.IOException;
import java.util.List;

public interface FlowerService {
    PageInfo showPage(int pageNumber, int pageSize) throws IOException;
}
