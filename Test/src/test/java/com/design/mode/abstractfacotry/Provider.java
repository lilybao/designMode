package com.design.mode.abstractfacotry;

/**
 * @description: 发送消息工厂接口
 * @author: li baojian
 * @create: 2019/09/25 17:41
 */
public interface Provider {
    Sender produce();
}
