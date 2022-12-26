package com.danis;

public class CashMachine {
    private int bills20;
    private int bills50;
    private int bills100;
    private static int BILL20 = 20;
    private static int BILL50 = 50;
    private static int BILL100 = 100;

    public CashMachine(int bills20, int bills50, int bills100) {
        this.bills20 = bills20;
        this.bills50 = bills50;
        this.bills100 = bills100;
    }

    public void add(int bills20, int bills50, int bills100) {
        this.bills20 += bills20;
        this.bills50 += bills50;
        this.bills100 += bills100;
    }

    public boolean giveOut(int sum) {
        if(sum < 0) {
            System.out.println("Сумма должна быть больше 0!");
            return false;
        }
        int bills20forGivingOut = 0;
        int bills50forGivingOut = 0;
        int bills100forGivingOut = 0;
        bills100forGivingOut = Math.min(sum / BILL100, bills100);
        bills50forGivingOut = Math.min((sum - bills100forGivingOut * 100) / BILL50, bills50);
        bills20forGivingOut = Math.min((sum - bills100forGivingOut * 100 - bills50forGivingOut * 50) / BILL20, bills20);
        if(bills20forGivingOut * BILL20 + bills50forGivingOut * BILL50 + bills100forGivingOut * BILL100 == sum) {
            System.out.println("Выдано:" + bills20forGivingOut + " 20-ти рублевых купюр, " +
                    bills50forGivingOut + " 50-ти рублевых купюр, " +
                    bills100forGivingOut + " 100-ти рублевых купюр");
            return true;
        } else {
            System.out.println("Выдача невозможна!");
            return false;
        }


    }

    public int getBills20() {
        return bills20;
    }

    public void setBills20(int bills20) {
        this.bills20 = bills20;
    }

    public int getBills50() {
        return bills50;
    }

    public void setBills50(int bills50) {
        this.bills50 = bills50;
    }

    public int getBills100() {
        return bills100;
    }

    public void setBills100(int bills100) {
        this.bills100 = bills100;
    }
}
