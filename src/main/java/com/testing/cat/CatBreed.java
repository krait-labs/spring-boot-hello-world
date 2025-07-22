package com.testing.cat;

public class CatBreed extends CatBase {
    @Override
    public void meow() {
        System.out.println("This is a Siamese cat");
        // super.meow();  // inherited from CatBase
    }
}
