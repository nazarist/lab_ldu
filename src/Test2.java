public class Test2 {
    public void test(String param1, int param2) {
        System.out.println("Перший варіант: " + param1 + ", " + param2);
    }

    public void test(String param1, int param2, double param3) {
        System.out.println("Другий варіант: " + param1 + ", " + param2 + ", " + param3);
    }

    public void test(int param1, String param2, boolean param3) {
        System.out.println("Третій варіант: " + param1 + ", " + param2 + ", " + param3);
    }

    public static void main(String[] args) {
        Test2 test2 = new Test2();

        test2.test("Параметр 1", 42);
        test2.test("Параметр 1", 42, 3.14);
        test2.test(10, "Параметр 2", true);
    }
}
