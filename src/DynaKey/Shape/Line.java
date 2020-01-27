
package DynaKey.Shape;

import java.awt.Color;

public final class Line
{
    public enum Orientation
    {
        HORIZONTAL,
        VERTICAL
    }
    
    private Orientation orientation;
    private int x;
    private int y;
    private int length;
    private int thickness;
    private int outlineThickness;
    private Color fillColor;
    private Color outlineColor;
    
    public Line()
    {
        orientation = Orientation.HORIZONTAL;
        x = 0;
        y = 0;
        length = 0;
        thickness = 0;
        outlineThickness = 0;
        fillColor = null;
        outlineColor = null;
    }
    
    public void setOrientation(final Orientation orientation)
    {
        this.orientation = (orientation == null ? Orientation.HORIZONTAL : orientation);
    }
    
    public void setLocation(final int x, final int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public void setLength(final int length)
    {
        this.length = (length < 0 ? 0 : length);
    }
    
    public void setThickness(final int thickness)
    {
        this.thickness = (thickness < 0 ? 0 : thickness);
    }
    
    public void setOutlineThickness(final int thickness)
    {
        this.outlineThickness = (thickness < 0 ? 0 : thickness);
    }
    
    public void setFillColor(int r, int g, int b, int a)
    {
        r = (r < 0 ? 0 : (r > 255 ? 255 : r));
        g = (g < 0 ? 0 : (g > 255 ? 255 : g));
        b = (b < 0 ? 0 : (b > 255 ? 255 : b));
        a = (a < 0 ? 0 : (a > 255 ? 255 : a));
        
        setFillColor(new Color(r, g, b, a));
    }
    
    public void setFillColor(final Color color)
    {
        fillColor = color;
    }
    
    public void setOutlineColor(int r, int g, int b, int a)
    {
        r = (r < 0 ? 0 : (r > 255 ? 255 : r));
        g = (g < 0 ? 0 : (g > 255 ? 255 : g));
        b = (b < 0 ? 0 : (b > 255 ? 255 : b));
        a = (a < 0 ? 0 : (a > 255 ? 255 : a));
        
        setOutlineColor(new Color(r, g, b, a));
    }
    
    public void setOutlineColor(final Color color)
    {
        outlineColor = color;
    }
    
    public Orientation getOrientation()
    {
        return orientation;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public int getLength()
    {
        return length;
    }
    
    public int getThickness()
    {
        return thickness;
    }
    
    public int getOutlineThickness()
    {
        return outlineThickness;
    }
    
    public Color getFillColor()
    {
        return fillColor;
    }
    
    public Color getOutlineColor()
    {
        return outlineColor;
    }
}
