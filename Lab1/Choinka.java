class Choinka {
    public static void main(String[] args) {
        int height = Integer.parseInt(args[0]);
        int n;
        String star = "*";
        String space = " ";
        for (int i = 0; i < height; i++) {
	    n = height -i -1;
            System.out.print(space.repeat(n));
       	    System.out.print(star.repeat(2*i+1));
            System.out.print("\n");
        }
    }
}