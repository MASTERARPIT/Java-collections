import java.util.*;

public class FormTheString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the number of substrings
        int N = sc.nextInt();
        sc.nextLine(); // Consume newline

        // List to hold the substrings and their associated costs
        List<String> substrings = new ArrayList<>();
        List<Integer> costs = new ArrayList<>();

        // Read the substrings and their costs
        for (int i = 0; i < N; i++) {
            String substring = sc.next();
            int cost = sc.nextInt();
            substrings.add(substring);
            costs.add(cost);
        }

        // Read the main string
        String mainString = sc.next();

        // Initialize dp array with infinity (we'll use a large number for infinity)
        int INF = Integer.MAX_VALUE;
        int[] dp = new int[mainString.length() + 1];
        Arrays.fill(dp, INF);
        dp[0] = 0; // No cost to form an empty string

        // Perform DP to compute minimum cost to form the main string
        for (int i = 0; i < mainString.length(); i++) {
            // Skip if the current dp[i] is INF, meaning this state is not reachable
            if (dp[i] == INF) continue;

            // Try each substring and see if it can be used from position i
            for (int j = 0; j < N; j++) {
                String substring = substrings.get(j);
                int cost = costs.get(j);

                // Check if substring can match at position i
                if (i + substring.length() <= mainString.length() &&
                    mainString.substring(i, i + substring.length()).equals(substring)) {
                    
                    // Update dp[i + substring.length()] with the minimum cost
                    dp[i + substring.length()] = Math.min(dp[i + substring.length()], dp[i] + cost);
                }
            }
        }

        // The answer is the minimum cost to form the full main string
        int result = dp[mainString.length()];
        if (result == INF) {
            System.out.print("Impossible");
        } else {
            System.out.print(result);
        }
    }
}
