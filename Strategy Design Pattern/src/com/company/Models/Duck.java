package com.company.Models;

import com.company.Interfaces.IDisplayBehaviour;
import com.company.Interfaces.IFlyBehaviour;
import com.company.Interfaces.IQuackBehaviour;

public class Duck {
    IFlyBehaviour flyBehaviour;
    IDisplayBehaviour displayBehaviour;
    IQuackBehaviour quackBehaviour;

    public Duck(){

    }
}
