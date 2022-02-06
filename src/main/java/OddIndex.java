public class OddIndex {
    //    Написать алгоритм, который принимает массив чисел,  и возвращает массив значений нечетных индексов
//Test Data:
//Input = {-45, 590, 234, 985, 12, 68}
//Expected Result =  {590, 985, 68}
    public int[] getOddIndex(int[] numbers) {

        int[] oddIndex = new int[numbers.length / 2];
        int j = 0;

        for (int i = 1; i < numbers.length; i = i + 2) {
            oddIndex[j] = numbers[i];
            j++;
        }
        return oddIndex;
    }
}
