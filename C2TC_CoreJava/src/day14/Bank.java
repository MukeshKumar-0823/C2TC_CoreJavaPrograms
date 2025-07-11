package day14;

public abstract class Bank {
    int MINBAL=5000; //fields are static and final
    static final int DAILY_LIMIT=25000;
    public abstract void deposit(int amt) throws DepositLimitExceedsException;
    abstract void withdraw(int amt)throws InsufficientBalanceException;
}
