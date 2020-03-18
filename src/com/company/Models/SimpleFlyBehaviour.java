package com.company.Models;

import com.company.Interfaces.IFlyBehaviour;
import com.company.Interfaces.IQuackBehaviour;

public class SimpleFlyBehaviour implements IFlyBehaviour {
    @Override
    public void Fly() {
        System.out.println("simply Flying....");
    }
}
