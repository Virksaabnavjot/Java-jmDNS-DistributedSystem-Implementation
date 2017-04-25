package nsv.smartmeetingspace.clients;

import nsv.smartmeetingspace.clientUI.LightUI;

/**
 * @author Navjot singh virk, 18th april 2017, 4:49 am
 * Class description: Client for PDA service
 * Edit history: ..
 */
public class LightClient extends Client{
    private final String WARM = "Warm";
    private boolean isWarming = false;
    /**
     * Light Client Constructor.
     */
    public LightClient() {
        super();
        serviceType = "_light._udp.local.";
        ui = new LightUI(this);
        name = "Light";
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
        ui = new LightUI(this);
        isWarming = false;
    }
}
