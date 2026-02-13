package com.mycompany.agency;


// TODO 1: Make TempEmploee a child of StaffEmploee

public class TempEmployee extends StaffEmployee
{
    private int hoursWorked;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this hourly employee using the specified
    //  information.
    //-----------------------------------------------------------------
    public TempEmployee(String eName, String eAddress, String ePhone,
                        String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);

        hoursWorked = 0;
    }

    //-----------------------------------------------------------------
    // TODO2: Adds the specified number of hours to this employee's
    //  accumulated hours.
    //-----------------------------------------------------------------
    public void addHours(int moreHours)
    {
        hoursWorked += moreHours;
    }

    //-----------------------------------------------------------------
    // TODO3: Computes and returns the pay for this hourly employee.
    //-----------------------------------------------------------------
    public double pay()
    {
        return hoursWorked * TempEmployee.this.payRate;
    }

    //-----------------------------------------------------------------
    // TODO4: Returns information about this hourly employee as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        return "Name: " + TempEmployee.this.name +
                "\nAddress: " + TempEmployee.this.address +
                "\nPhone: " + TempEmployee.this.phone +
                "\nSocial Security Number: " + TempEmployee.this.socialSecurityNumber +
                "\nHours: " + TempEmployee.this.hoursWorked;
    }
}