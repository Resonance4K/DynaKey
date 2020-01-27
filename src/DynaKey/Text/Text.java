
package DynaKey.Text;

import java.awt.Color;
import java.awt.Font;

public final class Text
{
    private static final int DEFAULT_FONT_SIZE = 12;
    private static final int MINIMUM_FONT_SIZE = 10;
    
    public enum HorizontalAlignment
    {
        LEFT,
        CENTER,
        RIGHT
    }
    
    public enum VerticalAlignment
    {
        TOP,
        CENTER,
        BOTTOM
    }
    
    private String text;
    private Character[] characters;
    private HorizontalAlignment alignmentX;
    private VerticalAlignment alignmentY;
    private int x;
    private int y;
    private int fontSize;
    private Color fillColor;
    
    public Text()
    {
        text = "";
        characters = new Character[0];
        alignmentX = HorizontalAlignment.LEFT;
        alignmentY = VerticalAlignment.TOP;
        x = 0;
        y = 0;
        fontSize = DEFAULT_FONT_SIZE;
        fillColor = null;
    }
    
    public void setText(final String text)
    {
        this.text = (text == null ? "" : text);
    }
    
    public void setChars(String text)
    {
        text = (text == null ? "" : text);
        
        characters = new Character[text.length()];
        
        for (int i = 0; i < characters.length; i++)
        {
            characters[i] = new Character(text.charAt(i));
        }
    }
    
    public void setHorizontalAlignment(final HorizontalAlignment alignmentX)
    {
        this.alignmentX = (alignmentX == null ? HorizontalAlignment.LEFT : alignmentX);
    }
    
    public void setVerticalAlignment(final VerticalAlignment alignmentY)
    {
        this.alignmentY = (alignmentY == null ? VerticalAlignment.TOP : alignmentY);
    }
    
    public void setLocation(final int x, final int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public void setFontSize(final int fontSize)
    {
        this.fontSize = (fontSize < MINIMUM_FONT_SIZE ? MINIMUM_FONT_SIZE : fontSize);
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
    
    // Must set the characters array and both horizontal and vertical alignments before calling this method
    public void setCharacterBounds(int width, int height)
    {
        width = (width < 0 ? 0 : width);
        height = (height < 0 ? 0 : height);
        
        final int alignedX = getAlignedX(width);
        final int alignedY = getAlignedY(height);
        
        for (int i = 0; i < characters.length; i++)
        {
            characters[i].getBounds().setLocation(alignedX + (width * i), alignedY);
            characters[i].getBounds().setSize(width, height);
        }
    }
    
    private int getAlignedX(final int width)
    {
        final int maxWidth = width * characters.length;
        
        switch (alignmentX)
        {
            case LEFT:      return x;
            case CENTER:    return x - (maxWidth / 2);
            case RIGHT:     return x - maxWidth;
            default:        return 0;
        }
    }
    
    private int getAlignedY(final int height)
    {
        switch (alignmentY)
        {
            case TOP:       return y;
            case CENTER:    return y - (height / 2);
            case BOTTOM:    return y - height;
            default:        return 0;
        }
    }
    
    public String getText()
    {
        return text;
    }
    
    public Character[] getChars()
    {
        return characters;
    }
    
    public HorizontalAlignment getHorizontalAlignment()
    {
        return alignmentX;
    }
    
    public VerticalAlignment getVerticalAlignment()
    {
        return alignmentY;
    }
    
    public int getX()
    {
        return x;
    }
    
    public int getY()
    {
        return y;
    }
    
    public Color getFillColor()
    {
        return fillColor;
    }
    
    public Font getFont()
    {
        return new Font("Dialog", Font.PLAIN, fontSize);
    }
}
