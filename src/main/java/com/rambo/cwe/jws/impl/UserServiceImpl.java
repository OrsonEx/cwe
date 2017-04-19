package com.rambo.cwe.jws.impl;

import com.rambo.cwe.jws.inter.UserService;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;


/**
 * 作为测试的WebService实现类
 */
@WebService(endpointInterface = "com.rambo.cwe.jws.inter.UserService")
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class UserServiceImpl implements UserService {

    public String sayHi(String name) {
        return "Hi, " + name + "! ";
    }
}