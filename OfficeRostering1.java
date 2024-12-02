import java.util.*;

public class OfficeRostering {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        List<List<Integer>> friendships = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            friendships.add(new ArrayList<>());
        }

        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            friendships.get(u).add(v);
            friendships.get(v).add(u);
        }

        int K = sc.nextInt();

        int[] currentStatus = new int[N];  
        Arrays.fill(currentStatus, 0);  

        int totalRosteringValue = 0;
        int day = 0;

        while (totalRosteringValue < K) {
            day++;
            int todaysRosteringValue = 0;
            int[] nextStatus = new int[N];

            for (int i = 0; i < N; i++) {
                int friendsWFO = 0;

                for (int friend : friendships.get(i)) {
                    if (currentStatus[friend] == 0) {
                        friendsWFO++;
                    }
                }

                if (currentStatus[i] == 0) { 
                    if (friendsWFO == 3) {
                        nextStatus[i] = 0; 
                    } else {
                        nextStatus[i] = 1; 
                    }
                } else { 
                    if (friendsWFO < 3) {
                        nextStatus[i] = 0; 
                    } else {
                        nextStatus[i] = 1;  
                    }
                }

                if (nextStatus[i] == 0) {
                    todaysRosteringValue++;
                }
            }

            totalRosteringValue += todaysRosteringValue;

            if (totalRosteringValue >= K) {
                System.out.print(day);
                return;
            }

            currentStatus = nextStatus;

            if (day > 100) {  
                System.out.print("Impossible");
                return;
            }
        }

        System.out.print("Impossible");
    }
}
