public class Main {


    // test 1
    // ------------------------------------------------------------------------------------------

    private int one;
    private int two;


    public Main setOne(int one) {
        this.one = one;
        return this;
    }

    public Main setTwo(int two) {
        this.two = two;
        return this;
    }


    public static void main(String[] args) {
        Main main = new Main();

        main
            .setOne(12)
            .setTwo(34);
    }

    // ------------------------------------------------------------------------------------------

}
