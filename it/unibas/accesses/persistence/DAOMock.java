package it.unibas.accesses.persistence;

import it.unibas.accesses.model.*;

public class DAOMock {

    public static void load(Archive archive) {
        // Museum 1
        Museum m1 = new Museum("M1", "CityM1");
        m1.addAccess(new Access("ID1", "Name1", "Surname1", "M", 16, 30, 14.90));
        m1.addAccess(new Access("ID2", "Name2", "Surname2", "F", 14, 0, 10));
        m1.addAccess(new Access("ID3", "Name3", "Surname3", "F", 16, 30, 14.90));

        // Museum 2
        Museum m2 = new Museum("M2", "CityM2");
        m2.addAccess(new Access("ID4", "Name4", "Surname4", "M", 8, 40, 10));
        m2.addAccess((new Access("ID2", "Name2", "Surname2", "F", 14, 5, 12.90)));

        // Museum 3
        Museum m3 = new Museum("M3", "CityM3");
        m3.addAccess(new Access("ID4", "Name4", "Surname4", "M", 8, 32, 10));

        archive.addMuseum(m1);
        archive.addMuseum(m2);
        archive.addMuseum(m3);
    }
}
