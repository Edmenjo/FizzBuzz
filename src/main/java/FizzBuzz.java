public class FizzBuzz {
    private int number;

    public FizzBuzz() {
    }

    public FizzBuzz(int i) {
        number = i;
    }

    public String fizzbuzz(int number) {
        if (number % 15 == 0)
            return "FizzBuzz";
        else if(number % 5 == 0){
            return "Buzz";
        } else{
            return number % 3 == 0 ? "Fizz" : Integer.toString(number);
        }

    }
}
