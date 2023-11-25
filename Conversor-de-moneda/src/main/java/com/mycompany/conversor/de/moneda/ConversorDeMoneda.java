 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.conversor.de.moneda;

/**
 *
 * @author RONAL
 */

import javax.swing.JOptionPane;
        
public class ConversorDeMoneda {

    public static void main(String[] args) {
        
        currencyConvertion converter1 = new currencyConvertion();
        kitchenConvertion converter2 = new kitchenConvertion();
        JOptionPane pane = new JOptionPane();
        
        double money = 0;
        double food = 0;
        
        Object[] converters ={"Conversor de moneda","Conversor de unidades"};
        Object[] moneyExchange ={"Pesos Dominicanos a Dolar","Pesos Dominicanos a Euro",
                            "Pesos Dominicanos a Libras","Pesos Dominicanos a Yen", 
                            "Pesos Dominicanos a Won Coreano","Dolar a Pesos Dominicanos",
                            "Euro a Pesos Dominicanos","yen a Pesos Dominicanos",
                            "Won Coreano a Pesos Dominicanos"};
        Object[] unitsExchange ={"Onzas a Copas", "Mililitros a Litros", 
                                 "Gramos a Tazas", "Gramos a Kilogramos", 
                                 "Kilogramos a Libras", "Libras a Kilogramos", 
                                 "Gramos a Cucharadas", "Cucharada a Mililitros",
                                 "Taza a Mililitros"};
        
        while(true){
            
            Object option = pane.showInputDialog(null,"Selecciona un conversor", "Elegir",JOptionPane.QUESTION_MESSAGE,null,converters, converters[0]);
            JOptionPane.showMessageDialog(null, "Elegiste " + option);
            
            if("Conversor de moneda".equals(option.toString())){
                
                while(true){
                    try{
                        money = Double.parseDouble(pane.showInputDialog(null, "Ingrese la cantidad de dinero que desea convertir"));
                        break;
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(null, "Valor no valido", "Message", JOptionPane.ERROR_MESSAGE);
                    }
                }
                
                JOptionPane.showMessageDialog(null, "La cantidad de dinero es " + money);
                
                Object rate = pane.showInputDialog(null,"Selecciona un conversor", "Elegir",JOptionPane.QUESTION_MESSAGE,null,moneyExchange, moneyExchange[0]);
                
                JOptionPane.showMessageDialog(null, "El cambio es " + rate);
                
                JOptionPane.showMessageDialog(null, "Tienes " + converter1.convert(money, rate));
                
                int cont = JOptionPane.showConfirmDialog(null, "¿Desea contnuar?", "Select an option", JOptionPane.YES_NO_CANCEL_OPTION);
                
                if (0 != cont)  break;
                
            }else{
                 while(true){
                    try{
                        food = Double.parseDouble(pane.showInputDialog(null, "Ingrese la cantidad que desea convertir."));
                        break;
                    }catch(NumberFormatException ex){
                        JOptionPane.showMessageDialog(null, "Valor no valido", "Message", JOptionPane.ERROR_MESSAGE);
                    }
                }
                
                JOptionPane.showMessageDialog(null, "La cantidad es " + food);
                
                Object mesaure = pane.showInputDialog(null,"Selecciona un conversor", "Elegir",JOptionPane.QUESTION_MESSAGE,null,unitsExchange, unitsExchange[0]);
                
                JOptionPane.showMessageDialog(null, "El cambio es " + mesaure);
                
                JOptionPane.showMessageDialog(null, "Tienes " + converter2.convert(food, mesaure));
                
                int cont = JOptionPane.showConfirmDialog(null, "¿Desea contnuar?", "Select an option", JOptionPane.YES_NO_CANCEL_OPTION);
                
                if (0 != cont)  break;
            }
        }
        JOptionPane.showMessageDialog(null, "Programa Terminado");
    }
}
