/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.elon.calculator;

import java.io.Serializable;
import java.text.NumberFormat;

/**
 *
 * @author dhan
 */
public class User implements Serializable{
    
    private float amount;
    private float rate;
    private int years;
    
    public User(){
        amount = 0;
        rate = 0;
        years = 0;
    }
    
    public User(float amount, float rate, int years){
        this.amount = amount;
        this.rate = rate;
        this.years = years;
    }
    
    public float getAmount(){
        return amount;
    }
    
    public String getCurrencyamount(){
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(amount);
    }
    
    public void setAmount(float amount){
        this.amount = amount;
    }
    public float getRate(){
        return rate;
    }
    
    public void setRate(float rate){
        this.rate = rate;
    }
    
    public int getYears(){
        return years;
    }
    
    public void setYears(int years){
        this.years = years;
    }
    
    public double getCalculatefuturevalue(){
        double futurevalue = amount*Math.pow((1 + rate*.01),years);
        return futurevalue;
}
    
    public String getCurrencyfuturevalue(){
        double value = amount*Math.pow((1 + rate*.01),years);
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(value);
    }
    
    
}
