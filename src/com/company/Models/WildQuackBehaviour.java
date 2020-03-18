package com.company.Models;

import com.company.Interfaces.IQuackBehaviour;

public class WildQuackBehaviour implements IQuackBehaviour {
    @Override
    public void Quack() {
        System.out.println("Wildly Quacking....");
    }
}
