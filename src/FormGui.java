// Import the class libraries required for the GUI.

import java.awt.*; // Abstract Window Toolkit (AWT).
import java.awt.event.*; // Interfaces and classes to handle AWT events.
import javax.swing.*;  // Swing.

/**
 * The FormGui class provides the Graphical User Interface (GUI) for the form window.
 * 
 * By Luke Stanbridge
 * v0.1 July 2024
 */
public class FormGui implements ActionListener {

    // Fields

    private JFrame form;
    
    // Form Labels
    
    private JLabel titleLabel;
    private JLabel ticketIdLabel;
    private JLabel customerLabel;
    private JLabel nameLabel;
    private JLabel emailLabel;
    private JLabel phoneNoLabel;
    private JLabel ticketTitleLabel;
    private JLabel descriptionLabel;

    // Form Text Fields

    private JTextField nameTextField;
    private JTextField emailTextField;
    private JTextField phoneNoTextField;
    private JTextField ticketTitleTextField;

    // Description Text Area

    private JTextArea descriptionTextArea;

    // Description Scroll Pane

    private JScrollPane descriptionScrollPane;
    
    // Save Button

    private JButton saveButton;

    /**
     * Constructor which initialises the elements of the form.
     */
    public FormGui()
    {
        form = new JFrame("Ticket");// Initialise the form window.
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit the application when the window is closed.
        form.setPreferredSize(new Dimension(800,410)); // Set the initial size of the window.
        Container contentPane = form.getContentPane(); // Assign the content pane to a local variable.
        contentPane.setLayout(new GridBagLayout());  // Apply GridBagLayout Layout Manager to content pane.
        
        // Initialise Labels

        titleLabel = new JLabel("Ticket");
        ticketIdLabel = new JLabel("ID: "+Ticket.ticketID);
        customerLabel = new JLabel("Customer");
        nameLabel = new JLabel("Name: ");
        emailLabel = new JLabel("Email: ");
        phoneNoLabel = new JLabel("Phone Number:");
        ticketTitleLabel = new JLabel("Title: ");
        descriptionLabel = new JLabel("Description: ");

        // Initialise Text Fields

        nameTextField = new JTextField(40);
        emailTextField = new JTextField(40);
        phoneNoTextField = new JTextField(12);
        ticketTitleTextField = new JTextField(40);

        // Initialise Text Area with Scroll Pane

        descriptionTextArea = new JTextArea();
        descriptionTextArea.setEditable(true);
        descriptionTextArea.setLineWrap(true); // Turn line wrapping on.
        descriptionTextArea.setWrapStyleWord(true); // Wrap lines at word boundaries rather than character boundaries.
        descriptionScrollPane = new JScrollPane(descriptionTextArea); // Put the description Text Area in the scroll pane.
        descriptionScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); // Show the scroll pane only when needed.
        descriptionScrollPane.setPreferredSize(new Dimension(250,250));

        // Initialise Buttons

        saveButton = new JButton("Save");

        // Specify a new object of GridBagConstraints for the constraints.

        GridBagConstraints c = new GridBagConstraints();

        // Add titleLabel

        titleLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipadx = 5; // Horizontal padding of 5 pixels.
        c.ipady = 20; // Make the title label tall.
        c.insets = new Insets(20, 10, 0, 0);
        c.weightx = 1.0;
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        contentPane.add(titleLabel, c);

        // Add ticketIdLabel

        c.weightx = 1.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipadx = 5; // Horizontal padding of 5 pixels.
        c.insets = new Insets(0, 10, 0, 0); // Add spacing pixels to left.
        c.gridx = 0;
        c.gridy = 1;
        contentPane.add(ticketIdLabel, c);

        // Add customerLabel

        customerLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
        c.weightx = 1.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipadx = 5;
        c.insets = new Insets(0, 10, 0, 0); // Add spacing pixels to the left.
        c.gridx = 0;
        c.gridy = 2;
        contentPane.add(customerLabel, c);

        // Add nameLabel

        c.weightx = 1.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipadx = 5;
        c.gridx = 0;
        c.gridy = 3;
        contentPane.add(nameLabel, c);

        // Add nameTextField

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1.0;
        c.ipadx = 5;
        c.gridx = 1;
        c.gridy = 3;
        contentPane.add(nameTextField, c);

        // Add emailLabel

        c.weightx = 1.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipadx = 5;
        c.gridx = 0;
        c.gridy = 4;
        contentPane.add(emailLabel, c);

        // Add emailTextField

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1.0;
        c.ipadx = 5;
        c.gridx = 1;
        c.gridy = 4;
        contentPane.add(emailTextField, c);

        // Add phoneNoLabel

        c.weightx = 1.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipadx = 5;
        c.gridx = 2;
        c.gridy = 3;
        contentPane.add(phoneNoLabel, c);

