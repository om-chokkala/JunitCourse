package org.testing;

import org.junit.*;

import javax.xml.transform.stream.StreamSource;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.Assert.*;


public class StringHelperTest {
    StringHelper stringHelper = new StringHelper();

    // @Before
    @BeforeClass
    public static void printStartOfClass(){
        System.out.println("Starting of helper class");
    }

    @Before
    public void printBeforeEveryTest(){
        System.out.println(" Stating of the test");
    }

    /* assertEquals()*/
    @Test
    public void testTruncateAInFirst2Positions_AinFirst2Positions(){
        assertEquals("ab",stringHelper.truncateAInFirst2Positions("AAab"));
    }
    @Test
    public void testTruncateAInFirst2Positions_AinFirst2Positions_inputLengthIs2(){
        assertEquals("", stringHelper.truncateAInFirst2Positions("AA"));
    }

    @Test
    public void testTruncateAInFirst2Positions_withoutA(){
        assertEquals("CDEF",stringHelper.truncateAInFirst2Positions("CDEF"));
    }
    @Test
    public void testTruncateAInFirst2Positions_AinLast2Positions(){
        assertEquals("CDAA",stringHelper.truncateAInFirst2Positions("CDAA"));
    }
    /* assertTrue() or AssertFalse()*/

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_negativeScenario(){
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ABZX"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_positiveScenario(){
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_when2InputLength(){
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("AB"));
    }
    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_when1InputLength(){
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("B"));
    }

    // @After
    @After
    public void printAfterEveryTest(){
        System.out.println("End of the test");
    }

    @AfterClass
    public static void printAfterClass(){
        System.out.println("Print end of helper class");
    }

    // Testing Arrays
    int[] actualNumbers = {1,90,65,23};
    int[] expectedResult = {1,23,65,90};
    @Test
    public void testingArrays(){
        assertArrayEquals(expectedResult,stringHelper.numberSort(actualNumbers));
    }

    // Testing Exceptions
    int[] inputArrayForException = null;
    @Test(expected = NullPointerException.class)
    public void testingNullInput(){
        Arrays.sort(inputArrayForException);
    }





}
