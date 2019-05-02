package homework;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class Problem4ClassTest_HW5_FileParameterized {

    @Test
    @FileParameters("src/homework/Problem2_HW5.csv")
    public void calcTotal(int tc, boolean existingMember, boolean validDiscount, 
    		int sMemberPoints, double total, double expTotal) {
        Problem4Class_HW4 problem4Class = new Problem4Class_HW4();
        Problem4ServerData mockObj = EasyMock.createStrictMock(Problem4ServerData.class);
        EasyMock.expect(mockObj.getMemberPoints()).andReturn(sMemberPoints);
        EasyMock.replay(mockObj);
        assertEquals(expTotal, problem4Class.calcTotal(total, existingMember, validDiscount, mockObj),2);
    }
}