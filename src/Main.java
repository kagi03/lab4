public class Main
{
    public static void main(String[] args)
    {
        int myarrray[] = new int [10];
        for(int i = 0; i < myarrray.length; i++)
        {
            myarrray[i] = myarrray.length-9-i;
            for (int number: myarrray)
            {
                System.out.println("array["+number+"]=" + myarray[number]);
            }
        }
    }
}
