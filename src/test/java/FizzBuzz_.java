
import org.junit.Assert;
import org.junit.Test;

public class FizzBuzz_ {
    public FizzBuzz_() {
    }

    @Test
    public void given_1_should_return_1(){
        Assert.assertEquals("1", new FizzBuzz().fizzbuzz(1));
    }

    @Test
    public void given_3_should_return_fizz() {
        Assert.assertEquals("Fizz", new FizzBuzz().fizzbuzz(3));
    }

    @Test
    public void given_5_should_return_buzz() {
        Assert.assertEquals("Buzz", new FizzBuzz().fizzbuzz(5));
    }

    @Test
    public void given_15_should_return_FizzBuzz() {
        Assert.assertEquals("FizzBuzz", new FizzBuzz().fizzbuzz(15));
    }
}
