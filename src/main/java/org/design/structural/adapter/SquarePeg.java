package org.design.structural.adapter;
/**
 * Square pegs are not compatible with round holes.
 * But we must somehow fit them into a round hole.
 */
public class SquarePeg {
    private double width;
    public SquarePeg() {}
    public SquarePeg(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}
