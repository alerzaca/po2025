public class Lotto {
    public static void main(String[] args) {
        Lotto loteria = new Lotto();
        loteria.Lotto_ver1();
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
        System.out.print("\n");
    }
    // Ver2 does not work for now :))
    public void Lotto_ver2() {
        ArrayList<Integer> lotto = new ArrayList<Integer>();
        int randNum;
        for (int i = 0; i < 6; i++) {
            randNum = (int) (Math.random() * 50);
            for (int j = 0; j < i; j++) {
                if (lotto.contains(randNum)) {
                    randNum = (int) (Math.random() * 50);
                    j = -1;
                }
            }
            lotto.add(randNum);
        }
        for (int num : lotto) {
            System.out.println(num);
        }
        System.out.print("\n");
    }
}