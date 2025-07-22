package com.testing.cat;

public class CatName extends CatBase {
    @Override
    public void meow() {
        System.out.println("meow from Whiskers");
        // speak();  // inherited from CatBase
    }
}