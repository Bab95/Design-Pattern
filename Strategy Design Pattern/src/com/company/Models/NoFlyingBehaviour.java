package com.company.Models;

import com.company.Interfaces.IFlyBehaviour;

public class NoFlyingBehaviour implements IFlyBehaviour {
    @Override
    public void Fly() {
        System.out.println("Some ducks can't fly...");
    }
}
