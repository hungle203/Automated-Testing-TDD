import modol.NexDayCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NexDayCalculatorTest {

    @Test
    @DisplayName("TestCase")
    void tesCase() {
        int day = 1;
        int month = 1;
        int year = 2018;

        String expect = "2/1/2018";
        assertEquals(expect, NexDayCalculator.findNexDay(day, month, year));
    }
    @Test
    @DisplayName("TestCase1")
    void tesCase1() {
        int day = 31;
        int month = 1;
        int year = 2018;

        String expect = "1/2/2018";
        assertEquals(expect, NexDayCalculator.findNexDay(day, month, year));
    }
    @Test
    @DisplayName("TestCase2")
    void tesCase2() {
        int day = 30;
        int month = 4;
        int year = 2018;

        String expect = "1/5/2018";
        assertEquals(expect, NexDayCalculator.findNexDay(day, month, year));
    }
    @Test
    @DisplayName("TestCase3")
    void tesCase3() {
        int day = 28;
        int month = 2;
        int year = 2018;

        String expect = "1/3/2018";
        assertEquals(expect, NexDayCalculator.findNexDay(day, month, year));
    }
    @Test
    @DisplayName("TestCase4")
    void tesCase4() {
        int day = 29;
        int month = 2;
        int year = 2020;

        String expect = "1/3/2020";
        assertEquals(expect, NexDayCalculator.findNexDay(day, month, year));
    }
    @Test
    @DisplayName("TestCase5")
    void tesCase5() {
        int day = 31;
        int month = 12;
        int year = 2018;

        String expect = "1/1/2019";
        assertEquals(expect, NexDayCalculator.findNexDay(day, month, year));
    }

}