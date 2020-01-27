
package DynaKey.Shape;

import java.awt.Color;

public final class Rectangle
{
    private int x;
    private int y;
    private int width;
    private int height;
    private int outlineThickness;
    private Color fillColor;
    private Color outlineColor;
    
    public Rectangle()
    {
        x = 0;
        y = 0;
        width = 0;
        height = 0;
        outlineThickness = 0;
        fillColor = null;
        outlineColor = null;
    }
    
    public void setLocation(final int x, final int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public void setSize(final int width, final int height)
    {
        this.width = (width < 0 ? 0 : width);
        this.height = (height < 0 ? 0 : height);
    }
    
    public void setOutlineThickness(final int thickness)
    {
        outlineThickness = (thickness < 0 ? 0 : thickness);
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
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public int getHeight()
    {
        return height;
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
