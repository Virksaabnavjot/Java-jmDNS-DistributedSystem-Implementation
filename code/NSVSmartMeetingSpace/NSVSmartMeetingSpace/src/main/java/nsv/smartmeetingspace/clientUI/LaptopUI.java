package nsv.smartmeetingspace.clientUI;

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import nsv.smartmeetingspace.clients.LaptopClient;

/**
 *
 * @author Navjot Singh Virk created 19th April 2017, 4:38 am
 */
public class LaptopUI extends ClientUI {

    private static final long serialVersionUID = -5318589393275157185L;
    private JButton warm;
    private final LaptopClient parent;

    public LaptopUI(LaptopClient laptopClient) {
        super(laptopClient);
        parent = laptopClient;
        init();
    }

    @Override
    public void init() {
        super.init();
        warm = new JButton("Warm");
        scroll.setBounds(5, 40, UIConstants.COMPONENTWIDTH, 300);
        add(new JButton[]{warm});
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == warm) {
            parent.warm();
        }
    }
}