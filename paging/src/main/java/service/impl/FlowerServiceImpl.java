package service.impl;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.reflection.SystemMetaObject;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.Flower;
import pojo.PageInfo;
import service.FlowerService;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlowerServiceImpl implements FlowerService {
    @Override
    public PageInfo showPage(int pageNumber, int pageSize) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        int totalFlowerNumber = sqlSession.selectOne("mapper.FlowerMapper.selectCount");
        Map<String, Integer> map = new HashMap<>();
        map.put("start",pageSize*(pageNumber-1));
        map.put("number",pageSize);
        List<Flower> list = sqlSession.selectList("mapper.FlowerMapper.selectPage", map);
        sqlSession.close();
        return new PageInfo(pageSize,pageNumber,totalFlowerNumber,list);
    }
}
