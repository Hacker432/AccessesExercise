package it.unibas.accesses.model;

import java.util.Comparator;

public class AccessComparator {

    static boolean isImpossibleAccess(ImpossibleAccess ia1, ImpossibleAccess ia2) {
        return (!(ia1.getCity().equalsIgnoreCase(ia2.getCity())) &&
                 (ia1.getID().equalsIgnoreCase(ia2.getID())) &&
                 (ia1.getHour() == ia2.getHour()) &&
                 ((Math.abs(ia1.getMinutes() - ia2.getMinutes())) < 10));
    }

    static class SortByID implements Comparator<ImpossibleAccess> {
        public int compare(ImpossibleAccess ia1, ImpossibleAccess ia2) {
            if (ia1.getID().equalsIgnoreCase(ia2.getID())) {
                return (ia1.getCity().compareTo(ia2.getCity()));
            }
            return (ia1.getID().compareTo(ia2.getID()));
        }
    }
}
