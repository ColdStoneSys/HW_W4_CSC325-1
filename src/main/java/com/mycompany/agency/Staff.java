package com.mycompany.agency;




public class Staff
{
    private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        // TODO 1: Add 6 employees to the staffList

        staffList = new StaffMember[6];

        this.staffList[0] = new Executive("Moaath Alrajab", "25 New Tree Line", "516-101-3131"
        ,"000-000-1234", 3050);

        this.staffList[1] = new StaffEmployee("Davey Jones", "65 Pineapple Road", "516-200-3697",
                "884-752-9647", 1350);

        this.staffList[2] = new StaffEmployee("Alice White", "1477 South Street", "631-568-7741",
                "884-752-9647", 1350);

        this.staffList[3] = new TempEmployee("John Smith", "100 Place Street", "631-876-1763",
                "123-472-1782", 45);

        this.staffList[4] = new StaffEmployee("Bob Johnson", "1480 South Street", "631-687-2244",
                "884-752-9647", 1800);

        this.staffList[5] = new Intern("Joan Turnip", "572 Farmer Street", "516-997-3752");



        ((Executive)staffList[0]).awardBonus(500.00);

        ((TempEmployee)staffList[3]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday ()
    {
        double amount;

        for (int count=0; count < staffList.length; count++)
        {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
