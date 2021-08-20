# Savings-Account

class SavingsAccount . 
Uses a static variable annualInterestRate to store the annual interest rate for all account holders. Each object of the class contains a private instance variable savingsBalance indicating the amount the saver currently has on deposit. Method calculateMonthlyInterest to calculate the monthly interest by multiplying the savingsBalance by annualInterestRate divided by 12—this interest is added to savingsBalance.

A static method modifyInterestRate is provided that sets the annualInterestRate to a new value.

test class SavingsAccount. 

Instantiate two savingsAccount objects, saver1 and saver2, with initial balance of $3200.00 and $4500.00, respectively. 
annualInterestRate is set to 5%, then calculates the monthly interest for each of 12 months and prints the new balances for both savers. Next, sets the annualInterestRate to 7%, calculate the next month’s interest and print the new balances for both savers.
