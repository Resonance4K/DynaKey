
package DynaKey.Main;

import DynaKey.Window.Panel;
import DynaKey.Window.Window;

public final class Main
{
    private static final String APPLICATION_NAME = "DynaKey";
    private static final String APPLICATION_VERSION = "Version 1.0.0";
    
    public static void main(final String[] args)
    {
        final Main m = new Main();
    }
    
    private Main()
    {
        final Window window = new Window();
        window.setTitle(APPLICATION_NAME + "  |  " + APPLICATION_VERSION);
        window.setSize(800, 600);
        window.setIcon("/DynaKey/Window/icon_40x40.png");
        window.setBackgroundColor(20, 20, 20);
        window.center();
        
        final Panel panel = new Panel();
        
        window.setContentPanel(panel);
        window.show();
    }
}
