package com.blogpost.helloglassfishmaven;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Gary A. Stafford
 */
public class NameStorageBeanTest {

    private final NameStorageBean nameStorageBean = new NameStorageBean();

    public NameStorageBeanTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getName method, of class NameStorageBean.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testGetName() throws Exception {
        System.out.println("getName");
        String result = nameStorageBean.getName();
        assertNotNull(result);
    }

    /**
     * Test of setName method, of class NameStorageBean.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testSetName() throws Exception {
        System.out.println("setName");
        String expResult = "Test";
        nameStorageBean.setName(expResult);
        String result = nameStorageBean.getName();
        assertEquals(expResult, result);
    }
}
