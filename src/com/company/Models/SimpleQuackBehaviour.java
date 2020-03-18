package com.company.Models;

import com.company.Interfaces.IQuackBehaviour;

public class SimpleQuackBehaviour implements IQuackBehaviour {

    @Override
    public void Quack() {
        System.out.println("Simple Quacking.....");
    }
}
