package day2;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by 최은주 on 2017-01-03.
 */
public class AlgebraTest {
    @Test public void  subtractTest() {
        Algebra algebra = new Algebra();
        assertThat("3-1=2", algebra.subtract(3, 1), is(equalTo(2)));
    }
}
