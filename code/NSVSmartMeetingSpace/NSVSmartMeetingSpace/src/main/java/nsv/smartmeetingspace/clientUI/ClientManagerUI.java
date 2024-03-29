package nsv.smartmeetingspace.clientUI;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

import nsv.smartmeetingspace.clients.ClientManager;
/**
 * @author Dr. Dominic Carr
 * This file is a part of ProjectSample made available by National College of Ireland 
 * available at https://moodle.ncirl.ie
 */

public class ClientManagerUI extends JFrame {

    private final JTabbedPane allPanels;
    private static final long serialVersionUID = -4512962459244007477L;

    public ClientManagerUI(final ClientManager clientManager) {
        super("NSV Smart Meeting Space");
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                clientManager.end();
            }
        });
        setResizable(false);
        pack();
        setSize(UIConstants.UIWIDTH, UIConstants.UIWIDTH);
        setLocation(setPosition(this));
        allPanels = new JTabbedPane();
        getContentPane().add(allPanels);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        update(this.getGraphics());
    }

    public static Point setPosition(Component c) {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - c.getWidth()) / 2);
        return new Point(x, 0);
    }

    public void addPanel(JPanel a, String name) {
        allPanels.addTab(name, a);
    }

    public void removePanel(JPanel returnUI) {
        allPanels.remove(returnUI);
    }
}
