package com.princeli.pattern.delegate.simple;

/**
 * @author : princeli
 * @version 1.0
 * @className EmployeeB
 * @date 2019-08-31 20:04
 * @description: TODO
 */
public class EmployeeB implements IEmployee{
    @Override
    public void doing(String command) {
        System.out.println("我是员工A，我开始干活了，我擅长架构，执行"+command);
    }
}
