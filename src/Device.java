/**
 * The Device class holds details of a device with fields for
 * a Device ID number, Serial Number, and Model.
 * 
 * By Luke Stanbridge
 * v0.2 July 2024
 */
public class Device {

    // Fields

    private int deviceID; // A unique value for a device.
    private String serialNo; // Serial number of the device.
    private String model; // Model of the device.

    /**
     * Constructor for objects of class Device.
     */
    public Device(int theDeviceID, String theSerialNo, String theModel) 
    {
        deviceID = theDeviceID;
        serialNo = theSerialNo;
        model = theModel;
    }

    /**
     * Returns the device ID number.
     */
    public int getDeviceID()
    {
        return deviceID;
    }

    /**
     * Returns the device serial number.
     */
    public String getSerialNo()
    {
        return serialNo;
    }

    /**
     * Returns the device model.
     */
    public String getModel()
    {
        return model;
    }

    /**
     * Display all the properties of the device in the terminal.
     */
    public void displayProperties()
    {
        System.out.println("Device ID: "+deviceID);
        System.out.println("Serial Number: "+serialNo);
        System.out.println("Model: "+model);
    }
}
