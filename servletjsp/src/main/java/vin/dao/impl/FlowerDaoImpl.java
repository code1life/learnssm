package vin.dao.impl;

import vin.dao.FlowerDao;
import vin.pojo.Flower;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlowerDaoImpl implements FlowerDao {
    @Override
    public List<Flower> selectAll() {
        List<Flower> list = new ArrayList<>();
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultset = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/ssm?user=root&password=4password&useSSL=true");
            preparedStatement = connection.prepareStatement("select * from flower");
            resultset = preparedStatement.executeQuery();
            while (resultset.next()) {
                list.add(new Flower(resultset.getInt(1), resultset.getString(2), resultset.getFloat(3), resultset.getString(4)));
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                resultset.close();
                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    @Override
    public int insertFlower(Flower flower) {
        int index = -1;
        Connection connection = null;
        PreparedStatement preparedStatement=null;
        try {
            connection=DriverManager.getConnection("jdbc:mysql://localhost/ssm?user=root&password=4password&useSSL=true");
            preparedStatement=connection.prepareStatement(("insert into flower value (default ,?,?,?)"));
            preparedStatement.setString(1,flower.getName());
            preparedStatement.setFloat(2,flower.getPrice());
            preparedStatement.setString(3,flower.getLocation());
            index = preparedStatement.executeUpdate();
            //System.out.println("测试");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                preparedStatement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return index;
    }
}
