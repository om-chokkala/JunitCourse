package org.testing;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

    @Test
    public void test(){
        StringHelper stringHelper = new StringHelper();
        Assert.assertEquals("ab",stringHelper.truncateAInFirst2Positions("AAab"));
    }

}
