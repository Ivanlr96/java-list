package dev.ivan;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContaining;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import java.util.List;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.Test;



public class JavaListTest {

@Test
 public void testCreateDayList() {
    JavaList javaList = new JavaList();
    List<String> days = javaList.dayListCreation();
    assertThat(days.size(), is(equalTo(7)));
    assertThat(days, contains(
        "Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"
    ));
 }
    
@Test
    void testPrintDays() {

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        JavaList javaList = new JavaList();
        javaList.printDays();

        System.setOut(System.out);

        String[] outputLines = outContent.toString().trim().split("\\R");

        assertThat(outputLines, arrayContaining(
                "Lunes",
                "Martes",
                "Miércoles",
                "Jueves",
                "Viernes",
                "Sábado",
                "Domingo"
        ));
    }
}
