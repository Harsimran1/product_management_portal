/**
 * Created by harsimran on 30/6/15.
 */
package com.tutorialspoint.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport{
    private String name;

    public String execute() throws Exception {
        if("SECRET".equals(name))
        return SUCCESS;
        else
            return ERROR;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
