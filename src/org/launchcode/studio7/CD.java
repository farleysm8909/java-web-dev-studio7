package org.launchcode.studio7;

public class CD extends Disc implements Spinnable {
    public CD(String name, int storageCapacity, int capacityUsed, String discType) {
        super(name, storageCapacity, capacityUsed, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("CDs spin at a rate of 200 - 500 rpm!");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
