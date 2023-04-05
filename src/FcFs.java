import java.util.Scanner;

public class FcFs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, i, ct = 0, tat, wt, total_tat = 0, total_wt = 0;

        System.out.print("Enter the number of processes: ");
        n = sc.nextInt();

        for(i = 1; i <= n; i++) {
            int at, bt;
            System.out.print("Enter arrival time for process " + i + ": ");
            at = sc.nextInt();
            System.out.print("Enter burst time for process " + i + ": ");
            bt = sc.nextInt();

            ct += bt;
            tat = ct - at;
            wt = tat - bt;

            total_tat += tat;
            total_wt += wt;
        }

        System.out.println("Average Turnaround Time: " + (float)total_tat/n);
        System.out.println("Average Waiting Time: " + (float)total_wt/n);

        sc.close();
    }
}
