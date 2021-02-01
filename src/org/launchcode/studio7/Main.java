package org.launchcode.studio7;

public class Main {

    public static void main(String[] args){

        // TODO: Declare and initialize a CD and a DVD object.
        DVD D1 = new DVD("The Lion King", 12000, 9000, "Blu-Ray");
        CD D2 = new CD("Up!", 500, 300, "CD-R");

        // TODO: Call each CD and DVD method to verify that they work as expected.
        System.out.println(D1.discInfo());
        System.out.println(D1.spaceLeft());

    }
}
