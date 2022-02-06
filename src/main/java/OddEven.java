public class OddEven {

    public String getOddEven(int number) {
        if (Math.abs(number) % 2 == 0) {
            return "Even";
        } else if (Math.abs(number) % 2 == 1) {
            return "Odd";

        } else {
            return "Undefined";
        }
    }
}
