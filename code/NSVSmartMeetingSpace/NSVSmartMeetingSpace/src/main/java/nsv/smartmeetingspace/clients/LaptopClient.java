package nsv.smartmeetingspace.clients;

import nsv.smartmeetingspace.clientUI.LaptopUI;


/**
 * @author Navjot singh virk, 18th april 2017, 4:47 am
 * Class description: Client for laptop service
 * Edit history: 19th april at 4:41 (Navjot Singh), ..
 */
public class LaptopClient extends Client{
private final String WARM = "Warm";
    private boolean isWarming = false;

    /**
     * Laptop Client Constructor.
     */
    public LaptopClient() {
        super();
        serviceType = "_laptop._udp.local.";
        ui = new LaptopUI(this);
        name = "Laptop";
    }

    /**
     * sends a message to turn on the laptop.
     */
    public void warm() {
        if (!isWarming) {
            String a = sendMessage(WARM);
            if (a.equals(OK)) {
                isWarming = true;
                ui.updateArea("Bed is Warming");
            }
        } else {
            ui.updateArea("Bed already Warming");
        }
    }

    @Override
    public void updatePoll(String msg) {
        if (msg.equals("Bed is 100% warmed.")) {
            isWarming = false;
        }
    }

    @Override
    public void disable() {
        super.disable();
        ui = new LaptopUI(this);
        isWarming = false;
    }
}