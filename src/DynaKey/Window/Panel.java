
package DynaKey.Window;

import DynaKey.Application.DynaKey;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JPanel;

public final class Panel extends JPanel implements KeyListener, MouseListener, MouseMotionListener, MouseWheelListener
{
    private final DynaKey application;
    
    public Panel()
    {
        setPreferredSize(new Dimension(Window.getWidth(), Window.getHeight()));
        setBackground(Window.getBackgroundColor());
        
        initKeyboardInput();
        initMouseInput();
        initInputFocus();
        
        application = new DynaKey();
    }
    
    private void initKeyboardInput()
    {
        addKeyListener(this);
    }
    
    private void initMouseInput()
    {
        addMouseListener(this);
        addMouseMotionListener(this);
        addMouseWheelListener(this);
    }
    
    private void initInputFocus()
    {
        setFocusable(true);
        requestFocusInWindow();
    }
    
    @Override
    public void paintComponent(final Graphics g)
    {
        super.paintComponent(g);
        
        final Graphics2D g2d = (Graphics2D) g;
        
        application.setRendererGraphicsContext(g2d);
        application.render();
    }
    
    @Override
    public void keyTyped(final KeyEvent e)
    {
        application.keyTyped(e);
    }
    
    @Override
    public void keyPressed(final KeyEvent e)
    {
        application.keyPressed(e);
    }
    
    @Override
    public void keyReleased(final KeyEvent e)
    {
        application.keyReleased(e);
    }
    
    @Override
    public void mouseClicked(final MouseEvent e)
    {
        application.mouseClicked(e);
    }
    
    @Override
    public void mousePressed(final MouseEvent e)
    {
        application.mousePressed(e);
    }
    
    @Override
    public void mouseReleased(final MouseEvent e)
    {
        application.mouseReleased(e);
    }
    
    @Override
    public void mouseEntered(final MouseEvent e)
    {
        application.mouseEntered(e);
    }
    
    @Override
    public void mouseExited(final MouseEvent e)
    {
        application.mouseExited(e);
    }
    
    @Override
    public void mouseDragged(final MouseEvent e)
    {
        application.mouseDragged(e);
    }
    
    @Override
    public void mouseMoved(final MouseEvent e)
    {
        application.mouseMoved(e);
    }
    
    @Override
    public void mouseWheelMoved(final MouseWheelEvent e)
    {
        application.mouseWheelMoved(e);
    }
}
