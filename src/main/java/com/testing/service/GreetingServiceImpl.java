package com.testing.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl extends AbstractGreetingService {
    @Override
    public String greet(String name) {
        return "Hello, " + name + "!";
    }
}
