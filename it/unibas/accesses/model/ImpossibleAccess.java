package it.unibas.accesses.model;

public class ImpossibleAccess {
    private String city;
    private String userID;
    private int hour;
    private int minutes;

    public ImpossibleAccess(Access access, String city) {
        this.city = city;
        this.userID = access.getID();
        this.hour = access.getHour();
        this.minutes = access.getMinutes();
    }

    public String getCity() { return this.city; }
    public String getID() { return this.userID; }
    public int getHour() { return this.hour; }
    public int getMinutes() { return this.minutes; }

    public String toHashString() {
        return (this.city + " " + this.userID);
    }

    public int hashCode() {
        return toHashString().hashCode();
    }

    public boolean equals(Object o) {
        ImpossibleAccess otherAccess = (ImpossibleAccess) o;
        return (this.city.equalsIgnoreCase(otherAccess.getCity()) &&
                this.userID.equalsIgnoreCase(otherAccess.getID()));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("City: " + this.city);
        sb.append(" | User ID: " + this.userID);
        sb.append(" | Time: " + this.hour + ":" + this.minutes);
        return sb.toString();
    }
}
