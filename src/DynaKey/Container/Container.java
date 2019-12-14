
package DynaKey.Container;

import DynaKey.Render.Renderer;

import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public abstract class Container
{
    protected Container()
    {
        
    }
    
    public abstract void render(final Renderer renderer);
    
    public abstract void keyTyped(final KeyEvent e);
    public abstract void keyPressed(final KeyEvent e);
    public abstract void keyReleased(final KeyEvent e);
    
    public abstract void mouseClicked(final MouseEvent e);
    public abstract void mousePressed(final MouseEvent e);
    public abstract void mouseReleased(final MouseEvent e);
    public abstract void mouseEntered(final MouseEvent e);
    public abstract void mouseExited(final MouseEvent e);
    public abstract void mouseDragged(final MouseEvent e);
    public abstract void mouseMoved(final MouseEvent e);
    
    public abstract void mouseWheelMoved(final MouseWheelEvent e);
}
