package com.company;

import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(20000);

        Scanner scanner = new Scanner(System.in);

        out.println("Вы подтверждаете свои действия:Да/Нет");
        switch (scanner.next()){
            case "Да":
                out.println("Начинаем процесс...");
            break;
            case "Нет":
                out.println("Отменяем процесс...");
                return;

        }


        while (true){
            try {
                out.println("__________");
                out.println("Счет:" + bankAccount.getAmount());
                bankAccount.withDraw(6000);
            } catch (LimitException e) {
                out.println(e.getMessage());
                try {
                    bankAccount.withDraw((int) bankAccount.getAmount());
                    out.println("__________");
                    out.println("Остаток счета:" + bankAccount.getAmount());

                } catch (LimitException limitException) {
                    limitException.printStackTrace();
                }
                break;

            }
            Thread.sleep(1000);
        }
    }
}
