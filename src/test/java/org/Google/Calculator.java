package org.Google;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.hamcrest.MatcherAssert.assertThat;


class BootDemoAppApplicationTests {
    private Calculator c = new Calculator();

    @Test
    void contextLoads() {

    }

    @Test
    @Disabled
    void testSum() {
        //expected
        int expectedResult = 17;
        //actual
        int actualResult = c.doSum(12, 3, 2);
        assertThat(actualResult).isEqualTo(expectedResult);
    }

    private Object assertThat(Boolean actualResult) {
    }

    @Test
    void testProduct() {
        //expected
        int expectedResult = 6;
        //actual
        int actualResult = c.doProduct(3, 2);
        assertThat(actualResult).isEqualTo(expectedResult);

    }

    @Test
    void testCompareNums(){
        //actual result
        Boolean actualResult = c.compareTwoNums(3, 3);
        assertThat(actualResult).isTrue();



    }


}
