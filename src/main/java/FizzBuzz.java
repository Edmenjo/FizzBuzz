public class FizzBuzz {
    private int number;

    public FizzBuzz() {
    }

    public FizzBuzz(int i) {
        number = i;
    }

    public String fizzbuzz(int number) {
        if (number % 3 == 0)
            return "Fizz";
        return Integer.toString(number);
    }
}
