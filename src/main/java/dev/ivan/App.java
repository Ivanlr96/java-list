package dev.ivan;

import java.util.List;


public class App {
    public static void main(String[] args) {
        
        JavaList javaList = new JavaList();
        javaList.printDays();
        javaList.printSize();
        javaList.deleteDay();
        javaList.printDays();
        System.out.println("El día solicitado es: " + javaList.getDayByName("Martes"));
        System.out.println(javaList.dayExists("Lunes"));
        System.out.println(javaList.dayExists("Martes"));
        javaList.sortDays();
        System.out.println("Lista ordenada:");
        javaList.printDays();
        javaList.clearDayList();
        javaList.printSize();
        
    } 
}
