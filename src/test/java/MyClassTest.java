import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyClassTest {
    @Test
    public void plusNumberTest() {
        myClass mt = new myClass();
        int atualResult = mt.plusNumber(2, 2);
        int expectedResult = 4;
        Assertions.assertEquals(expectedResult, atualResult);
    }

    @Test
    public void plusNumberTestThreeInt() {
        myClass mtc = new myClass();
        int actualResult = mtc.plusNumber(2, 2, 2);
        int expectedResult = 6;
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void summElemTest(){
        int[] array = new int[] {10, 20, 30, 40};
        int acrualResult = myClass.summElem(array);
        int expectedResult = 100;
        Assertions.assertEquals(expectedResult, acrualResult);
    }

    @Test
    public void stackArrayTest(){
        int[] arr1 = new int[]{10, 20, 30, 40};
        int[] arr2 = new int[]{50, 60, 70, 80};
        int[] expectedResult = new int[] {10, 20, 30, 40, 50, 60, 70, 80};
        int[] actualResualt = myClass.mergeTwoArrays(arr1, arr2);
        Assertions.assertArrayEquals(expectedResult, actualResualt);
    }
}
