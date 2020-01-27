
package DynaKey.Shape;

import java.awt.Color;

public final class Square
{
    private final Rectangle rectangle;
    
    public Square()
    {
        rectangle = new Rectangle();
    }
    
    public void setLocation(final int x, final int y)
    {
        rectangle.setLocation(x, y);
    }
    
    public void setSize(final int size)
    {
        rectangle.setSize(size, size);
    }
    
    public void setOutlineThickness(final int thickness)
    {
        rectangle.setOutlineThickness(thickness);
    }
    
    public void setFillColor(final int r, final int g, final int b, final int a)
    {
        rectangle.setFillColor(r, g, b, a);
    }
    
    public void setFillColor(final Color color)
    {
        rectangle.setFillColor(color);
    }
    
    public void setOutlineColor(final int r, final int g, final int b, final int a)
    {
        rectangle.setOutlineColor(r, g, b, a);
    }
    
    public void setOutlineColor(final Color color)
    {
        rectangle.setOutlineColor(color);
    }
    
    // Returns the rectangle representation of this square
    public Rectangle getRectangle()
    {
        return rectangle;
    }
    
    public int getX()
    {
        return rectangle.getX();
    }
    
    public int getY()
    {
        return rectangle.getY();
    }
    
    public int getWidth()
    {
        return rectangle.getWidth();
    }
    
    public int getHeight()
    {
        return rectangle.getHeight();
    }
    
    public int getOutlineThickness()
    {
        return rectangle.getOutlineThickness();
    }
    
    public Color getFillColor()
    {
        return rectangle.getFillColor();
    }
    
    public Color getOutlineColor()
    {
        return rectangle.getOutlineColor();
    }
}
