package com.company.Models;

import com.company.Interfaces.IDisplayBehaviour;

public class WildDisplayBehaviour implements IDisplayBehaviour {
    @Override
    public void display() {
        System.out.println("Wild Ducks do look wild");
    }
}
