package dev.ivan;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import java.util.List;

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
    
}
