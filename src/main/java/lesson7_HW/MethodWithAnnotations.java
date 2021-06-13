package lesson7_HW;

public class MethodWithAnnotations {
    @BeforeSuite
    public static void beforeSuite() {
        System.out.println("Before Suite");
    }

    @Test(priority = 1)
    public static void method1() {
        System.out.println("method1");
    }

    @Test(priority = 1)
    public static void method2() {
        System.out.println("method2");
    }

    @Test(priority = 1)
    public static void method3() {
        System.out.println("method3");
    }

    @Test(priority = 2)
    public static void method4() {
        System.out.println("method4");
    }

    @Test(priority = 3)
    public static void method5() {
        System.out.println("method5");
    }

    @Test(priority = 4)
    public static void method6() {
        System.out.println("method6");
    }

    @AfterSuite
    public static void afterSuite() {
        System.out.println("afterSuite");
    }

}