        // Add phoneNoTextField

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1.0;
        c.ipadx = 5;
        c.insets = new Insets(0, 10, 0, 10); // Add spacing pixels to right and left.
        c.gridx = 3;
        c.gridy = 3;
        contentPane.add(phoneNoTextField, c);

        // Add ticketTitleLabel

        c.weightx = 1.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipadx = 5;
        c.insets = new Insets(0, 10, 0, 0); // Add spacing pixels to the left.
        c.gridx = 0;
        c.gridy = 5;
        contentPane.add(ticketTitleLabel, c);

        // Add ticketTitleTextField

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1.0;
        c.ipadx = 5;
        c.gridx = 1;
        c.gridy = 5;
        contentPane.add(ticketTitleTextField, c);

        // Add descriptionLabel

        c.weightx = 1.0;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.ipadx = 5;
        c.gridx = 0;
        c.gridy = 6;
        contentPane.add(descriptionLabel, c);

        // Add descriptionScrollPane with descriptionTextArea

        c.fill = GridBagConstraints.BOTH;
        c.weightx = 1.0;
        c.ipadx = 5;
        c.gridx = 0;
        c.gridy = 7;
        c.gridwidth = 2; // Use two cells vertically.
        contentPane.add(descriptionScrollPane, c);

        // Add saveButton

        c.fill = GridBagConstraints.HORIZONTAL;
        c.weightx = 1.0;
        c.insets = new Insets(0, 10, 40, 10); // Add spacing pixels to left, bottom and right.
        c.gridx = 3;
        c.gridy = 8;
        contentPane.add(saveButton, c);

        saveButton.addActionListener(this); // Add an ActionListener to the button.

        form.pack(); // Size the form window so that all contents are set to the preferred size.

        form.setVisible(true); // Set the form window to be visible.

        contentPane.setVisible(true); // Set the content pane to be visible.
    }

    /**
     * The getNameTextField method returns the value entered by the
     * user in the Name text field as a String.
     */
     public String getNameTextField()
     {
        return nameTextField.getText();
     }

     /**
     * The getEmailTextField method returns the value entered by the
     * user in the Email text field as a String.
     */
     public String getEmailTextField()
     {
        return emailTextField.getText();
     }

     /**
     * The getPhoneNoTextField method returns the value entered by the
     * user in the Phone Number text field as a long integer.
     */
     public long getPhoneNoTextField()
     {
        // Use try catch statement to return -1 to indicate when the value in the
        // phone number text field is not an integer, which would cause an exception.

        long phoneNoInt;

        try
        {
            phoneNoInt = Long.parseLong(phoneNoTextField.getText()); // Convert String output of text field to integer.
        }
        catch(NumberFormatException n)
        {
            phoneNoInt = -1;
        }
        return phoneNoInt;
     }

    /**
     * The getTicketTitleTextField method returns the value entered by the
     * user in the Title text field as a String.
     */
    public String getTicketTitleTextField()
    {
        return ticketTitleTextField.getText();
    }

    /**
     * The getDescriptionTextArea method returns the value entered by the
     * user in the Description text area as a String.
     */
    public String getDescriptionTextArea()
    {
        return descriptionTextArea.getText();
    }

    /**
     * This actionPerformed method is used for event handling.
     */
     public void actionPerformed(ActionEvent e)
     {
        String command = e.getActionCommand();

        if(command.equals("Save"))
        {
            saveAction();
        }
     }

     /**
      * The saveAction method creates a new Ticket using values from the text fields
      * in the form when the "Save" button is pressed.
      */
      public void saveAction()
      {
        if(getPhoneNoTextField() != -1) // Check that the value for the phone number is not invalid.
        {
            Ticket ticket = new Ticket(getNameTextField(), getEmailTextField(), getPhoneNoTextField(), getDescriptionTextArea(), getTicketTitleTextField());
            int ticketID = ticket.getID(); // Get the ticket ID and store it in a local variable.
            Database.addTicket(ticket); // Save the ticket to the database.
            JOptionPane.showMessageDialog(form, "The ticket ID is: " + ticketID, "Ticket Saved", JOptionPane.INFORMATION_MESSAGE);
            clear(); // Clear the text fields, ready for the next ticket.
        }
        else
        {
            // If getPhoneNoTextField() = -1, the phone number is invalid, so show error message.
            JOptionPane.showMessageDialog(form, "Error \n"+"The Phone Number entry must only contain digits. \n"+"Please try again.","Invalid Value for Phone Number",JOptionPane.ERROR_MESSAGE);
        }
      }

      /**
       * The clear method clears all text fields.
       */
      public void clear()
      {
        nameTextField.setText("");
        emailTextField.setText("");
        phoneNoTextField.setText("");
        ticketTitleTextField.setText("");
        descriptionTextArea.setText("");
      }
}