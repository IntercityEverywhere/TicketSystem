/**
 * The Ticket class holds details of a tech support job
 * including an ID number, User Name, Email, Phone Number,
 * Description, and Title.
 * 
 * By Luke Stanbridge
 * v1.0 June 2024
 */
public class Ticket {

    // Fields
    
    public static int ticketID; // Initialise a static field for the Ticket ref number.
    private String name; // Name of a user.
    private String email; // User's email.
    private long phoneNo; // User's phone number.
    private String description; // Description of the job.
    private String title; // Title for the ticket.

    /**
     * Constructor for objects of class Ticket.
     */
    public Ticket(String theName, String theEmail, long thePhoneNo, String theDescription, String theTitle)
    {
        ticketID++;
        name = theName;
        email = theEmail;
        phoneNo = thePhoneNo;
        description = theDescription;
        title = theTitle;
    }

    /**
     * Returns the Ticket ref number.
     */
    public int getID()
    {
        return ticketID;
    }

    /**
     * Returns the name of the user.
     */
    public String getName()
    {
        return name;
    }

    /**
     * Returns the user's email address.
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * Returns the user's phone number.
     */
    public long getPhoneNo()
    {
        return phoneNo;
    }

    /**
     * Returns the description of the ticket.
     */
    public String getDescription()
    {
        return description;
    }

    /**
     * Returns the title of the ticket.
     */
    public String getTitle()
    {
        return title;
    }

    /**
     * Display all the properties of the ticket in the terminal.
     */
    public void displayProperties()
    {
        System.out.println("Ticket ID: "+ticketID);
        System.out.println("Name: "+name);
        System.out.println("Email: "+email);
        System.out.println("Phone Number: "+phoneNo);
        System.out.println("Title: "+title);
        System.out.println("Description: "+description);
    }
}