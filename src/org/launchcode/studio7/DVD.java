package org.launchcode.studio7;

public class DVD extends Disc implements Spinnable {
    public DVD(String name, int storageCapacity, int capacityUsed, String discType) {
        super(name, storageCapacity, capacityUsed, discType);
    }

    @Override
    public void spinDisc() {
        System.out.println("DVDs spin at a rate of 570 - 1600 rpm!");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
