import org.junit.jupiter.api.*;

public class JUnitExample {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Here is beforeAll()");
    }
    @BeforeEach
    void beforeEach() {
        System.out.println("Here is beforeEach()");
    }
    @AfterAll
    static void AfterAll() {
        System.out.println("Here is AfterAll()");
    }
    @AfterEach
    void AfterEach() {
        System.out.println("Here is AfterEach()");
    }

    @Test
    void firstTest() {
        System.out.println("Here is first Test()");
    }

    @Test
    void secondTest() {
        System.out.println("Here is second Test()");
    }
}
