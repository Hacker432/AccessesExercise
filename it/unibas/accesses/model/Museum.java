package it.unibas.accesses.model;

import java.util.*;

public class Museum {
    private String name;
    private String city;
    private List<Access> accessList = new ArrayList<Access>();

    public Museum(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public void addAccess(Access access) {
        accessList.add(access);
    }

    public String getCity() { return this.city; }
    public List<Access> getAccessList() { return this.accessList; }
}
