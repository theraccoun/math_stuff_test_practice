/**
 * Created with IntelliJ IDEA.
 * User: theraccoun
 * Date: 4/18/13
 * Time: 9:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class MathStuffTest {
    @org.junit.Test
    public void testSquare() throws Exception
    {

        int param;
        int expected;

        param = 2;
        expected = 4;
        assert MathStuff.square(param) == expected;

        param = 8;
        expected = 64;
        assert MathStuff.square(param) == expected;

    }
}
