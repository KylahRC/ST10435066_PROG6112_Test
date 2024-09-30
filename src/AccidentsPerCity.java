import java.util.Scanner;

public class AccidentsPerCity
{
    public static void main(String[] args)
    {
//     arrays declared
        int[][] numAccidents = new int[3][3];
        String[] cityNames = {"Cape Town", "Johannesburg", "Port Elizabeth"};

        Scanner scanner = new Scanner(System.in);

//        inputs
        System.out.print("Enter the number of car accidents for Cape Town: ");
        numAccidents[0][0] = scanner.nextInt();
        scanner.nextLine();


        System.out.print("Enter the number of motor bike accidents for Cape Town: ");
        numAccidents[1][0] = scanner.nextInt();
        scanner.nextLine();


        System.out.print("Enter the number of car accidents for Johannesburg: ");
        numAccidents[0][1] = scanner.nextInt();
        scanner.nextLine();


        System.out.print("Enter the number of motor bike accidents for Johannesburg: ");
        numAccidents[1][1] = scanner.nextInt();
        scanner.nextLine();


        System.out.print("Enter the number of car accidents for Port Elizabeth: ");
        numAccidents[0][2] = scanner.nextInt();
        scanner.nextLine();


        System.out.print("Enter the number of motor bike accidents for Port Elizabeth: ");
        numAccidents[1][2] = scanner.nextInt();
        scanner.nextLine();


//Header banner
        System.out.println("--------------------------------------------------------------");
        System.out.println("ROAD ACCIDENT REPORT");
        System.out.println("--------------------------------------------------------------");
        System.out.printf("%-15s %-15s %-15s%n", "", "CAR", "MOTOR BIKE");

//        loop to print accidents
        for (int i = 0; i < numAccidents.length; i++)
        {
            System.out.printf("%-15s %-15s %-15s%n", cityNames[i], numAccidents[0][i], numAccidents[1][i]);
        }

//        total header
        System.out.println("--------------------------------------------------------------");
        System.out.println("ROAD ACCIDENT TOTALS FOR EACH CITY");
        System.out.println("--------------------------------------------------------------");

//        loop to print totals
        int[] totals = {(numAccidents[0][0] + numAccidents[1][0]), (numAccidents[0][1] + numAccidents[1][1]),
                (numAccidents[0][2] + numAccidents[1][2])};

        for (int i = 0; i < numAccidents.length; i++)
        {
            System.out.printf("%-15s %-15s%n", cityNames[i], totals[i]);
        }
    }
}