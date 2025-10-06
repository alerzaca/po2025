import java.util.ArrayList;

public class Lotto {
    public static void main(String[] args) {
        Lotto loteria = new Lotto();
        System.out.print("Version 1 of lotto: ");
        loteria.Lotto_ver1();
        System.out.print("Version 2 of lotto: ");
        loteria.Lotto_ver2();
    }
    public void Lotto_ver1() {
        int[] lotto = new int[6];
        int randNum;
        for (int i = 0; i < 6; i++) {
            randNum = (int) (Math.random() * 50);
            for (int j = 0; j < i; j++) {
                if (lotto[j] == randNum) {
                    randNum = (int) (Math.random() * 50);
                    j = -1;
                }
            }
            lotto[i] = randNum;
        }
        for (int i = 0; i < 6; i++) {
            System.out.print(lotto[i] + " ");
        }
        System.out.println();
    }
    public void Lotto_ver2() {
        ArrayList<Integer> lotto = new ArrayList<>();
        int randNum;
        while (lotto.size() < 6) {
            randNum = (int) (Math.random() * 50);
            if (!lotto.contains(randNum)) {
                lotto.add(randNum);
            }
        }
        for (int num : lotto) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}