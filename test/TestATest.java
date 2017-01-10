/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Set;
import mx.grisdip.TestA;
import static mx.grisdip.TestA.getConsecutiveNumbers;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Griss
 */
public class TestATest {
    @Test
    public void testPalindromes() {
        Set<String> result = TestA.getConsecutiveNumbers(8,"ANNA BAKES 80 CAKES 647 IN THE NOON, 989216011 CI,VIC level");
        assertEquals("[NOON, 80, CIVIC, LEVEL, 64, 9892160, ANNA]", result.toString());
    }
}
