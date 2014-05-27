package sample;

import junit.framework.Assert;
import org.junit.Test;


public class OperationTests {
    public static Addition prepare(){
        return new Addition();
    }

    @Test
    public void testAddition(){
        Addition op = prepare();

        Assert.assertEquals();
        Integer result = op.apply(2,2);
    }
}
