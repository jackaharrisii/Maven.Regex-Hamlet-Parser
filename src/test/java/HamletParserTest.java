import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.regex.Pattern;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }

    @Test
    public void testChangeHamletToLeon() {
        // NOTE - THESE TESTS MAYBE SHOULD HAVE BEEN FAILING, BUT THE SOUT WORKED
        // WHY IS MY METHOD REGEX WORKING BUT MY ASSERT REGEX IS NOT BEHAVING AS EXPECTED?
        String theTragedyOfLeon = hamletParser.changeHamletToLeon(hamletText);
        Assert.assertFalse(theTragedyOfLeon.contains("Hamlet"));
        Assert.assertFalse(theTragedyOfLeon.contains("HAMLET"));
        System.out.println(theTragedyOfLeon);
    }

    @Test
    public void testChangeHoratioToTariq() {
        String theTragedyOfLeon = hamletParser.changeHotatioToTariq(hamletText);
        Assert.assertFalse(theTragedyOfLeon.contains("Horatio"));
        Assert.assertFalse(theTragedyOfLeon.contains("HORATIO"));
        System.out.println(theTragedyOfLeon);
    }

//    @Test
//    public void testFindHoratio() {
//
//    }
//
//    @Test
//    public void testFindHamlet() {
//    }
}