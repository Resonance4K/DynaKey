
package DynaKey.Text;

import DynaKey.Shape.Rectangle;

public final class Character
{
    private final char character;
    private final Rectangle bounds;
    
    public Character(final char character)
    {
        this.character = character;
        bounds = new Rectangle();
    }
    
    public char getChar()
    {
        return character;
    }
    
    public String getString()
    {
        return String.valueOf(character);
    }
    
    public Rectangle getBounds()
    {
        return bounds;
    }
}
