package nsv.smartmeetingspace.clients;

import java.util.Random;
import nsv.smartmeetingspace.Light;
import nsv.smartmeetingspace.clientUI.LightUI;

/**
 * @author Navjot singh virk, 18th april 2017, 4:49 am
 * Class description: Client for Light service
 * Edit history: ..
 */
public class LightClient extends Client{

    private boolean switchedOn = false;
    private Light light;
    /**
     * Light Client Constructor.
     */
    public LightClient() {
        super();
        serviceType = "_light._udp.local.";
        ui = new LightUI(this);
        name = "Light";
    }

    public void deviceInfo(){
        
    }
    
    public void switchOnLight() {
        if (!switchedOn) {
            String a = sendMessage("SWITCHON");
            if (a.equals(OK)) {
                
                ui.updateArea("Light Switched On");
                switchedOn = true;
            }
        } else {
            ui.updateArea("Light already Switched On");
        }
    }

    public void changeBrightness() {
        
            String a = sendMessage("BRIGHTNESS");
            if (a.equals(OK)) {
                //switchedOn = true;
                
                //generating a random number for brightness 0 - 100
                Random random = new Random();
                int randomNumber = random.nextInt((100 - 0) + 1) + 0;
                ui.updateArea("Brightness Changed: " +randomNumber+ "%");
            } 
    }
    
    @Override
    public void updatePoll(String msg) {
        if (msg.equals("Battery Low Light Switched off")) {
            switchedOn = false;
        }
    }

    @Override
    public void disable() {
        super.disable();
        ui = new LightUI(this);
        switchedOn = false;
    }
}
