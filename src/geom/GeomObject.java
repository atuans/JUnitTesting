package geom;


import java.awt.Color;
import java.awt.Graphics;


public abstract class GeomObject {

    protected Color edgeColor;
    protected Color faceColor;
    protected int line_weight = 1;

    public GeomObject() {
        edgeColor = new Color(20, 200, 20);
        faceColor = new Color(255, 0, 0);
    }

    public abstract void draw(Graphics g, SpaceMapping mapper);
}