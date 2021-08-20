package com.khubaib;

//simple class of savingsAccount
class SavingsAccount {

    //declaring variables
    static double annualInterestRate;
    private double savingsBalance;

    //account with balance available
    SavingsAccount(float balance){
        savingsBalance = balance;
    }

    //calculates the monthly interest and adds it to the accounts balance
    public void calculateMonthlyInterest() {
        savingsBalance += (savingsBalance * (annualInterestRate / 100)) / 12;
    }

    //gives the balance when called
    double getBalance(){
        return  savingsBalance;
    }

    //to change the interest rate
    static void modifyInterestRate(int rate){
        annualInterestRate = rate;
    }


}

//class for savingsaAccountTesting
class SavingsAccountTesting {

    //main class
    public static void main(String[] args) {

        //declaring the two savers with the initial balance in their accounts
        SavingsAccount saver1 = new SavingsAccount(3200);
        SavingsAccount saver2 = new SavingsAccount(4500);

        System.out.println("SAVINGS ACCOUNT MONTHLY STATEMENT FOR TWO SAVERS\n");

        System.out.println("MONTH |\t  SAVER1\t|\t SAVER2");
        System.out.println("------|-------------|--------------");

        //the interest rate is kept at 5%
        SavingsAccount.modifyInterestRate(5);

        //prints the result for each month for one year
        for (int i=0;i<12;i++){

            //calculates the monthly interest and adds them in the balance of the user
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();

            System.out.print((i+1)+"\t  |  $ ");//prints the month
            System.out.printf("%.2f",saver1.getBalance());//prints the balance of saver1
            System.out.print("  |\t$ ");
            System.out.printf("%.2f",saver2.getBalance());//prints the balance of saver2
            System.out.println();
        }

        System.out.println();
        System.out.println("FOR THE 13th MONTH, WITH THE INTEREST RATE AT 7%:\n");

        //changes the interest rate at 7 percent
        SavingsAccount.modifyInterestRate(7);

        //calculates the monthly interests
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        System.out.print("Balance of saver-1 is: $ ");
        System.out.printf("%.2f", saver1.getBalance());//prints out the balance of saver1
        System.out.println();
        System.out.print("Balance of saver-2 is: $ ");
        System.out.printf("%.2f", saver2.getBalance());//prints out the balance of saver2

    }
}


