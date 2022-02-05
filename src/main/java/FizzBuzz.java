import java.util.Arrays;

public class FizzBuzz {
        //Написать алгоритм FizzBuzzWoof и тесты к нему
        ////FizzBuzzWoof
        //
        ////Print integers 1 to N, 1 < N < 100
        //// but print:
        //// “Fizz” if an integer is divisible by 3
        //// “Fizz” if an integer contains 3,
        //// “Buzz” if an integer is divisible by 5
        //// “Buzz” if an integer contains 5,
        //// “Woof” if an integer is divisible by 7
        //// “Woof” if an integer contains 7
        //
        ////Fizz Buzz Woof: одна вариация расширилась до такой степени,
        ////что получила собственное имя.
        ////В этом случае число 3 становится Fizz,
        ////5 становится Buzz,
        ////а 7 становится Woof.
        ////Основные правила в этой игре: любое число,
        ////которое содержит число или делится на это число, заменяется вхождением слова.
        ////Если число имеет 2 экземпляра этого числа (т. Е. 33 или 55) и делится на это число,
        ////то слово произносится в этом примере три раза.
        public String[] fizzBuzz(int startNumber, int endNumber) {
            String[] numbers = new String[endNumber - startNumber + 1];
            int newNumber = startNumber;
            for (int i = startNumber - startNumber; i < (endNumber - startNumber + 1); i++) {
                if (newNumber % 15 == 0) {
                    numbers[i] = "FizzBuzz";
                }
                if (newNumber % 3 == 0) {
                    numbers[i] = "Fizz";
                } else if (newNumber % 5 == 0) {
                    numbers[i] = "Buzz";
                } else {
                    numbers[i] = String.valueOf(newNumber);
                }
                newNumber += 1;
            }
            System.out.println(Arrays.toString(numbers));
            return numbers;
        }
    }

