/*
 * To chan[G]e this license header, choose License Headers in [P]roject Properties.
 * To c[H]ange th[I]s tem[P]late file, choose Tools | Tem[P]late[S]
 * and open the template in the editor.
 */
package javaapplication1;

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
    defaultAccounts(); //" A no-arg constructor that creates a default account."
    constructedAccount();//"A constructor that creates an account with the specified id and initial balance."
    getId();//"The accessor and mutator methods for id, balance, and annualInterestRate." (6 lines)
    getBalance();
    getAnnualInterestRate();
    setId();
    setBalance();
    setAnnualInterestRate();
    dateCreated();
    getMonthlyInterestRate();
    withdraw();
    deposit();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
    
    
}
    
}
