package cz.czechitas.ukol4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Třída pro losování Sportky.
 */
public class Sportka {
    private final List<Integer> osudi = new ArrayList<>();

    public Sportka() {
        for (int i = 1; i <= 49; i++) {
            osudi.add(i);
        }
    }

    /**
     * Zamíchá osudí.
     *
     * @see Collections#shuffle(List)
     */
    public void zamichej() {
        Collections.shuffle(osudi);
    }

    /**
     * Vrátí seznam s 6 vylosovanými čísly.
     *
     * @return Seznam vylosovaných čísel.
     * @see List#subList(int, int)
     */

    public List<Integer> dejVylosovanaCisla() {
        List<Integer> vylosovanaCisla = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            vylosovanaCisla.add(osudi.get(i));
        }
        return vylosovanaCisla;
    }

    /**
     * Vrátí sedmé vylosované číslo (dodatkové číslo)
     *
     * @return Dodatkové číslo.
     */

    public Integer dejDodatkoveCislo() {
        return osudi.get(6);
    }
}