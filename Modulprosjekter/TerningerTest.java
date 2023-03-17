

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class TerningerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class TerningerTest
{
    /**
     * Default constructor for test class TerningerTest
     */
    public TerningerTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void testKast()
    {
        Terninger terninge1 = new Terninger(5);
        assertNotNull(terninge1.terningKast());
    }
}

