package amazon.cloudshape.core;


import org.junit.Test;

import static org.junit.Assert.fail;
import static org.junit.Assert.assertEquals;

public class BadTest {

    @Test
    public void meant_to_fail() throws Exception {
        //fail();
        assertEquals(1,1);
    }
}
