package it.unibas.accesses.test;

import it.unibas.accesses.model.*;
import it.unibas.accesses.persistence.*;
import java.util.*;
import junit.framework.*;

public class TestArchive extends TestCase {
    private Archive archive;

    public void setUp() {
        archive = new Archive();
        DAOMock.load(archive);
    }

    public void testImpossibleAccess() {
        Set<ImpossibleAccess> impSet = archive.extractIAccesses();
        assertTrue(impSet.size() == 4);
    }
}
