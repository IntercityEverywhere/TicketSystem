import java.util.ArrayList; // Import ArrayList.

/**
 * The Database class stores Ticket objects in an ArrayList.
 * 
 * By Luke Stanbridge
 * v1.0 June 2024
 */
public class Database {

    // Fields

    static ArrayList<Ticket> databaseArrayList = new ArrayList<Ticket>(); // ArrayList for tickets.

    /**
     * The addTicket method takes a Ticket from a parameter and adds it to the databaseArrayList.
     */
    public static void addTicket(Ticket ticket)
    {
        databaseArrayList.add(ticket);
    }
}