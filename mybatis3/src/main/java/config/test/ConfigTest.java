package config.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.Flower;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ConfigTest {
    public static void main(String[] args) throws IOException {
        //System.out.println("this is a test");
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        try {
            /*Flower flower = sqlSession.selectOne("mapper.FlowerMapper.selectFlowerById",1);
            System.out.println(flower.toString());*/
            List<Flower> list = sqlSession.selectList("mapper.FlowerMapper.selectAllFlower");
            for (Flower flower : list) {
                System.out.println(flower.toString());
            }
        } finally {
            sqlSession.close();
        }
    }
}
