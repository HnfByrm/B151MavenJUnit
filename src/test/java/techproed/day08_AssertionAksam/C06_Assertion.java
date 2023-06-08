package techproed.day08_AssertionAksam;

import org.junit.Assert;
import org.junit.Test;

public class C06_Assertion {
    @Test
    public void test01() {

        Assert.assertEquals(2, 2);

        System.out.println("Test başarılı bir şekilde çalıştı");
    }

    @Test
    public void test02() {

        Assert.assertEquals(3, 3);

        System.out.println("Test başarılı bir şekilde çalıştı");
    }

    @Test
    public void test03() {

        Assert.assertNotEquals(5, 4);

        System.out.println("Test başarılı bir şekilde çalıştı");
    }

    @Test
    public void test04() {
        String actualName="Erol";
        String expectedName="erol";

        Assert.assertNotEquals(expectedName,actualName);

        System.out.println("Test başarılı çalıştı");
    }

    @Test
    public void test05() {

        int yas=50;

        int emekliikYas=65;
        Assert.assertTrue(emekliikYas>yas);

        System.out.println("Test başarılı çalıştı");
    }

    @Test
    public void test06() {

        int yas=50;

        int emekliikYas=65;
        Assert.assertFalse(emekliikYas<yas);

        System.out.println("Test başarılı çalıştı");
    }
}