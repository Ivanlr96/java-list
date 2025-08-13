package dev.ivan;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JavaListTest {

    private JavaList javaList;

    @BeforeEach
    public void setUp() {
        javaList = new JavaList();
        javaList.dayListCreation();
    }

    @Test
    public void testCreateDayList() {
        List<String> days = javaList.getDays();

        assertThat(days.size(), is(equalTo(7)));

        assertThat(days, contains(
                "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"
        ));
    }

    @Test
    public void testGetDays() {
        List<String> days = javaList.getDays();

        assertThat(days, hasSize(7));
        assertThat(days, contains(
                "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"
        ));
        assertThat(days, is(not(empty())));
    }

    @Test
    public void testPrintSize() {
        int size = javaList.printSize();
        assertThat(size, is(equalTo(7)));
    }

    @Test
    public void testDeleteDay() {
        javaList.deleteDay("Lunes");

        List<String> days = javaList.getDays();

        assertThat(days, not(hasItem("Lunes")));
        assertThat(days.size(), is(equalTo(6)));
        assertThat(days, contains(
                "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"
        ));
    }

    @Test
    public void testGetDayByName() {
        assertThat(javaList.getDayByName("Lunes"), is(equalTo("Lunes")));
        assertThat(javaList.getDayByName("martes"), is(equalTo("Martes")));
        assertThat(javaList.getDayByName("Mortes"), is(equalTo("Día no encontrado")));
    }

    @Test
    public void testDayExists() {
        assertThat(javaList.dayExists("Lunes"), is(true));
        assertThat(javaList.dayExists("martes"), is(true));
        assertThat(javaList.dayExists("Esmalte"), is(false));
    }

    @Test
    public void testSortDays() {
        javaList.sortDays();
        List<String> days = javaList.getDays();

        List<String> expected = Arrays.asList(
                "Domingo", "Jueves", "Lunes", "Martes", "Miércoles", "Sábado", "Viernes"
        );

        assertThat(days, contains(expected.toArray()));
    }

    @Test
    public void testClearDayList() {
        javaList.clearDayList();

        assertThat(javaList.getDays(), is(empty()));
        assertThat(javaList.getDays().size(), is(0));
    }
}



