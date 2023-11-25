/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversor.de.moneda;

/**
 *
 * @author RONAL
 */
public abstract class Exchange {
    public Double convert(double value, double exchangeValue){
        return value*exchangeValue;
    };
}
