package org.launchcode.studio7;

public abstract class Disc {
    private String name;
    private int storageCapacity;
    private int remainingCapacity;
    private int capacityUsed;
    private String discType;

    public Disc(String name, int storageCapacity, int capacityUsed, String discType) {
        this.name = name;
        this.storageCapacity = storageCapacity;
        this.capacityUsed = capacityUsed;
        this.remainingCapacity = spaceLeft();
        this.discType = discType;
    }

    // returns how much space is left on the disc
    public int spaceLeft() {
        return this.storageCapacity - this.capacityUsed;
    }

    // returns a string containing disc info
    public String discInfo() {
        return "Disc name: " + name + "\nStorage Capacity: " + storageCapacity + "\nStorage Used: " + capacityUsed + "\nStorage Remaining: " + remainingCapacity + "\nType: " + discType;
    }
}
