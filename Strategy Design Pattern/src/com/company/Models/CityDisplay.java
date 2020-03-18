package com.company.Models;

import com.company.Interfaces.IDisplayBehaviour;

public class CityDisplay implements IDisplayBehaviour {
    @Override
    public void display() {
        System.out.println("City Ducks look cute....");
    }
}
