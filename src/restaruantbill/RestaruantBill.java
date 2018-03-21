/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package restaruantbill;

import java.text.DecimalFormat;

/**
 *
 * @author rizha6783
 */import java.text.*;
public class RestaruantBill{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Meal = 8.95;
        double HST = 8.95*0.13;
        double Total = 0.0;
        // This is the calculation for the restaurant bill
        Total= Meal+ Meal*0.13;
        DecimalFormat x = new DecimalFormat("###.##");
        System.out.println(x.format(Total));
                                   
    }
    
}
       
        
 
        
    

