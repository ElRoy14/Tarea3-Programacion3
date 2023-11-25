/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversor.de.moneda;

/**
 *
 * @author RONAL
 */
public class kitchenConvertion extends Exchange{
    
    public String convert(double food, Object measure){
        
        double valueExchange = 0;
        String unitExchange = "";
    
        switch(measure.toString()){
        
            case "Onzas a Copas":
                    valueExchange = convert(food, 8.333);
                    unitExchange = " Copas";
                break;
                
            case "Mililitros a Litros":
                    valueExchange = convert(food, 1000);
                    unitExchange = " Litros";
                break;
                
            case "Gramos a Tazas":
                    valueExchange = convert(food, 200);
                    unitExchange = " Tazas";
                break;
                
            case "Gramos a Kilogramos":
                    valueExchange = convert(food, 1000);
                    unitExchange = " Kilogramos";
                break;
                
            case "Kilogramos a Libras":
                    valueExchange = convert(food, 2.205);
                    unitExchange = " Libras";
                break;
            
            case "Libras a Kilogramos":
                    valueExchange = convert(food, 0.45);
                    unitExchange = " Kilogramos";
                break;
                
            case "Gramos a Cucharadas":
                    valueExchange = convert(food, 13);
                    unitExchange = " Cucharadas";
                break;
                
            case "Cucharada a Mililitros":
                    valueExchange = convert(food, 14.7868);
                    unitExchange = " Mililitros";
                break;
                
            case "Taza a Mililitros":
                    valueExchange = convert(food, 236.6);
                    unitExchange = " Mililitros";
                break;
                
        }
        return Math.round(valueExchange) + unitExchange;
    };

    @Override
    public Double convert(double value, double exchangeValue) {
        return value*exchangeValue;
    }
    
}
