package org.example;
import javax.naming.Context;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть текст повідомлення: ");

        String userInput = scanner.nextLine();

        System.out.println("Ви ввели: " + userInput);

        scanner.close();

        System.out.println("Закодовані дані: " + new Encode().execute(userInput));
        System.out.println("Стиснуті дані: " + new Compress().execute(userInput));
        System.out.println("Додано поточні дату та час: " + new Date().execute(userInput));
        System.out.println("Додано автора: " + new Author().execute(userInput));

    }
}