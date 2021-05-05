package com.company.project;

import java.util.Scanner;

public class CityBankATM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("acount number: ");
            String acc = scanner.next();
            System.out.println("pin number:  ");
            String pin = scanner.next();
            BankAccount ba = null;
            for (BankAccount a : Database.allAccounts) {
                if (a != null &&
                        a.getAccountNumber().equalsIgnoreCase(acc) &&
                        a.getPinCode().equalsIgnoreCase(pin)) {
                    ba = a;
                }
            }
            if (ba instanceof CityBankAccount) {
                System.out.println("PRESS [1] TO CASH WITHDRAWAL  // снять деньги\n" +
                        "\n" +
                        "               PRESS [2] TO VIEW BALANCE // просмотр баланса\n" +
                        "\n" +
                        "               PRESS [3] TO CHANGE PIN CODE // изменить пин код\n" +
                        "\n" +
                        "               PRESS [4] TO CASH IN ACCOUNT // добавить деньги в счет\n" +
                        "\n" +
                        "               PRESS [5] TO VIEW ACCOUNT DATA // просмотр данные счета\n" +
                        "\n" +
                        "               PRESS [6] TO EXIT // выход");
                int choice = scanner.nextInt();
                if (choice == 1) {
                    System.out.println("how much?:");
                    int c = scanner.nextInt();
                    ba.creditBalance(c);
                } else if (choice == 2) {
                    ba.totalBalance();
                } else if (choice == 3) {
                    System.out.println("new pin:");
                    String c = scanner.next();
                    ba.setPinCode(c);
                } else if (choice == 4) {
                    System.out.println("how much?: ");
                    choice = scanner.nextInt();
                    ba.debetBalance(choice);
                } else if (choice == 5) {
                    ba.accountData();
                } else if (choice == 6) {
                    System.exit(0);
                }
                //... menu of cityBank
            } else {
                System.out.println("PRESS [1] TO CASH WITHDRAWAL\n" +
                        "\n" +
                        "               PRESS [2] TO VIEW BALANCE\n" +
                        "\n" +
                        "               PRESS [3] TO EXIT");
             //   int choice = scanner.nextInt();
           //     if (choice == 1) {
             //       System.out.println("how much?:");
             //       int c = scanner.nextInt();
             //       ba.creditBalance(c);
             //   } else if (choice == 2) {
             //       ba.totalBalance();
             //   } else if (choice == 3) {
              //      System.exit(0);
                    //... menu
                }
            }
        }
    }