package testNG;

import org.testng.annotations.Test;

public class GroupTest {

    @Test(groups = {"S","R"})
    public void test01(){
        System.out.println("This is a smoke and regression test case");
    }

    @Test(groups = {"R"})
    public void test02(){
        System.out.println("This is a regression test case");
    }

    @Test
    public void test03(){
        System.out.println("This is not a smoke nor a regression test case");
    }

    @Test(groups = {"S"})
    public void test04(){
        System.out.println("This is a smoke test case");
    }

    @Test(groups = {"S","R"})
    public void test05(){
        System.out.println("This is a smoke and regression test case");
    }
}
