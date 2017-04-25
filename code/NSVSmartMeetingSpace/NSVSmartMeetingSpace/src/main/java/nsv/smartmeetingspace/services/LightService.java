package nsv.smartmeetingspace.services;

import java.util.Arrays;
import nsv.smartmeetingspace.Light;

/**
 * @author Navjot singh virk, 18th april 2017, 4:37 am Class description: This
 * service class specify what operations can be supported on PDAs. Edit history:
 * 25 april, 2:03am by Navjot singh
 *
 */
public class LightService {

    private Light light;

    //constructor
    public LightService() {
        light = new Light(50, true, Arrays.asList("Cool", "Bright DayLight, Dark"));
    }

}
