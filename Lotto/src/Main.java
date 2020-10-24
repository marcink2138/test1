import java.util.ArrayList;
import java.util.Random;

class Lotto {
    Random r = new Random();
    ArrayList<Integer> z = new ArrayList<>();

    Lotto() {
        while (z.size() != 6) {
            int m = r.nextInt(49);
            if (!z.contains(m) && m != 0)
                z.add(m);
        }
    }

    void print() {
        for (Integer integer : z) System.out.println(integer);
    }

    void nowy() {
        this.z.clear();
        while (this.z.size() != 6) {
            int m = r.nextInt(49);
            if (!this.z.contains(m) && m != 0)
                this.z.add(m);
        }
    }

    void your_types(String[] args) {
        if (args.length == 6) {
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < 6; i++)
                a.add(Integer.parseInt(args[i]));
            ArrayList<Integer> a_ = new ArrayList<>();
            for (Integer value : z) {
                if (a.contains(value))
                    a_.add(value);
            }
            if (a_.size() > 0) {
                System.out.println("Liczba trafien: " + a_.size());
                for (Integer integer : a_) {
                    System.out.print(" " + integer);
                }
            } else
                System.out.println("Same pudla ;//");
        } else
            System.out.println("ERROR");
    }

    void your_types_loop(String[] args) {
        if (args.length == 6) {
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < 6; i++)
                a.add(Integer.parseInt(args[i]));
            int m = 0;
            int p = 0;
            long start = System.currentTimeMillis();
            for (int j = 0; m != 1; j++) {
                if (a.contains(z.get(0)) && a.contains(z.get(1)) && a.contains(z.get(2)) && a.contains(z.get(3)) && a.contains(z.get(4)) && a.contains(z.get(5))) {
                    System.out.println("Trafienie w probie nr: " + j);
                    m++;
                    p = j;
                } else {
                    nowy();
                }
            }
            long end = System.currentTimeMillis();
            System.out.println("Czas: " + (end - start));
            System.out.println("Proba nr: " + p);
            System.out.println("Czas w sec: " + ((end - start) * 0.001));
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Lotto l = new Lotto();
        l.print();
        l.your_types(args);
        l.your_types_loop(args);
    }
}
