package com.company.Models;

import com.company.Interfaces.IFlyBehaviour;

public class JetFlyingBehaviour implements IFlyBehaviour {
    @Override
    public void Fly() {
        System.out.println("Jet Fling....");
    }
}
