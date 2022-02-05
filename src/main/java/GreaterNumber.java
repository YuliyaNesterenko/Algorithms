public class GreaterNumber {
    //Напишите метод, который из двух параметров типа
    // int возвращает бОльшее значение.
    //Test Data:
    //3333, 9999
    //Expected Result = 9999
    public int getGreaterNumber(int one, int two) {
        if (one > two) {
            return one;
        } else {
            return two;
        }
    }
}

