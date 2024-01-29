package org.design.structural.adapter;
/**
 * Round pegs are compatible with round holes.
 */
public class RoundPeg {
    private double radius;
    public RoundPeg() {}
    public RoundPeg(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
}
