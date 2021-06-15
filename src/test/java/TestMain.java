import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMain {
    @Test
    void testMain() {
        // заполняем высокосные года (заранее известные)
        int[] leapYear = {1952, 1956, 1960, 1964, 1968, 1972, 1976, 1980, 1984, 1988, 1992, 1996, 2000};
        //не высокосные, но круглые
        int[] notLeapYear = {1700, 1800, 1900, 2100, 2200, 2300};
        //рандомные не высокосные
        int[] notLeapYear2 = {1981, 1982, 1983, 2001, 2002};

        //передаем значения
        testYear("This year 366 days", leapYear);
        testYear("This year 365 days", notLeapYear);
        testYear("This year 365 days", notLeapYear2);
    }

    //выносим в отдельный метод проверку
    @Test
    public static void testYear(String expected, int[] result) {
        for (int i : result) {
            Assertions.assertEquals(expected, Main.result(i));
        }
    }
}
