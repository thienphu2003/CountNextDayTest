import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class NextDayCalculatorTest {
    @Test

    void findNextDayOf112018()
    {
        String day ="1";
        String month = "1";
        String year = "2018" ;
        String expected = "2/1/2018";
        String result = NextDayCalculator.countNextDay(day,month,year);
        assertEquals(expected,result);

    }
    @Test
    void findNextDayOf3112018()
    {
        String day ="31";
        String month ="1";
        String year ="2018";
        String expected = "1/2/2018";
        String result =NextDayCalculator.countNextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    void findNextDayOf3042018()
    {
        String day ="30";
        String month ="4";
        String year ="2018";
        String expected = "1/5/2018";
        String result =NextDayCalculator.countNextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    void findNextDayOf2822018()
    {
        String day ="28";
        String month ="2";
        String year ="2018";
        String expected = "1/3/2018";
        String result =NextDayCalculator.countNextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    void findNextDayOf2922020()
    {
        String day ="29";
        String month ="2";
        String year ="2020";
        String expected = "1/3/2020";
        String result =NextDayCalculator.countNextDay(day,month,year);
        assertEquals(expected,result);
    }
    @Test
    void findNextDayOf31122018()
    {
        String day ="31";
        String month ="12";
        String year ="2018";
        String expected = "1/1/2019";
        String result =NextDayCalculator.countNextDay(day,month,year);
        assertEquals(expected,result);
    }




}
