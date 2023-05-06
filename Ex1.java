package Dz4;

import java.util.Arrays;
import java.util.Collections;

public class Ex1 
{
    public static void main(String[] args) 
    {
        MyArray arr = new MyArray();
        arr.Show();
        arr.Max();
        arr.Min();
        arr.Avg();
        arr.search(0);
    }     
}
class MyArray
{
        Integer arr[] = {1, 0, 5, 3};

        MyArray(){}

        public void Show()
        {
          for (Integer arr1 : arr) 
          {
            System.out.println(arr1);
        }
        }

        public void Max()
        {
        Arrays.sort(arr);
        System.out.println("Максимальный елемент массива: " + arr[3] + "\n");
        }

    public void Min()
    {
        Arrays.sort(arr);
        System.out.println("Минимальный елемент массива: " + arr[0] + "\n");
    } 
    public void Avg()
    {
        Arrays.sort(arr);
        float sr = (arr[0] + arr[1] + arr[2] + arr[3]) / 4;
        System.out.print("Среднее арифметическое: " + sr + "\n");
    }
    public void search(int s)
    {
        for(int i = 0;i < 4;i++)
        {
            if(s == arr[i])
            {
                System.out.print("Число найденно: " + arr[i] + "\n");
                break;
            }
            else if(i == 4)
            {
                System.out.print("Число не найденно: " + "\n");
                break;
            }
        }
    }
}