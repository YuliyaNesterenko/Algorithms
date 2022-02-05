public class AscendingSequence {
    //    Написать алгоритм AscendingSequence, который строит возрастающую последовательность чисел от a до b с шагом n.
//Test Data:
//a =  10
//b =  25
//n =  5
//Expected result = {10, 15, 20, 25}
//a =  10
//b =  -25
//n =  -5
//Expected result = {-1}
        public int[] getAscendingSequence(int a, int b, int n) {
            int[] numbers = new int[(b - a) / n + 1];
            int newNumber = a;
            for (int i = a - a; i < (b - a) / n + 1; i++) {
                numbers[i] = newNumber;
                newNumber = newNumber + n;
            }
            return numbers;
        }
    }

