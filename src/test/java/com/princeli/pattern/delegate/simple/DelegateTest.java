package com.princeli.pattern.delegate.simple;

/**
 * @author : princeli
 * @version 1.0
 * @className DelegateTest
 * @date 2019-08-31 20:10
 * @description: TODO
 */
public class DelegateTest {
    public static void main(String[] args) {
        new Boss().command("加密",new Leader());


    }
}
