package nsv.smartmeetingspace.services;

import java.util.Timer;
import java.util.TimerTask;
import nsv.smartmeetingspace.serviceUI.ServiceUI;
import nsv.smartmeetingspace.services.Service;
/**
 * @author Navjot singh virk, 18th april 2017, 4:35 am
 * Class description: This service class specify what operations can be supported on laptops.
 * Edit history: ..
 */

public class LaptopService extends Service {

    private final Timer timer;
    private int loading;

    public LaptopService(String name) {
        super(name, "_laptop._udp.local.");
        timer = new Timer();
        loading = 0;
        ui = new ServiceUI(this, name);
    }

    @Override
    public void performAction(String a) {
        if (a.equals("get_status")) {
            sendBack(getStatus());
        } else if (a.equals("on")) {
            timer.schedule(new RemindTask(), 0, 2000);
            sendBack("OK");
            ui.updateArea("Laptop turning ON");
        } else {
            sendBack(BAD_COMMAND + " - " + a);
        }
    }

    class RemindTask extends TimerTask {

        @Override
        public void run() {
            if (loading < 100) {
                loading += 10;
            }
        }
    }

    @Override
    public String getStatus() {
        return "Loading " + loading + "% complete.";
    }

    public static void main(String[] args) {
        new LaptopService("LaptopService");
    }
}
