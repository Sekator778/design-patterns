package org.design.structural.flyweight;

import java.awt.*;

public class TreeType {
    private String name;
    private String color;
    private String otherTreeData;

    public TreeType(String name, String color, String otherTreeData) {
        this.name = name;
        this.color = color;
        this.otherTreeData = otherTreeData;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(Color.BLACK);
        g.fillRect(x - 1, y, 3, 5);
        g.setColor(Color.GREEN);
        g.fillOval(x - 5, y - 10, 10, 10);
    }
}
