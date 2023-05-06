package Dz4;

import java.util.Arrays;
import java.util.Collections;

public class Ex2 
{
    public static void main(String[] args) 
    {
        MyMat arr = new MyMat();
        arr.Show();
        arr.Avg();
        arr.Max();
        arr.Min();
    }    
}
class MyMat
{
    int[][] arr = new int[][] {{7, 2, 4}, {1, 9, 0}};
    int ar2[] = new int[] {0,0,0,0,0,0};

    MyMat()
    {
        for (int i = 0; i < arr.length; i++){
            for(int j=0; j < arr[i].length; j++)
            {
                     ar2[i]  = arr[i][j];
                System.out.printf("%d ", arr[i][j]);
            }
            System.out.println();
        }
            
    }

        public void Show()
        {
            
            for (int i = 0; i < arr.length; i++){
                for(int j=0; j < arr[i].length; j++)
                {
                         
                    System.out.printf("%d ", arr[i][j]);
                }
                System.out.println();
            }
        }
        public void Avg()
        {          
            float sr = (arr[0][0] + arr[0][1] + arr[0][2] + arr[1][0] + arr[1][1] + arr[1][2]) / 6;
            System.out.print("Среднее арифметическое: " + sr + "\n");
        }
        public void Max()
        {
        
        Arrays.sort(ar2);
        System.out.println("Максимальный елемент массива: " + ar2[5] + "\n");
        }

    public void Min()
    {
        Arrays.sort(ar2);
        System.out.println("Минимальный елемент массива: " + ar2[0] + "\n");
    } 
}