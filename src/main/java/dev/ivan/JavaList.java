package dev.ivan;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class JavaList {

    private List<String> days;

    public JavaList() {
        dayListCreation();
    }

    public void dayListCreation() {
        days = new ArrayList<>();
        days.add("Lunes");
        days.add("Martes");
        days.add("Miércoles");
        days.add("Jueves");
        days.add("Viernes");
        days.add("Sábado");
        days.add("Domingo");
    }

    public List<String> getDays() {
        return days;
    }

    public int printSize() {
        return days.size();
    }

   public void deleteDay(String day) {
    days.removeIf(d -> d.equalsIgnoreCase(day));
}

    public String getDayByName(String name) {
        for (int i = 0; i < days.size(); i++) {
            if (days.get(i).equalsIgnoreCase(name)) {
                return days.get(i);
            }
        }
        return "Día no encontrado";
    }

    public boolean dayExists(String name) {
    for (int i = 0; i < days.size(); i++) {
        if (days.get(i).equalsIgnoreCase(name)) {
            return true;
        }
    }
    return false;
}

    public void sortDays() {
        Collections.sort(days, String.CASE_INSENSITIVE_ORDER);
    }

    public void clearDayList() {
        days.clear();
    }

}
