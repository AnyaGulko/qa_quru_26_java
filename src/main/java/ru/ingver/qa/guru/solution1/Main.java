package ru.ingver.qa.guru.solution1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int first = 12;
        int second = 4;
        double third = 5.7;

        //математические операции + сразу вычисления комбинаций типов данных int и double
        System.out.println("Сумма равна - " + (first + second));
        System.out.println("Разница равна - " + (first - third));
        System.out.println("Результат деления равен - " + (third / second));
        System.out.println("Произведение равно - " + (first * second));
        System.out.println("Остаток от деления равен - " + (first % second));

        //пример переполнения
        int a = Integer.MAX_VALUE;
        int b = 6;
        System.out.println("Переполнение: " + (a + b));


        //логические операторы
        Scanner console = new Scanner(System.in);
        System.out.println("Введи свою температуру: ");
        double temperature = console.nextDouble();
        if ((temperature > 33 && temperature < 36) || (temperature >= 37 && temperature < 42)){
            System.out.println("Тебе пора в больницу");
        } else if (temperature >=36 && temperature < 37 && temperature !=36.6){
            System.out.println("У тебя нормальная температура");
        } else if (temperature == 36.6){
            System.out.println("У тебя самая комфортная температура");
        } else {
            System.out.println("Возможно you are dead 💀");
        }
    }
}
