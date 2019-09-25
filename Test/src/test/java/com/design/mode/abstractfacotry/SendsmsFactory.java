package com.design.mode.abstractfacotry;

/**
 * @description: 发送短信工厂
 * @author: li baojian
 * @create: 2019/09/25 17:52
 */
public class SendsmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SendSms();
    }
}
