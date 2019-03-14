/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmProject;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 2B
 */
public class Atm3 implements MyAtm {

    
    MyAcc a;
    int count = 0;
    String amount;
    private String balance;
    ArrayList trans = new ArrayList<>();

    public Atm3(MyAcc a) {
        this.a = a;
    }

   

    @Override
    public String desposite(String amount) {
        double b = Double.parseDouble(amount);
        if (a.getAmount() > 0) {
            double balance = a.getBalance();
            a.setBalance(balance + b);
        }
        String input = "deposit";
        trans.add( amount);
        count = trans.size()-1;
        
        //System.out.println("Current trans"+ trans);
        return balance;
    }

    @Override
    public String withdraw(String amount) {

        double b = Double.parseDouble(amount);
        if (a.getBalance() >= b) {
            double balance = a.getBalance();
            a.setBalance(balance-b);
        }

        String input = new String("Withdraw");
        trans.add( amount);
        count = trans.size()-1;
        return balance;
    }

    @Override
    public String previous() {
        System.out.println(count);
        if (count > 0) {
            return (String) trans.get(count--);
        }else if (count ==0){
            return (String) trans.get(count);
    }
        return "ERROR!!";
    }

    @Override

    public String next() {
        if (count < trans.size()-1) {
            return (String) trans.get(++count);
        }
       
        return "ERORR!!";
    }

    @Override
    public String getCurrentBalance() {
        String input = new String("");
     
        return a.getBalance() + "";
    }

}
