package com.danis;

public class Main {
    public static void main(String[] args) {
        CashMachine cashMachine = new CashMachine(10, 10, 5);
        System.out.println(cashMachine.giveOut(120));
    }

}
