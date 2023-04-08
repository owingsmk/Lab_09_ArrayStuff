import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // create random object
        Random ran = new Random();

        // a.) declares an int array of dataPoints.
        int[] dataPoints = new int[100];

        // b.) loop that initialize each element of array dataPoints to random value between 1 to 100.
        for (int i = 0; i < dataPoints.length; i++)
            dataPoints[i] = ran.nextInt(100) + 1;

        // c.) loop that displays dataPoint values
        for (int i = 0; i < dataPoints.length; i++)
            System.out.print(dataPoints[i] + " | ");

        final int COUNT = 100;

        Random r = new Random();
        for(int  i = 0 ; i < COUNT; i++){
            //populate int between 1 and 100
            dataPoints[i] = 1+r.nextInt(100);
        }
        //print numbers seperating with pipe
        for(int i= 0; i < COUNT; i++){
            int currentDataPoint = dataPoints[i];
            System.out.print(currentDataPoint);
            if(i < COUNT-1)
                System.out.print("|");
        }

        int sum = 0;
        //do sum
        for(int  i = 0 ; i < COUNT; i++){
            sum = sum + dataPoints[i];
        }
        //do average
        double avg = (float)sum/COUNT;
        //print sum and average
        System.out.println("\nThe SUM of the random array dataPoints is: "+sum);
        System.out.println("The AVERAGE of the random array dataPoints is: "+avg);

        Scanner sc = new Scanner(System.in);
        int input = -1;

        //get input between 1 and 100
        do{
            System.out.println("Input an int value from 1 to 100:");
            input =  sc.nextInt();
            if(input >= 1 || input <=100){
                break;
            }
            System.out.println("The input is not valid.Try aagin!");
        }while(true);
        //find total match of input in dataPoints
        int matchCount = 0;
        for(int i : dataPoints){
            if(i==input)
                matchCount++;
        }
        //print
        System.out.println("INPUT "+input+" is found "+matchCount+" times in the dataPoints array.");

        input = -1;

        //get input int
        do{
            System.out.println("Input another int value from 1 to 100:");
            input =  sc.nextInt();
            if(input >= 1 || input <=100){
                break;
            }
            System.out.println("The input is not valid.Try aagin!");
        }while(true);
        //find firt matching index in dataPoints
        int firstMatchingIndex = -1;
        for(int i = 0; i < COUNT; i++){
            if(dataPoints[i]==input){
                firstMatchingIndex = i;
                break;
            }
        }
        if(firstMatchingIndex == -1){
            System.out.println("The value "+input+" was NOT FOUND  at dataPoints array.");
        }else{
            System.out.println("The value "+input+" was found at array index "+firstMatchingIndex);
        }
        int min = dataPoints[0];
        int max = dataPoints[0];
        //fins minimum and maximum
        for(int i = 1; i < COUNT; i++){
            int currentData= dataPoints[i];
            if(currentData > max)
                max = currentData;
            if(currentData < min)
                min = currentData;
        }
        System.out.println("Minimum Value in the dataPoints = "+min);
        System.out.println("Maximum Value in the dataPoints = "+max);

        //define double array
        double[] dataPointsDouble = {5.75,25.55,57.65,112.04,225.08,7.68};
        //call getAverage
        System.out.println("Average of dataPoints (double) is: "+getAverage(dataPointsDouble));
    }

    public static double getAverage(double[] values){
        double sum = 0;
        double avg = 0;
        if(values!=null && values.length!=0){
            for(double d: values){
                sum = sum + d;
            }
            avg = sum/values.length;
        }
        return avg;
    }
}
