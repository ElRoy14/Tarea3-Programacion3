/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversor.de.moneda;

import java.util.ArrayList;

/**
 *
 * @author RONAL
 */
public class currencyConvertion extends Exchange {
    
    public String convert(double money, Object rate){
        
        double valueExchange = 0;
        String currencyExchange = "";
    
        switch(rate.toString()){
        
            case "Pesos Dominicanos a Dolar":
                    valueExchange = convert(money, 0.018);
                    currencyExchange = " Dolares";
                break;
                
            case "Pesos Dominicanos a Euro":
                    valueExchange = convert(money, 0.016);
                    currencyExchange = " Euros";
                break;
                
            case "Pesos Dominicanos a Libras":
                    valueExchange = convert(money, 0.014);
                    currencyExchange = " Libras";
                break;
                
            case "Pesos Dominicanos a Yen":
                    valueExchange = convert(money, 2.14);
                    currencyExchange = " Yenes";
                break;
                
            case "Pesos Dominicanos a Won Coreano":
                    valueExchange = convert(money, 23.04);
                    currencyExchange = " Wones";
                break;
            
            case "Dolar a Pesos Dominicanos":
                    valueExchange = convert(money, 58.16);
                    currencyExchange = " Pesos";
                break;
                
            case "Euro a Pesos Dominicanos":
                    valueExchange = convert(money, 61.80);
                    currencyExchange = " Pesos";
                break;
                
            case "yen a Pesos Dominicanos":
                    valueExchange = convert(money, 0.39);
                    currencyExchange = " Pesos";
                break;
                
            case "Won Coreano a Pesos Dominicanos":
                    valueExchange = convert(money, 0.043);
                    currencyExchange = " Pesos";
                break;
                
        }
        return Math.round(valueExchange) + currencyExchange;
    };
    
    @Override
    public Double convert(double dinero, double rate){
        return dinero*rate;
    };
    
    
}
