/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.util.Date;

/**
 *
 * @author 21368236
 */
public class Account {
    private int id;//private data fields
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    
    
    public Account()
    {
        id = 0;
    }
    
    
    public Account(int ID, double b, double interest)
    {
        id = ID;
        balance = b;
        annualInterestRate = interest;
    }
    
    public void print_account()
    {
        System.out.println("ID: " + id);
        System.out.println("balance: " + balance);

        System.out.println("annual interest rate: " + annualInterestRate);
    }
}
-----------------------------------------------------------------------------------------------------------------------------------------
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

/**
 *
 * @author 21368236
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Account acc1 = new Account(1234, 20000, 4.5);
        acc1.print_account();
    }
    
}
