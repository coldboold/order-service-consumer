package com.darling.order;

import com.darling.pubIn.bean.User;
import com.darling.pubIn.service.OrderService;
import com.darling.pubIn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *   @author 董琳琳
 *   @date 2018/9/14 11:50
 *   @description   订单服务的实现类
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    /**
     * 初始化订单并调用用户服务的接口
     * @param userId
     * @return
     */
    @Override
    public List<User> initOrder(String userId) {
        return userService.getUserAddressList(userId);
    }
}
