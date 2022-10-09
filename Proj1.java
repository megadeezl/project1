/**
 * 5 assignments
 * Lab 8
 * Eric Robinson
 * (V1.0 10/9/22)
 * */
import java.util.Scanner;
import java.util.Arrays;
public class Proj1
{
    public static void main(String args[])
    {
        P1();
        P2();
        P3();
        P4();
    }
   
    static void P1()
    {
        Scanner in = new Scanner(System.in);
        int seconds;
       
        System.out.println("Enter number of seconds");
        seconds = in.nextInt();
       
        int days = seconds/84600;
        int remainDays = seconds % 84600;
        int hours = remainDays / 3600;
        int remainHours = remainDays%3600;
        int minutes = remainHours/60;
        int secondsCalculated = remainHours%60;
       
        //System.out.println
        //("The time entered in hours minutes and seconds is");
        //System.out.println(hours+" hours");
        //System.out.println(minutes+ " minutes");
        //System.out.println(secondsCalculated+ " seconds");
       
        if (seconds >= 84600){
            System.out.println
            (seconds+ " seconds equals to " + days + " days " + hours +
            " hours " + minutes + " minutes " + secondsCalculated +
            " seconds");
        }
        else if(seconds >= 3600 && seconds <84600){
            System.out.println(seconds+ " seconds equals to " + hours +
            " hours " + minutes + " minutes " + secondsCalculated +
            " seconds");
        }
        else if(seconds >= 60 && seconds < 3600){
            System.out.println(seconds+" seconds equals "+minutes+" minutes "
            +secondsCalculated+" seconds");
        }
        else if(seconds < 60){
            System.out.println(seconds +" seconds is equal to seconds");
        }    
       
    }
   
