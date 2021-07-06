package com.company;

public class BankAccount {

    double amount;

    public double getAmount(){
        return amount;
    }

    public void deposit(double sum){
        amount += sum;


    }
    public double withDraw(int sum) throws LimitException{

        if (sum > amount){
            throw new LimitException ("Снимаем оставшиейся сумму...", getAmount());
        }
        amount -= sum;
        System.out.println("Снимаемый счет:" + sum);
        return amount;
    }

}

