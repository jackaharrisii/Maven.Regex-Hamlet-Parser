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
        hamletParser.changeHamletToLeon(hamletText);
        Assert.assertFalse(Pattern.matches(".*Hamlet.*", hamletText));
        Assert.assertFalse(Pattern.matches(".*HAMLET.*", hamletText));
        System.out.println(hamletText);
    }

    @Test
    public void testChangeHoratioToTariq() {
    }

    @Test
    public void testFindHoratio() {

    }

    @Test
    public void testFindHamlet() {
    }
}