package service.impl;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.Flower;
import service.FlowerService;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class FlowerServiceImpl implements FlowerService {
    public List<Flower> showAllFlower() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Flower> list = sqlSession.selectList("mapper.FlowerMapper.selectAllFlower");
        sqlSession.close();
        return list;
    }
}
