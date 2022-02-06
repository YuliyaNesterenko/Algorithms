public class MaxMinMean {
    //Написать алгоритм, который принимает массив чисел
    // int[] и возвращает массив,
    // который содержит максимальное число,
    // минимальное число
    // и среднее.
    //Test Data:
    //{1, 2, 3, 4, 5} -> {5, 1, 3}
    //{-3, 0, 155, -39, 1003} -> {1003, -39, 223}
    public int[] getMaxMinMean(int[] input) {

        int[] result = new int[3];
        result[0] = Integer.MIN_VALUE;
        result[1] = Integer.MAX_VALUE;
        result[2] = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] > result[0]) {
                result[0] = input[i];
            }
            if (input[i] < result[1]) {
                result[1] = input[i];
            }
            result[2] = result[2] + input[i];
        }
        result[2] = result[2] / input.length;

        return result;
    }

}

