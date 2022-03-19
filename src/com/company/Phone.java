package com.company;

import java.util.Arrays;

public class Phone {
    protected int number;
    protected String model;
    protected double weight;

    protected Phone () { // конструктор без параметров
    }

    protected Phone (int number, String model) { // конструктор: на вход 2 параметра
        this.number = number;
        this.model = model;
    }
    protected Phone (int number, String model, double weight) { // конструктор: на вход 3 параметра и вызов конструктора с 2 параметрами
        this(number, model);
    }

    protected int getNumber() {
        return number;
    }
    protected void setNumber(int number) {
        this.number = number;
    }

    protected String getModel() {
        return model;
    }
    protected void setModel(String model) {
        this.model = model;
    }

    protected double getWeight() {
        return weight;
    }
    protected void setWeight(double weight) {
        this.weight = weight;
    }

    void displayInfo() {
        System.out.println(getNumber() + " " + getModel() + " " + getWeight());
    }

    void receiveCall(String name) { // метод с 1 вход. параметром
        System.out.println("Звонит " + name + "." + " " + getNumber());
    }

    void receiveCall(String name, int number) { // перегрузка метода
        System.out.println("Звонит " + name + "." + " с номера " + number);
    }

    void sendMessage(int ...var) { // метод с аргументами переменной длины
        System.out.println(Arrays.toString(var));
    }
}
