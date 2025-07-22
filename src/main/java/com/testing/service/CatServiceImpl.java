package com.testing.service;

import org.springframework.stereotype.Service;

import com.testing.cat.CatBase;

@Service
public class CatServiceImpl extends CatBase {
    @Override
    public void meow() {
        System.out.println("Meow antonie");
    }
}

