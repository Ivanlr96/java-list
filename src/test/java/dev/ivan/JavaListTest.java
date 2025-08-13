package dev.ivan;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContaining;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

import java.util.Arrays;
import java.util.List;

import java.io.PrintStream;

import org.junit.jupiter.api.Test;

public class JavaListTest {

@Test
public void testCreateDayList() {
    JavaList javaList = new JavaList();
    

    javaList.dayListCreation();
    
    List<String> days = javaList.getDays();

    assertThat(days.size(), is(equalTo(7)));

    assertThat(days, contains(
            "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"
    ));
}

    @Test
    public void testGetDays() {
        JavaList javaList = new JavaList();
        javaList.dayListCreation(); 

        List<String> days = javaList.getDays();

        assertThat(days, hasSize(7));


        assertThat(days, contains(
                "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"
        ));

    
        assertThat(days, is(not(empty())));
    }

    
    @Test
    public void testPrintSize() {
        JavaList javaList = new JavaList();
        javaList.dayListCreation(); 

        int size = javaList.printSize();

        assertThat(size, is(equalTo(7)));
    }

     @Test
    public void testDeleteDay() {
        JavaList javaList = new JavaList();
        javaList.dayListCreation(); 


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
        JavaList javaList = new JavaList();
        javaList.dayListCreation();

        String dayFound = javaList.getDayByName("Lunes");
        assertThat(dayFound, is(equalTo("Lunes")));


        String dayFoundIgnoreCase = javaList.getDayByName("martes");
        assertThat(dayFoundIgnoreCase, is(equalTo("Martes")));


        String dayNotFound = javaList.getDayByName("Mortes");
        assertThat(dayNotFound, is(equalTo("Día no encontrado")));
    }

    
    @Test
    public void testDayExists() {
        JavaList javaList = new JavaList();
        javaList.dayListCreation(); 


        boolean existsMonday = javaList.dayExists("Lunes");
        assertThat(existsMonday, is(true));

 
        boolean existsTuesday = javaList.dayExists("martes");
        assertThat(existsTuesday, is(true));

       
        boolean existsHoliday = javaList.dayExists("Esmalte");
        assertThat(existsHoliday, is(false));
    }

      @Test
    public void testSortDays() {
        JavaList javaList = new JavaList();
        javaList.dayListCreation(); 

        javaList.sortDays(); 

        List<String> days = javaList.getDays();

   
        List<String> expected = Arrays.asList(
                "Domingo", "Jueves", "Lunes", "Martes", "Miércoles", "Sábado", "Viernes"
        );


        assertThat(days, contains(expected.toArray()));
    }

       @Test
    public void testClearDayList() {
        JavaList javaList = new JavaList();
        javaList.dayListCreation(); 

    
        javaList.clearDayList();

    
        assertThat(javaList.getDays(), is(empty()));
        assertThat(javaList.getDays().size(), is(0)); 
    }
}




