/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller09;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CltControl
 */
public class EmployeeTest {
    
    public EmployeeTest() {
    }
    /**
     * Test of cs method, of class Employee.
     */
    @Test
    public void testCsSobreporciento() {
        System.out.println("cs");
        Employee instance = new Employee(30.5F,"USD",200F,EmployeeType.Manager);
        float expResult = 0.0F;
        float result = instance.cs();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of CalculateYearBonus method, of class Employee.
     */
    @Test
    public void testCalculateYearBonusSobreporciento() {
        System.out.println("CalculateYearBonus");
        Employee instance = new Employee(30.5F,"USD",200F,EmployeeType.Manager);
        float expResult = 0.0F;
        float result = instance.CalculateYearBonus();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
