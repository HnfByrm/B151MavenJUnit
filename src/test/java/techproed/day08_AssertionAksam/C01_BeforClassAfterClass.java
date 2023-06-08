package techproed.day08_AssertionAksam;

import org.junit.*;

public class C01_BeforClassAfterClass {

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Her Classtan önce Befo Class Methodu bir kez çalışır");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("Her Classtan sonra After Clas Methodu bir kez çalışır");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Her methoddan önce Before metodu bir kez çalışır");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Her methoddan sonra After Metodu bir kez çalışır");
    }

    @Test
    public void test01() {
        System.out.println("Test01 metodu çalıştı");
    }

    @Test
    public void test02() {
        System.out.println("Test02 metodu çalıştı");
    }

    @Test
    public void test03() {
        System.out.println("Test03 metodu çalıştı");
    }
}
