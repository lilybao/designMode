package com.design.mode.abstractfacotry;

/**
 * @description: 发送邮件工厂
 * @author: li baojian
 * @create: 2019/09/25 17:43
 */
public class SendEmailFactory implements Provider {
    @Override
    public Sender produce() {
        return new SendEmail();
    }
}
