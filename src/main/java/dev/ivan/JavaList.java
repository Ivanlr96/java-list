package dev.ivan;

import java.util.ArrayList;
import java.util.List;

public class JavaList {

    private List<String> days;

    public JavaList() {
        dayListCreation();
    }

    public List<String> dayListCreation() {
        days = new ArrayList<>();
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
        for (int i = 0; i < days.size(); i++) {
            System.out.println(days.get(i));
        }
    }

    public void printSize() {
        System.out.println("El largo de la lista es de: " + days.size());
    }

    public void deleteDay() {
        days.remove(0);

    }

public String getDayByName(String name) {
    for (int i = 0; i < days.size(); i++) {
        if (days.get(i).equalsIgnoreCase(name)) {
            return days.get(i);
        }
    }
    return "Día no encontrado";
}

}