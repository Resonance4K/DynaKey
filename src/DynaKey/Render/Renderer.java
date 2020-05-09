
package DynaKey.Render;

import DynaKey.Shape.Line;
import DynaKey.Shape.Rectangle;
import DynaKey.Shape.Square;
import DynaKey.Text.Text;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Stroke;

public final class Renderer
{
    private Graphics2D g2d;
    private Font defaultFont;
    private Stroke defaultStroke;
    
    public Renderer()
    {
        g2d = null;
        defaultFont = null;
        defaultStroke = null;
    }
    
    public void setGraphicsContext(final Graphics2D g2d)
    {
        this.g2d = g2d;
        defaultFont = g2d.getFont();
        defaultStroke = g2d.getStroke();
    }
    
    public void renderText(final Text text)
    {
        if (text == null) { return; }
        
        final Color fillColor = text.getFillColor();
        
        if (fillColor != null)
        {
            g2d.setColor(fillColor);
            g2d.setFont(text.getFont());
            g2d.drawString(text.getText(), getAlignedX(text), getAlignedY(text));
            g2d.setFont(defaultFont);
        }
    }
    
    // Used to get the aligned x position of the text from the graphics context font metrics
    private int getAlignedX(final Text text)
    {
        final int x = text.getX();
        final int width = (int) g2d.getFontMetrics(text.getFont()).getStringBounds(text.getText(), g2d).getWidth();
        
        switch (text.getHorizontalAlignment())
        {
            case LEFT:      return x;
            case CENTER:    return x - (width / 2);
            case RIGHT:     return x - width;
            default:        return 0;
        }
    }
    
    // Used to get the aligned y position of the text from the graphics context font metrics
    private int getAlignedY(final Text text)
    {
        final int y = text.getY();
        // The font ascent is measured upwards relative to the font's baseline
        // The font descent is measured downwards relative to the font's baseline
        final int height = g2d.getFontMetrics(text.getFont()).getAscent() - (g2d.getFontMetrics(text.getFont()).getDescent() / 2);
        
        switch (text.getVerticalAlignment())
        {
            case TOP:       return y;
            case CENTER:    return y + (height / 2);
            case BOTTOM:    return y + height;
            default:        return 0;
        }
    }
    
    public void renderLine(final Line line)
    {
        if (line == null) { return; }
        
        final Line.Orientation orientation = line.getOrientation();
        final int x = line.getX();
        final int y = line.getY();
        final int length = line.getLength();
        final Color fillColor = line.getFillColor();
        final Color outlineColor = line.getOutlineColor();
        final int thickness = line.getThickness();
        final int outlineThickness = line.getOutlineThickness();
        
        if (fillColor != null && thickness > 0)
        {
            g2d.setStroke(new BasicStroke(thickness));
            g2d.setColor(fillColor);
            
            renderLine(orientation, x, y, length);
            
            g2d.setStroke(defaultStroke);
        }
        
        if (outlineColor != null && outlineThickness > 0)
        {
            g2d.setStroke(new BasicStroke(outlineThickness));
            g2d.setColor(outlineColor);
            
            renderLine(orientation, x, y, length);
            
            g2d.setStroke(defaultStroke);
        }
    }
    
    private void renderLine(final Line.Orientation orientation, final int x, final int y, final int length)
    {
        if (orientation == Line.Orientation.HORIZONTAL)
        {
            g2d.drawLine(x, y, x + length, y);
        }
        else if (orientation == Line.Orientation.VERTICAL)
        {
            g2d.drawLine(x, y, x, y + length);
        }
    }
    
    public void renderRectangle(final Rectangle rectangle)
    {
        if (rectangle == null) { return; }
        
        final int x = rectangle.getX();
        final int y = rectangle.getY();
        final int width = rectangle.getWidth();
        final int height = rectangle.getHeight();
        final Color fillColor = rectangle.getFillColor();
        final Color outlineColor = rectangle.getOutlineColor();
        final int outlineThickness = rectangle.getOutlineThickness();
        
        if (fillColor != null)
        {
            g2d.setColor(fillColor);
            g2d.fillRect(x, y, width, height);
        }
        
        if (outlineColor != null && outlineThickness > 0)
        {
            g2d.setStroke(new BasicStroke(outlineThickness));
            g2d.setColor(outlineColor);
            g2d.drawRect(x, y, width, height);
            g2d.setStroke(defaultStroke);
        }
    }
    
    public void renderSquare(final Square square)
    {
        if (square == null) { return; }
        
        renderRectangle(square.getRectangle());
    }
}
