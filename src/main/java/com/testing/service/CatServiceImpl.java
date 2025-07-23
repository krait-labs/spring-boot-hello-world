package com.testing.service;

import org.springframework.stereotype.Service;

import com.testing.cat.CatName;

@Service
public class CatServiceImpl extends CatName {
    @Override
    public void meow() {
        System.out.println("Meow antonie");
    }
}

