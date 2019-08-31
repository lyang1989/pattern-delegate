package com.princeli.pattern.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : princeli
 * @version 1.0
 * @className Leader
 * @date 2019-08-31 19:56
 * @description: TODO
 */
public class Leader {

    private Map<String,IEmployee> register = new HashMap<String, IEmployee>();



    public Leader(){
        register.put("加密",new EmployeeA());
        register.put("架构",new EmployeeB());
    }



    public void doing(String command){
        register.get(command).doing(command);
    }
}
