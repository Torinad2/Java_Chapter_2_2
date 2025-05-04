/**************************************************************************************************
 * Assignment: Name and Initials                                                                  *
 *                                                                                                *
 * Write a program that has the following String variables: firstName, middleName, and            *
 * lastName. Initialize these with your first, middle, and last names. The program should also    *
 * have the following char variables: firstInitial, middleInitial, and lastInitial.               *
 * Store your first, middle, and last initials in these variables. The program should display the *
 * contents of these variables on the screen.                                                     *
 **************************************************************************************************/

public class NameAndInitials {
    public static void main(String[] args)
    {
        /* ********************************************
         * Step 1: Declare and initialize full names  *
         **********************************************/
        String firstName = "Nikita",
               middleName = "Aleksandrovich",
               lastName = "Baiborodov";

        /* ********************************************
         * Step 2: Extract initials from full names   *
         **********************************************/
        char firstInitial = firstName.charAt(0),
             middleInitial = middleName.charAt(0),
             lastInitial = lastName.charAt(0);

        /* ********************************************
         * Step 3: Display full names and initials    *
         **********************************************/
        System.out.println("My name is " + firstName + " "
                                         + middleName + " "
                                         + lastName);

        System.out.println("My initials are " + firstInitial + "."
                                              + middleInitial + "."
                                              + lastInitial + ".");

        /* *********************************************
         * Display developer credit                    *
         ***********************************************/
        System.out.println();
        System.out.println("Developed by: Nikita Baiborodov.");

        System.exit(0);
    }
}
