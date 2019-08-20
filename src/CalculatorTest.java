import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private int[] a = {5, 15, 20, 25, 35, 89};
    private int[] b = {10, 1, -1, 25, 5, 9};
    private int[][] expectedResult = {{15, 16, 19, 50, 40, 98},
                              {-5, 14, 21, 0, 30, 80},
                              {50, 15, -20, 625, 175, 801},
                              {0, 15, -20, 1, 7, 9}};

    @org.junit.jupiter.api.Test
    void sum() {
        for (int i = 0; i < a.length; i++) {
            int result = a[i] + b[i];
            assertEquals(expectedResult[0][i], result);
        }
    }

    @org.junit.jupiter.api.Test
    void minus() {
        for (int i = 0; i < a.length; i++) {
            int result = a[i] - b[i];
            assertEquals(expectedResult[1][i], result);
        }
    }

    @org.junit.jupiter.api.Test
    void multi() {
        for (int i = 0; i < a.length; i++) {
            int result = a[i] * b[i];
            assertEquals(expectedResult[2][i], result);
        }
    }

    @org.junit.jupiter.api.Test
    void divide() {
        for (int i = 0; i < a.length; i++) {
            int result = a[i] / b[i];
            assertEquals(expectedResult[3][i], result);
        }
    }
}