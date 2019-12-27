
package DynaKey.Window;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

public final class Window
{
    private static final JFrame FRAME = new JFrame();
    
    private final GraphicsDevice[] devices;
    
    public Window()
    {
        devices = GraphicsEnvironment.getLocalGraphicsEnvironment().getScreenDevices();
        
        FRAME.setLayout(null);
        FRAME.setResizable(false);
        FRAME.setAlwaysOnTop(false);
        FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        FRAME.setVisible(false);
    }
    
    public void setTitle(final String title)
    {
        FRAME.setTitle(title);
    }
    
    public void setSize(int width, int height)
    {
        width = (width < 0 ? 0 : width);
        height = (height < 0 ? 0 : height);
        
        FRAME.setPreferredSize(new Dimension(width, height));
        FRAME.pack();
    }
    
    public void setBackgroundColor(int r, int g, int b)
    {
        r = (r < 0 ? 0 : (r > 255 ? 255 : r));
        g = (g < 0 ? 0 : (g > 255 ? 255 : g));
        b = (b < 0 ? 0 : (b > 255 ? 255 : b));
        
        setBackgroundColor(new Color(r, g, b, 255));
    }
    
    public void setBackgroundColor(final Color color)
    {
        FRAME.setBackground(color);
    }
    
    public void setIcon(final String iconPath)
    {
        BufferedImage icon = null;
        
        try
        {
            icon = ImageIO.read(getClass().getResourceAsStream(iconPath));
        }
        catch (IOException e) { e.printStackTrace(); }
        
        setIcon(icon);
    }
    
    public void setIcon(final BufferedImage icon)
    {
        FRAME.setIconImage(icon);
    }
    
    public void setIcons(final String[] iconPaths)
    {
        final ArrayList<BufferedImage> icons = new ArrayList<BufferedImage>();
        
        try
        {
            for (int i = 0; i < iconPaths.length; i++)
            {
                final BufferedImage icon = ImageIO.read(getClass().getResourceAsStream(iconPaths[i]));
                icons.add(icon);
            }
        }
        catch (IOException e) { e.printStackTrace(); }
        
        setIcons(icons);
    }
    
    public void setIcons(final ArrayList<BufferedImage> icons)
    {
        FRAME.setIconImages(icons);
    }
    
    public void setContentPanel(final Panel panel)
    {
        FRAME.setContentPane(panel);
    }
    
    public static void repaintContentPanel()
    {
        FRAME.getContentPane().repaint();
    }
    
    public static void repaintContentPanel(int x, int y, int width, int height)
    {
        x = (x < 0 ? 0 : x);
        y = (y < 0 ? 0 : y);
        width = (width > FRAME.getContentPane().getWidth() ? FRAME.getContentPane().getWidth() : width);
        height = (height > FRAME.getContentPane().getHeight() ? FRAME.getContentPane().getHeight() : height);
        
        FRAME.getContentPane().repaint(x, y, width, height);
    }
    
    public void show()
    {
        FRAME.setVisible(true);
    }
    
    public void center()
    {
        final int primaryDisplayWidth = devices[0].getDisplayMode().getWidth();
        final int primaryDisplayHeight = devices[0].getDisplayMode().getHeight();
        
        final int x = (primaryDisplayWidth - FRAME.getWidth()) / 2;
        final int y = (primaryDisplayHeight - FRAME.getHeight()) / 2;
        
        FRAME.setLocation(x, y);
    }
    
    public static int getWidth()
    {
        return FRAME.getWidth();
    }
    
    public static int getHeight()
    {
        return FRAME.getHeight();
    }
    
    public static Color getBackgroundColor()
    {
        return FRAME.getBackground();
    }
}
