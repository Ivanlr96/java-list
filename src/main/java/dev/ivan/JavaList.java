package dev.ivan;

import java.util.ArrayList;
import java.util.List;

public class JavaList {

    public List<String> dayListCreation() {
        List<String> days = new ArrayList<>();
        days.add("Lunes");
        days.add("Martes");
        days.add("Miércoles");
        days.add("Jueves");
        days.add("Viernes");
        days.add("Sábado");
        days.add("Domingo");
        return days;
    }

    public void printDays() {
        List<String> days = dayListCreation();
        for (int i = 0; i < days.size(); i++) {
            System.out.println(days.get(i));
        }
    }
}