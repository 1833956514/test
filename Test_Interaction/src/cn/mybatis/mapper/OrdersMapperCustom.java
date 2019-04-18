package cn.mybatis.mapper;

import cn.mybatis.po.Orders;
import cn.mybatis.po.OrdersCustom;
import cn.mybatis.po.User;

import java.util.List;

/*
订单的mapper
 */
public interface OrdersMapperCustom {

    //查询订单关联查询用户信息
    public List<OrdersCustom> findOrderUser() throws Exception;
    //查询订单关联查询用户使用resultMap
    public List<Orders> findOrderUserResultMap() throws Exception;
    //查询订单（关联用户）及订单明细
    public List<Orders> findOrdersAndOrderDetailResultMap() throws Exception;
    //查询用户购买商品信息
    public List<User> findUserAndItemsResultMap() throws Exception;
    //查询订单关联查询用户，用户信息式延迟加载
    public List<Orders> findOrdersUserLazyLoading() throws Exception;

}
