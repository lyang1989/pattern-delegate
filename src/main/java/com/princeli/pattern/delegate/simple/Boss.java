package com.princeli.pattern.delegate.simple;

/**
 * @author : princeli
 * @version 1.0
 * @className Boss
 * @date 2019-08-31 19:56
 * @description: TODO
 */
public class Boss {


    public void command(String command,Leader leader){
        leader.doing(command);
    }
}
