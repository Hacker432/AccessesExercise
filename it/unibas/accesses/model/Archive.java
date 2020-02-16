package it.unibas.accesses.model;

import java.util.*;
import org.slf4j.*;

public class Archive {
    private static Logger logger = LoggerFactory.getLogger(Archive.class);
    private List<Museum> museumList = new ArrayList<Museum>();

    public void addMuseum(Museum museum) {
        museumList.add(museum);
    }

    private List<ImpossibleAccess> genImpAccessList() {
        List<ImpossibleAccess> impList = new ArrayList<ImpossibleAccess>();
        for (Museum museum : museumList) {
            String city = museum.getCity();
            List<Access> list = museum.getAccessList();
            for (Access access : list) {
                ImpossibleAccess ia = new ImpossibleAccess(access, city);
                impList.add(ia);
            }
        }
        Collections.sort(impList, new AccessComparator.SortByID());
        if (logger.isDebugEnabled()) {
            logger.debug("Sorted list by ID:");
            for (ImpossibleAccess ia : impList) {
                logger.debug(ia.toString());
            }
        }
        return impList;
    }

    public Set<ImpossibleAccess> extractIAccesses() {
        List<ImpossibleAccess> impList = genImpAccessList();
        Set<ImpossibleAccess> impSet = new HashSet<ImpossibleAccess>();
        for (int i = 0; i < impList.size() - 1; i++) {
            ImpossibleAccess ia1 = impList.get(i);
            ImpossibleAccess ia2 = impList.get(i+1);
            if (AccessComparator.isImpossibleAccess(ia1, ia2)) {
                impSet.add(ia1);
                impSet.add(ia2);
            }
        }
        if (logger.isDebugEnabled()) {
            logger.debug("Impossible accesses:");
            for (ImpossibleAccess ia : impSet) {
                logger.debug(ia.toString());
            }
        }
        return impSet;
    }

}
