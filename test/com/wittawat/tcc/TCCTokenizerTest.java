package com.wittawat.tcc;

import java.util.Arrays;
import java.util.Vector;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Wittawat Jitkrittum
 */
public class TCCTokenizerTest {

    public TCCTokenizerTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of setDelimiter method, of class TCCTokenizer.
     */
    @Test
    public void testSetDelimiter() {

        System.out.println("setDelimiter");
        String delimiter = "|";
        TCCTokenizer instance = new TCCTokenizer("ทดสอบ");
        instance.setDelimiter(delimiter);

        assertTrue(instance.tokenizeOrNull().contains("|"));

        TCCTokenizer t2 = new TCCTokenizer("ทดสอบอีก");
        t2.setDelimiter("$");
        assertTrue(t2.tokenizeOrNull().contains("$"));

        assertFalse(t2.tokenizeOrNull().contains("|"));
    }

    /**
     * Test of getEndIndexesOrNull method, of class TCCTokenizer.
     */
    @Test
    public void testGetEndIndexesOrNull() {
        System.out.println("getEndIndexesOrNull");

        TCCTokenizer instance = new TCCTokenizer("เพราะว่ากด");
        Vector<Integer> result = instance.getEndIndexesOrNull();
        Vector<Integer> expResult = new Vector<Integer>(Arrays.asList(new Integer[]{5, 8, 9, 10}));
        assertEquals(expResult, result);


        TCCTokenizer t2 = new TCCTokenizer("อีกการทดสอบ");
        result = t2.getEndIndexesOrNull();
        expResult = new Vector<Integer>(Arrays.asList(new Integer[]{2, 3, 5, 6, 7, 8, 9, 10, 11}));
        assertEquals(expResult, result);

        
        TCCTokenizer t3 = new TCCTokenizer("");
        result = t3.getEndIndexesOrNull();
        expResult = new Vector<Integer>();
        assertEquals(expResult, result);

        TCCTokenizer t4 = new TCCTokenizer("บรรทัด\r\nใหม่\nอีก");
        result = t4.getEndIndexesOrNull();
        expResult = new Vector<Integer>(Arrays.asList(new Integer[]{1,2,3,6,10,12,15,16}));
        assertEquals(expResult, result);
    }

    /**
     * Test of tokenizeOrNull method, of class TCCTokenizer.
     */
    @Test
    public void testTokenizeOrNull() {
        System.out.println("tokenizeOrNull");
        TCCTokenizer t1 = new TCCTokenizer("นี่คืออะไร");
        t1.setDelimiter("|");
        String expResult = "นี่|คือ|อะ|ไร|";
        String result = t1.tokenizeOrNull();
        assertEquals(expResult, result);

        TCCTokenizer t2 = new TCCTokenizer("");
        t2.setDelimiter("|");
        expResult = "";
        result = t2.tokenizeOrNull();
        assertEquals(expResult, result);

        TCCTokenizer t3 = new TCCTokenizer("ขึ้น\r\nบรรทัด\nนะ");
        t3.setDelimiter("|");
        expResult = "ขึ้|น|\r\nบ|ร|ร|ทัด|\nนะ|";
        result = t3.tokenizeOrNull();
        assertEquals(expResult, result);

    }


}
