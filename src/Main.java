//Задача по массиву: Дан одномерный массив из 50 элементов. Массив заполнен числами от -50 до 50.
// Найти количество отрицательных элементов, количество положительных элементов, количество нулей.
// Найти сумму всех положительных элементов и отрицательных элементов отдельно.
// Найти среднее по массиву. Массив можно заполнить случайными числами без использования ручного ввода,
// подумайте + погуглите, как это сделать.

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[50];
        Random rd = new Random();

        System.out.printf("Сгенерированный массив: \n");

        for (int i=0; i<50; i++){
         arr[i]= rd.nextInt(101)-50;
            System.out.println(arr[i]);}

        int posc = 0;
        int negc = 0;
        int zeroc = 0;

        int possum = 0;
        int negsum = 0;

        for (int i=0;i<50;i++)
        { if (arr[i] < 0)
            { negc ++;
              negsum += arr[i];}
            else if (arr[i]>0)
            { posc ++;
                possum += arr [i];}
            else
                zeroc ++;}

        double av = ( possum + negsum)/50;

        System.out.println("Кол-во положительных элементов: " + posc);
        System.out.println("Кол-во отрицательных элементов: " + negc);
        System.out.println("Кол-во нулеых элементов: " + zeroc);
        System.out.println("Сумма положительных элементов: " + possum);
        System.out.println("Сумма отрицательных элементов: " + negsum);
        System.out.println("Среднее по массиву: " + av);

        }
}