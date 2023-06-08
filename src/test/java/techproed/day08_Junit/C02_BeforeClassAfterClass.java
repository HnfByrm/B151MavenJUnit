package techproed.day08_Junit;

import org.junit.*;

public class C02_BeforeClassAfterClass {

/*
@BeforeClass class'da en once calısan methoddur.
@AfterClass class'da en son calısan methoddur.

@BeforeClass ve @AfterClass methodları sadece static methodlar ile calısır.
 */

    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Classta en önce çalışan methottur.Bir kez çalışır ");
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("Classta en son çalışan metottur bir kez çalışır");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Her test metodundan önce çalışır");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Her test metodundan sonra çalışır");
    }

    @Test
    public void test01() {
        System.out.println("Ilk test");
    }

    @Test
    public void test02() {
        System.out.println("ikinci test");
    }
}
