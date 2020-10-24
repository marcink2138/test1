public class Zadanie1 {
    public static void main(String[] args) {
        int zakres = 10;
        if (args.length > 0)
            if (Integer.parseInt(args[0]) > 0)
                zakres = Integer.parseInt(args[0]);

        for (int i = 1; i < zakres; i++) {
            int m = 0;
            for (int k = 2; k < i; k++) {
                if (i % k == 0) {
                    m = 1;
                    break;
                }
            }
            if (m == 0) {
                System.out.print(i);
                System.out.print("\n");
            }
        }
    }
}