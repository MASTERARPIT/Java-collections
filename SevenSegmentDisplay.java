import java.util.*;

public class SevenSegmentDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] digitConfig = new String[10];
        for (int i = 0; i < 3; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < 10; j++) {
                if (digitConfig[j] == null) {
                    digitConfig[j] = "";
                }
                digitConfig[j] += line.substring(j * 3, j * 3 + 3);
            }
        }

        String[] faultyConfig = new String[50];
        int digitCount = 0;
        for (int i = 0; i < 3; i++) {
            String line = scanner.nextLine();
            for (int j = 0; j < line.length() / 3; j++) {
                if (faultyConfig[j] == null) {
                    faultyConfig[j] = "";
                }
                faultyConfig[j] += line.substring(j * 3, j * 3 + 3);
            }
            digitCount = line.length() / 3;
        }

        Map<String, Integer> digitMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            digitMap.put(digitConfig[i], i);
        }

        List<List<Integer>> allNumbers = new ArrayList<>();
        for (int i = 0; i < digitCount; i++) {
            String faultyDigit = faultyConfig[i];
            List<Integer> possibleDigits = new ArrayList<>();

            if (digitMap.containsKey(faultyDigit)) {
                possibleDigits.add(digitMap.get(faultyDigit));
            }

            for (int pos = 0; pos < 9; pos++) { // 9 positions in a 3x3 matrix
                char[] toggled = faultyDigit.toCharArray();
                toggled[pos] = (toggled[pos] == '1') ? '0' : '1'; // Toggle the LED
                String toggledDigit = new String(toggled);

                if (digitMap.containsKey(toggledDigit)) {
                    possibleDigits.add(digitMap.get(toggledDigit));
                }
            }

            if (possibleDigits.isEmpty()) {
                System.out.print("Invalid");
                return;
            }

            allNumbers.add(possibleDigits);
        }

        long totalSum = calculateSum(allNumbers, 0, 0);
        System.out.print(totalSum);
    }

    private static long calculateSum(List<List<Integer>> allNumbers, int index, long currentNumber) {
        if (index == allNumbers.size()) {
            return currentNumber;
        }

        long sum = 0;
        for (int digit : allNumbers.get(index)) {
            sum += calculateSum(allNumbers, index + 1, currentNumber * 10 + digit);
        }
        return sum;
    }
}