    static void P2()
    {
        Scanner in = new Scanner(System.in);
        int size;
       
        System.out.println
        ("How many variables would you like to convert to celcius");
        size=in.nextInt();
        Double [] degreeArray = new Double [size];
        System.out.println("Enter the elements of the array:");
       
        for(int i=0; i<size; i++){
            degreeArray[i]=in.nextDouble();
            System.out.println(degreeArray[i]+" degrees farenheight");
        }
                       
        Double [] degreeArray2 = new Double [size]; //creates identical array but will be converted to celsius in the loop
       
        for(int i=0; i<size; i++)
        {
            Double celsius = (degreeArray[i] - 32)/1.8;
            degreeArray2[i]=celsius;
            System.out.println
            (degreeArray[i]+
            " degrees farenheight is "+celsius+" degrees celsius");
        }
       
        System.out.println("The sum is "+Sum(degreeArray)+" fahrenheit");
        System.out.println("The sum is "+Sum(degreeArray2)+" celsius");
       
        System.out.println("The sum of the array in celsius is "
        +Sum(degreeArray2));
        System.out.println
        ("The sum of the array in fahrenheit is "+Sum(degreeArray));
       
        System.out.println
        ("The average of the array in fahrenheit is "+Average(degreeArray));
        System.out.println
        ("The average of the array in celsius is "+Average(degreeArray2));
       
        System.out.println
        ("The variance of the array in fahrenheit is "+Variance(degreeArray));
        System.out.println
        ("The variance of the array in celsius is "+Variance(degreeArray2));
       
         System.out.println
        ("The standard deviation of the array in fahrenheit is "
        +StandardDeviation(degreeArray));
        System.out.println
        ("The standard deviation of the array in celsius is "
        +StandardDeviation(degreeArray2));
               
        System.out.println("The median in fahrenheit is "
        +Median(degreeArray,size));
        System.out.println("The median in celsius is "
        +Median(degreeArray2,size));
       
       
    }
    static Double Sum(Double i[])
    {
        Double sum=0.0;
       
        for(int j=0; j<i.length; j++)
        {
            sum+=i[j];
        }
       
        return sum;        
       
    }
    static Double Average(Double i[])
    {
        Double average=0.0;
        Double sum=0.0;
        for(int j=0; j<i.length; j++)
        {
            sum+=i[j];
            average = sum/i.length;
        }
       
        return average;
    }
    static Double Variance(Double i[])
    {
        Double variance=0.0;
        Double mean=Average(i);
        Double sum=0.0;
        for(int j=0; j<i.length; j++)
        {
            variance=(i[j]-mean);
            variance=variance*variance;
            sum+=variance;
        }
        return sum/i.length;
    }
    static Double StandardDeviation(Double i[])
    {
        Double StandardDeviation=0.0;
       
        return Math.sqrt(Variance(i));
    }
    static Double Median(Double i[], int n)
    {
        double m=0;
        Arrays.sort(i);

        if(n%2==1)
        {
        m=i[((n+1)/2)-1];
        }
        else
        {
        m=(i[n/2-1]+i[n/2])/2;
        }
           
        return m;
    }
    static void P3()
    {
        Scanner in = new Scanner(System.in);
        int size;
       
        System.out.println
        ("How many variables would you like to convert to celcius");
        size=in.nextInt();
        Double [] degreeArray = new Double [size];
        System.out.println("Enter the elements of the array:");
       
        for(int i=0; i<size; i++){
            degreeArray[i]=in.nextDouble();
            System.out.println(degreeArray[i]+" degrees farenheight");
        }
                       
        Double [] degreeArray2 = new Double [size]; //creates identical array but will be converted to celsius in the loop
       
        for(int i=0; i<size; i++)
        {
            Double celsius = (degreeArray[i] - 32)/1.8;
            degreeArray2[i]=celsius;
            System.out.println
            (degreeArray[i]+
            " degrees farenheight is "+celsius+" degrees celsius");
        }
       
        System.out.printf("The sum is: %.2f", Sum(degreeArray));
        System.out.print(" fahrenheit");
        System.out.println();
        System.out.printf("The sum is: %.2f", Sum(degreeArray2));
        System.out.print(" celsius");
        System.out.println();
       
        System.out.printf("The average is: %.2f", Average(degreeArray));
        System.out.print(" fahrenheit");
        System.out.println();
        System.out.printf("The average is: %.2f", Average(degreeArray2));
        System.out.print(" celsius");
        System.out.println();
       
        System.out.printf("The variance is: %.2f", Variance(degreeArray));
        System.out.print(" fahrenheit");
        System.out.println();
        System.out.printf("The varience is: %.2f", Variance(degreeArray2));
        System.out.print(" celsius");
        System.out.println();
       
        System.out.printf("The standard deviation is: %.2f", StandardDeviation(degreeArray));
        System.out.print(" fahrenheit");
        System.out.println();
        System.out.printf("The standard deviation is: %.2f", StandardDeviation(degreeArray2));
        System.out.print(" celsius");
        System.out.println();
       
        System.out.printf("The median is: %.2f", Median(degreeArray,size));
        System.out.print(" fahrenheit");
        System.out.println();
        System.out.printf("The median is: %.2f", Median(degreeArray2,size));
        System.out.print(" celsius");
        System.out.println();
       
    }
    static void P4()
    {
        Scanner in = new Scanner(System.in);  
        char [][] board = {{'.', '.', '.', '.', '.'},
                           {'.', '.', '*', '.', '.'},
                           {'.', '*', '*', '*', '.'},
                           {'.', '.', '*', '.', '.'},
                           {'.', '.', '.', '.', '.'}};
        System.out.println("Enter the number of generations:");
        int nGens = in.nextInt();
        PrintBoard(board);
        for (int i = 0; i < nGens; i++) {
            Iterate(board);
            PrintBoard(board);   
        }
    }
    /**
     * Method to Iterate to next generation
     * 
     */
    static void Iterate(char[][] board)
    {
        // Need to create a copy of the matrix board
        // Then need two loops simuluar to loops in Grid.jav
        // visit each i,j cell and check number of neighbors
        // Then follow the rules to place a '*' or '.' in cell i,j
        // After all iterations copy the temporary board back to the original board
        char copy[][] = board;
    }
    /**
     * Method to display Life game board
     * 
     */
    static void PrintBoard(char [][] board)
    {
        // Example avialble on canvas called Grid.java
    }
    
    static int FindNeighbors(char [][] A, int i, int j)
    {
        int neighbors = 0;
                                                  // i - 1
                                                  // i + 1
                                                  // j - 1
                                                  // j + 1;
        
        int rows = A.length;                      // get number of rows
        int cols = A[0].length;                   // get number of columns
                                                  // if i == 0 set i-1 to last row
                                                  // if i == rows-1, set i+1 to 

        
        //System.out.println(iMOne + " " + iPOne + " " + jMOne + " " + jPOne);
  
        // See lect8 slide 35 to simplfy the below computations
        
        // Check top 3 neighbors
        
        
        // Check middle 2 neighbors
        
        
        // Check bottom 3 neighbors
        
        return neighbors;
    }
   
}