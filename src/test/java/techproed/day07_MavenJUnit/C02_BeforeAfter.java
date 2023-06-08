package techproed.day07_MavenJUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C02_BeforeAfter {


    /*
    Notasyonlara sahip methodlar olusturabilmek icin mouse+sag tik +generate(kisayol alt + insert) yaparak
after methodu icin teardown'u seceriz.
before methodu icin setup'i seceriz.
test methodu icin de test'i seceriz
*/

    @After
    public void tearDown()  {
        System.out.println("Her test metodundan sonra bir kez şalışır");
    }

    @Before
    public void setUp() {
        System.out.println("Her test metodundan önce bir kez çalışır");
    }

    @Test
    public void test1() {

        System.out.println("Test1 metodu çalıştı");
    }

    @Test
    public void test2() {

        System.out.println("test2 metodu çalıştı");
    }

    @Test
    public void test3() {
        System.out.println("test3 metodu oluştu");
    }

   // JUnit frameworkunde testlerimizi siralama yapabilmek icin ekstra bir notasyon yoktur.
  //  Eger belli bir siralamada calistirmak istersek method isimlerini alfabetik ve sayisal olarak belirtmemiz gerekir
}
