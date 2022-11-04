/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ntduy
 */
public class SavingAccount {
    private String accountID;
    private int balance;

    public SavingAccount(String accountID, int balance) {
        this.accountID = accountID;
        this.balance = balance;
    }
    
    public boolean savingWithdraw(int money){
        if(money>0 && money<balance){
            balance= balance-money;
            return true;
        } else {
            return false;
        }
    }
    
    public boolean savingDeposit(int money){
        if(money >0){
            balance= balance+money;
            return true;
        } else{
            return false;
        }
    }
    
    public int getMoney(){
        return balance;
    }
}
