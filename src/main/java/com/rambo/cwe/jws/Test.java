package com.rambo.cwe.jws;

import com.rambo.cwe.jws.impl.MyFirstWebServiceImpl;

import javax.xml.ws.Endpoint;

/**
 * Create by Yet on 2016/9/7
 **/
public class Test {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:7005/testjws/service/sayHi", new MyFirstWebServiceImpl());
    }
}