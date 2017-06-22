package com.ywc.struts;

import com.opensymphony.xwork2.Action;

public class HelloWorldAction implements Action {
    public String execute() throws Exception {
        System.out.println("执行了Action的默认方法");
        return SUCCESS;
    }

}
