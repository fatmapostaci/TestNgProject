package ondia.tests;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class C07Groups {
    //TestNG'de @BeforeGroups ve dependsOnGroups özellikleri,
    // belirli bir grup testlerin çalışmadan önce başka bir grup testin
    // tamamlanmasına bağımlılığını sağlar.

    @BeforeGroups(groups = "A")//A grubu öncesinde bir kez çalışır.
    public void beforeGroupsA(){
        System.out.println("Before Group A");
    }
    @BeforeGroups(groups = "B")//B grubu öncesinde bir kez çalışır.
    public void beforeGroupsB(){
        System.out.println("Before Group B");
    }

    @AfterGroups(groups = "A")//A grubu sonrası bir kez çalışır.
    public void afterGroups(){
        System.out.println("After Group A");
    }

    @Test(dependsOnGroups = "B")
    public void dependsOnGroupTest(){
        System.out.println("dependsOnGroup B");
    }

    @Test(dependsOnGroups = "A")//Before ve After group da dahil olmak üzere tüm Group A işlemleri sonrası çalışır.
    public void dependsOnGroupATest(){
        System.out.println("dependsOnGroup A");
    }

    @Test(groups = "B")
    public void test01() {
        System.out.println("Test 01 B");
    }

    @Test(groups = "B")
    public void test02() {
        System.out.println("Test 02 B");
        //assert false; A grubundaki herhangi bir hata bu gruba bağlı testin çalışmasını engeller.
    }

    @Test(groups = "A", priority = -1)
    public void test03() {
        System.out.println("Test 03 A");
    }

    @Test
    public void test04() {
        System.out.println("Test 04");
    }

    @Test(groups = "A")
    public void test05() {
        System.out.println("Test 05 A");
    }

    @Test(groups = "B")
    public void test06() {
        System.out.println("Test 06 B");
    }

    @Test(groups = "C")
    public void test05C() {
        System.out.println("Test 05 C");
    }

    @Test(groups = "C")
    public void test06C() {
        System.out.println("Test 06 C");
    }

}
