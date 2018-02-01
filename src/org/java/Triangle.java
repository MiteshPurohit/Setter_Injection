/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.java;

/**
 *
 * @author Hardik
 */
public class Triangle {
    
    private int a;
    private String msg;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    
    
    public void display(){
        
        System.out.println("A is :"+getA());
        System.out.println("Msg is :"+getMsg());
        
    }
}
