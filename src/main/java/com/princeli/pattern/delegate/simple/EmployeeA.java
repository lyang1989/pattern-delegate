package com.princeli.pattern.delegate.simple;

/**
 * @author : princeli
 * @version 1.0
 * @className EmployeeA
 * @date 2019-08-31 20:00
 * @description: TODO
 */
public class EmployeeA implements IEmployee{

    @Override
    public void doing(String command) {
        System.out.println("我是员工A，我开始干活了，我擅长加密，执行"+command);
    }
}
