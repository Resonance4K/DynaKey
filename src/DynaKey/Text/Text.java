
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
    private HorizontalAlignment alignmentX;
    private VerticalAlignment alignmentY;
    private int x;
    private int y;
    private int fontStyle;
    private int fontSize;
    private Color fillColor;
    
    public Text()
    {
        text = "";
        alignmentX = HorizontalAlignment.LEFT;
        alignmentY = VerticalAlignment.TOP;
        x = 0;
        y = 0;
        fontStyle = Font.PLAIN;
        fontSize = DEFAULT_FONT_SIZE;
        fillColor = null;
    }
    
    public void setText(final String text)
    {
        this.text = (text == null ? "" : text);
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
    
    public void setFontStyleToPlain()
    {
        fontStyle = Font.PLAIN;
    }
    
    public void setFontStyleToBold()
    {
        fontStyle = Font.BOLD;
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
    
    public String getText()
    {
        return text;
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
        return new Font("Dialog", fontStyle, fontSize);
    }
}
