package homework;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;
@RunWith(JUnitParamsRunner.class)
public class Problem1ClassTest_chappa {

    @Test
    @FileParameters("/src/homework/Problem1TestCaseTable.csv")
    public void specialOrder(int tc, boolean deepDish, double ordAmt, int numPizzas, double discount, boolean specialOrderStatus, double expTotal) {
    	Problem1Class_chappa problem1Class = new Problem1Class_chappa();
        problem1Class.specialOrder(deepDish, ordAmt,numPizzas);
        Assert.assertEquals(expTotal, problem1Class.getTotal(), 2);
        Assert.assertEquals(specialOrderStatus,problem1Class.isSpecialOrderStatus());
    }
}