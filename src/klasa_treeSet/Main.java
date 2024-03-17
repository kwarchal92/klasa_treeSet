package klasa_treeSet;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args)
    {
        //tworzenie zbioru zbior1

        java.util.Set<Integer> zbior1 = new java.util.TreeSet<>();

        zbior1.add(10);
        zbior1.add(15);
        zbior1.add(2);
        zbior1.add(634);

        System.out.println("Liczba elementow w zbiorze " + zbior1.size() + ".");

        zbior1.remove(2); //usuniecie liczby 2 ze zbioru
        System.out.println("Liczba elementow w zbiorze po usunieciu liczby 2: " + zbior1.size() + ".");

        zbior1.clear(); //usuniecie wszystkich elementow ze zbioru
        System.out.println("Usuniecie wszystkich elementow ze zbioru");

        System.out.println("Ostateczna liczba elementow w zbiorze " + zbior1.size() + ".");

    }
}
