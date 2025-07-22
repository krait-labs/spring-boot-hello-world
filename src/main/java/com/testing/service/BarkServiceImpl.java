package com.testing.service;

import org.springframework.stereotype.Service;

@Service
public class BarkServiceImpl extends AbstractGreetingService {
    @Override
    public String greet(String name) {
        return "Bark, " + name + "!";
    }
}

