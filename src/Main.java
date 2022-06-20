import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter integer n between 1 and 20; ");

        int n = scan.nextInt();

        int [] intArray = new int [n];

        for(int i = 0; i < intArray.length; i++)

        {
            intArray[i]= (int) Math.pow(2,i);

                System.out.println(intArray[i]);

        }

        }

    }

