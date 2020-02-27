package sort;

/**
 * @author khotyan.y <br />
 * Copyright 2020 Ifuture Plc. All rights reserved.
 * <p>
 * TODO: add description
 */
public class Sort
{

    public static void main(String[] args)
    {
        Sort sort = new Sort();
        int[] array = {2, 5, 7, 3, 1, 4, 1, 0, 3, 4, 5, 6, 2, 1};

        System.out.println("Bubble sort");
        sort.print(sortBubbleType(array));

        System.out.println("Insertion sort");
        sort.print(sortInsertion(array));
    }

    public static int[] sortBubbleType(int[] array)
    {
        int temp = 0;

        for (int i = 0; i < array.length; i++)
        {
            for (int j = array.length - 1; j >= i + 1; j--)
            {
                if (array[j] < array[j - 1])
                {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] sortInsertion(int[] array)
    {
        int key = 0;
        int i = 0;

        for (int j = 1; j < array.length; j++)
        {
            key = array[j];
            i = j - 1;
            while (i >= 0 && array[i] > key)
            {
                array[i + 1] = array[i];
                i = i - 1;
                array[i + 1] = key;
            }
        }
        return array;
    }

    private void print(int[] array)
    {
        for (int value : array)
        {
            System.out.print(value + ", ");
        }
    }

}
