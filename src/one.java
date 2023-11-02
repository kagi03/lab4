import java.util.Random;

public class one {
    public static void main(String[] args)
    {
        int table[] = new int[10];
        Random num = new Random();
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < table.length;i++)
        {
           table[i]= num.nextInt(100);

            if (table[i]< smallest){
                smallest = table[i];
            } else if (table[i]> largest) {
                largest = table[i];

            }

           }
        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
        }

    }

