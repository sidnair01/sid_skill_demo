import static org.junit.Assert.*;

import org.junit.*;


public class myjavafiletest {

    @Test
    public void testPrintFirstChar(){
        assertEquals("e",myjavafile.PrintFirstChar("egg"));
        assertEquals("s",myjavafile.PrintFirstChar("shoe"));
    }

    @Test
    public void testPrintLastChar(){
        assertEquals("g",myjavafile.PrintLastChar("egg"));
        assertEquals("e",myjavafile.PrintLastChar("shoe"));
    }
    
}
