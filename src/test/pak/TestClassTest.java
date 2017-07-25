package pak;

import org.junit.Test;

import static org.junit.Assert.*;

public class TestClassTest
{
    @Test
    public void sum() throws Exception
    {
        TestClass t = new TestClass();
        assertEquals(10, t.sum(2,8));
    }

}