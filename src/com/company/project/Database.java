package com.company.project;

public class Database {
    public static BankAccount allAccounts[] = new BankAccount[10];

    static{

        allAccounts[0] = new CityBankAccount("Ilyas","Zhuanyshev",10000,"1111", "1111");

        allAccounts[1] = new CityBankAccount("Erbol","Assanbek",123518,"KZ010322313", "0101");

        allAccounts[2] = new NationalBankAccount("Ilyas Zhuanyshev",44578526,"KZ010111", "0102");
        // Таким образом на ваше усмотрение мы должны заполнить список всех счетов

    }

}
