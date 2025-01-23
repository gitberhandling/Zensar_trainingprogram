import java.util.*;

public class tickets {
    Scanner scan = new Scanner(System.in);
    int[][] arr = new int[5][5];

    void book() {
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                System.out.println("Enter the seat status for seat (" + i + "," + j + ") (0 for available, 1 for booked): ");
                arr[i][j] = scan.nextInt();
            }
        }
    }

    void AvailableSeats() {
        System.out.println("Available Seats:");
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5; j++) {
                if(arr[i][j] == 0) {
                    System.out.print("[" + i + "," + j + "] ");
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        tickets obj1 = new tickets();
        obj1.book();
        obj1.AvailableSeats();
    }
}
// create a class vehicle and write a default as well as parameterized constructor