
public class HomeworMasiv {
    public static void main (String[] args){
        /*Создайте массив из всех чётных чисел от 2 до 20 и выведите элементы массива на экран сначала в строку,
        отделяя один элемент от другого пробелом, а затем в столбик (отделяя один элемент от другого началом новой строки).
        Перед созданием массива подумайте, какого он будет размера. 2 4 6 … 18 20 2 4 6 … 20*/
        int[] ch = new int[10];
        for(int i=0; i<=9; i++) {
            ch[i] = i*2;
        }
        for(int i = 0; i <= ch.length - 1; i++) {
            System.out.print(ch[i] + " ");
        }

    }
}
