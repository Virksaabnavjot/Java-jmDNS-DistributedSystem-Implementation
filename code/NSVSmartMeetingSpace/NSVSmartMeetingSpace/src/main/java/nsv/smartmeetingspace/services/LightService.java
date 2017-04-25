package nsv.smartmeetingspace.services;

import com.google.gson.Gson;
import java.util.Arrays;
import java.util.Timer;
import java.util.TimerTask;
import nsv.smartmeetingspace.Light;
import nsv.smartmeetingspace.serviceUI.ServiceUI;

/**
 * @author Navjot singh virk, 18th april 2017, 4:37 am Class description: This
 * service class specify what operations can be supported on PDAs. Edit history:
 * 25 april, 2:03am by Navjot singh
 *
 */
public class LightService extends Service {

    private Light light;
    private Gson gson;
    private static ServiceUI ui;
    private final Timer timer;
    private int loading;

    //constructor
    public LightService(String name) {
        super(name, "_light._udp.local.");
        timer = new Timer();
        loading = 0;
        ui = new ServiceUI(this, name);
        light = new Light(50, true, Arrays.asList("Cool", "Bright DayLight, Dark"));
        gson = new Gson();
    }

    @Override
    public void performAction(String a) {
        if (a.equals("get_status")) {
            sendBack(getStatus());
        } else if (a.equals("on")) {
            timer.schedule(new RemindTask(), 0, 2000);
            sendBack("OK");
            ui.updateArea("Light turning ON");
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
        new LightService("Light Service");
    }

}
