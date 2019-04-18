package cn.mybatis.mapper;

import cn.mybatis.po.Orders;
import cn.mybatis.po.OrdersCustom;
import cn.mybatis.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

import static org.junit.Assert.*;

public class OrdersMapperCustomTest {
    private SqlSessionFactory sqlSessionFactory;

    @Before
    public void setUp() throws Exception {
        //创建sqlSessionFactory
        //mybatis配置文件
        String resource = "SqlMapConfig.xml";
        //得到配置文件流
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //创建会话工厂，传入mybatis的配置文件信息
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
    }

    @Test
    public void findOrderUser() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建代理对象
        OrdersMapperCustom ordersMapperCustom = sqlSession.getMapper(OrdersMapperCustom.class);
        //调用mapper的方法
        List<OrdersCustom> list = ordersMapperCustom.findOrderUser();

        System.out.println(list);

        sqlSession.close();

    }

    @Test
    public void findOrderUserResultMap() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建代理对象
        OrdersMapperCustom ordersMapperCustom = sqlSession.getMapper(OrdersMapperCustom.class);
        //调用mapper的方法
        List<Orders> list = ordersMapperCustom.findOrderUserResultMap();

        System.out.println(list);

        sqlSession.close();

    }

    //查询订单关联查询用户，用户信息使用延迟加载
    @Test
    public void findOrdersUserLazyLoading() throws Exception {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //创建代理对象
        OrdersMapperCustom ordersMapperCustom = sqlSession.getMapper(OrdersMapperCustom.class);
        //调用mapper的方法
        List<Orders> list = ordersMapperCustom.findOrdersUserLazyLoading();
        //查询订单信息（单表）
        for (Orders orders : list) {
            //执行getUser()去查询用户信息，这里实现按需加载
            User user = orders.getUser();
            System.out.println(user);
        }

        sqlSession.close();

    }

}