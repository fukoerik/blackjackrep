/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author zomon95
 */
public class blackTest {
    
    public blackTest() {
    }
  
   
    black instance = new black("SZöveg");
    @Test
    public void testGetNév() {
        assertEquals("SZöveg", instance.getNév());
    }

}
