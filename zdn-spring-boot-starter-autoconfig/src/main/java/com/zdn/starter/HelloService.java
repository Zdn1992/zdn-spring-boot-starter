package com.zdn.starter;

import org.springframework.beans.factory.annotation.Autowired;

public class HelloService {

    @Autowired
    private HelloProperties properties;

    public String sayToNewYear(){
        return properties.getFirstWord() + " 2019 " + properties.getLastWord();
    }

}
