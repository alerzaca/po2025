import java.util.ArrayList;

public class Lotto {
    public static void main(String[] args) {
        // Check arguments and create a list of them
        ArrayList<Integer> bets = new ArrayList<>();
        if (args.length != 6) {
            System.out.println("Not enough or too many arguments.");
            return;
        }
        for (int i = 0; i < 6; i++) {
            int arg = Integer.parseInt(args[i]);
            if (arg < 1 || arg > 49) {
                System.out.println("Numbers must be between 1 and 49.");
                return;
            }
            if (bets.contains(arg)) {
                System.out.println("Numbers cannot repeat.");
                return;
            }
            bets.add(arg);
        }

        // Generate lotto winners
        Lotto lotto = new Lotto();
        ArrayList<Integer> winners = new ArrayList<>();

        // Compare winners with bets
        long startTime = System.currentTimeMillis();
        do {
            winners = lotto.Lotto();
            System.out.print("Generated numbers: ");
            System.out.println(winners);
            winners.retainAll(bets);
        } while (winners.size() != 6);
        long stopTime =  System.currentTimeMillis();

        // Print results
        System.out.print("Lotto: ");
        System.out.println(winners);
        System.out.print("\nGood bets number: ");
        System.out.print(bets.size());
        System.out.println("\nExecution time: " +  (stopTime - startTime));
    }

    public ArrayList<Integer> Lotto() {
        ArrayList<Integer> winners = new ArrayList<>();
        int randNum;
        while (winners.size() < 6) {
            randNum = (int) (Math.random() * 50) + 1;
            if (!winners.contains(randNum)) {
                winners.add(randNum);
            }
        }
        return winners;
    }
}