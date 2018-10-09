package com.darling.order.test;

import com.darling.pubIn.bean.User;
import com.darling.pubIn.bean.UserAddress;
import com.darling.pubIn.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.util.List;

/**
 *   @author 董琳琳
 *   @date 2018/9/14 15:57
 *   @description 测试服务调用者是否成功从注册中心订阅服务
 */
public class TestConsumerDemo {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("consumer.xml");
        OrderService service = applicationContext.getBean(OrderService.class);
        List<User> list = service.initOrder("1");
        for (User user:list) {
            System.out.println(user.toString());
        }
        System.in.read();
    }
}
