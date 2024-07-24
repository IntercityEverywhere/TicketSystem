import java.util.ArrayList; // Import ArrayList.

/**
 * The Database class stores Ticket and Device objects 
 * in ArrayLists.
 * 
 * By Luke Stanbridge
 * v0.2 July 2024
 */
public class Database {

    // Fields

    static ArrayList<Ticket> ticketArrayList = new ArrayList<Ticket>(); // ArrayList for tickets.
    static ArrayList<Device> deviceArrayList = new ArrayList<Device>(); // ArrayList for devices.

    /**
     * The addTicket method takes a Ticket from a parameter 
     * and adds it to the ticketArrayList.
     */
    public static void addTicket(Ticket ticket)
    {
        ticketArrayList.add(ticket);
    }

    /**
     * The addDevice method takes a Device from a parameter
     * and adds it to the deviceArrayList.
     */
     public static void addDevice(Device device)
     {
        deviceArrayList.add(device);
     }
}