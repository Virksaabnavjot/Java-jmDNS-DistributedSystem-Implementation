package nsv.smartmeetingspace.clientUI;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import nsv.smartmeetingspace.clients.LightClient;

/**
 *
 * @author Navjot Singh
 */
public class LightUI extends ClientUI {
    private static final long serialVersionUID = -5318589393275157185L;
    private JButton on;
    private JButton brightness;
    private final LightClient parent;
    

    public LightUI(LightClient lightClient) {
        super(lightClient);
        parent = lightClient;
        init();
    }

    @Override
    public void init() {
        super.init();
        on = new JButton("On");
        brightness = new JButton("Brightness");
        scroll.setBounds(5, 40, UIConstants.COMPONENTWIDTH, 300);
        add(new  JButton[]{brightness});
        add(new JButton[]{on});
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == on) {
            parent.switchOnLight();
        }
        else if (e.getSource() == brightness) {
            parent.changeBrightness();
        }
    }
}
