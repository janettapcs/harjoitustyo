package com.example.harjoitustyo;



import java.util.ArrayList;

public class Bank {

    private int id;
    private String name;
    private String address;
    private String country;

    static ArrayList<User> userList = new ArrayList<User>();

    private static final Bank bankInstance = new Bank(1, "Bank", "Address 1", "Finland");

    public static Bank getInstance() {
        return bankInstance;
    }

    private Bank(int id, String name, String address, String country) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.country = country;
        userList.add(new User("test", "test@gmail.com", "password"));
        Session.setUser("test");

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getCountry() {
        return country;
    }

    public ArrayList<User> getUserList() {

        return userList;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

    public boolean createAccount(String accountNumberText, String limitText, String userName ){
        ArrayList<User> userList = this.getUserList();
        User user = null;
        int i;
        for (i = 0; i < userList.size(); i++) {
            user = userList.get(i);
            if (user.getUsername().equals(userName)) { break; }
        }
        int intLimit;
        intLimit = Utilities.strToInt(limitText);
        Account newAccount = new Account(accountNumberText, 0, intLimit);
        user.getAccountList().add(newAccount);
        System.out.println("account created. accountname: " + accountNumberText);
        return true;
    }

    public boolean addMoney(String accountNumberText, String amountText) {
        ArrayList<User> userList = this.getUserList();
        User user = null;
        int i;
        for (i = 0; i < userList.size(); i++) {
            user = userList.get(i);
            if (user.getUsername().equals(Session.getUser())) { break; }
        }
        ArrayList<Account> accountList = user.getAccountList();
        Account account = null;
        int j;
        for (j=0; j < accountList.size(); j++) {
            account = accountList.get(j);
            if (account.getNumber().equals(accountNumberText)) {
                int amount = Utilities.strToInt(amountText);
                int newBalance = account.getBalance() + amount;
                account.setBalance(newBalance);
                System.out.println("balance added to account " + account.getNumber() + "new balance: " + account.getBalance());
                return true;
            }
        }
        return false;
    }

    public boolean decMoney(String accountNumberText, String amountText) {
        ArrayList<User> userList = this.getUserList();
        User user = null;
        int i;
        for (i = 0; i < userList.size(); i++) {
            user = userList.get(i);
            if (user.getUsername().equals(Session.getUser())) { break; }
        }
        ArrayList<Account> accountList = user.getAccountList();
        Account account = null;
        int j;
        for (j=0; j < accountList.size(); j++) {
            account = accountList.get(j);
            if (account.getNumber().equals(accountNumberText)) {
                int amount = Utilities.strToInt(amountText);
                int balance = account.getBalance();
                if(amount > balance) {
                    return false;
                }
                int newBalance = account.getBalance() - amount;
                account.setBalance(newBalance);
                System.out.println("balance removed from account " + account.getNumber() + "new balance: " + account.getBalance());
                return true;
            }
        }
        return false;
    }
    public boolean transMoney(String source, String target, String amount ){
        boolean decMoneySuccess = this.decMoney(source, amount);
        if(!decMoneySuccess) {
            return false;
        } else {
        this.addMoney(target, amount);
        return true;
        }
    }

    public boolean transMoneyToOther(String source, String amount ){
        return this.decMoney(source, amount);
    }


}
