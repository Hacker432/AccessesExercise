package it.unibas.accesses.model;

public class Access {
    private String userID;
    private String name;
    private String sname;
    private String gender;
    private int hour;
    private int minutes;
    private double ticketCost;

    public Access(String userID, String name, String sname, String gender, int hour, int minutes, double ticketCost) {
        this.userID = userID;
        this.name = name;
        this.sname = sname;
        this.gender = gender;
        this.hour = hour;
        this.minutes = minutes;
        this.ticketCost = ticketCost;
    }

    public String getID() { return this.userID; }
    public String getName() { return this.name; }
    public String getSname() { return this.sname; }
    public String getGender() { return this.gender; }
    public int getHour() { return this.hour; }
    public int getMinutes() { return this.minutes; }
    public double getTicketCost() { return this.ticketCost; }

    private String toHashString() {
        return (this.userID + " " + this.name + " " + this.sname +
                " " + this.gender + " " + this.hour + " " + this.minutes +
                " " + this.ticketCost);
    }

    public int hashCode() {
        return toHashString().hashCode();
    }

    public boolean equals(Object o) {
        Access otherAccess = (Access) o;
        return (this.userID.equalsIgnoreCase(otherAccess.getID()) &&
                this.name.equalsIgnoreCase(otherAccess.getName()) &&
                this.sname.equalsIgnoreCase(otherAccess.getSname()) &&
                this.gender.equalsIgnoreCase(otherAccess.getGender()) &&
                this.hour == otherAccess.getHour() &&
                this.minutes == otherAccess.getMinutes() &&
                this.ticketCost == otherAccess.getTicketCost());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.userID);
        sb.append(" | " + this.name);
        sb.append(" | " + this.sname);
        sb.append(" | " + this.gender);
        sb.append(" | " + this.hour);
        sb.append(" | " + this.minutes);
        sb.append(" | " + this.ticketCost);
        return sb.toString();
    }
}
