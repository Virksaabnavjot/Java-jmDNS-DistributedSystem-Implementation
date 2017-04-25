package nsv.smartmeetingspace.services;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;
import nsv.smartmeetingspace.Light;

/**
 * @author Navjot singh virk, 18th april 2017, 4:37 am Class description: This
 * service class specify what operations can be supported on PDAs. Edit history:
 * 25 april, 2:03am by Navjot singh
 *
 */
public class LightService {

    private Light light;
    private static JmDNS jmDNS;

    //constructor
    public LightService() {
        light = new Light(50, true, Arrays.asList("Cool", "Bright DayLight, Dark"));
    }

    public static void main(String args[]) {
        //error handling through try-catch
        try {
            //creating a JmDNS instance
            jmDNS = JmDNS.create(InetAddress.getLocalHost());
            
            //regestering a service
            ServiceInfo si = ServiceInfo.create("light.tcp.local.", "Light", 1111, "Navsingh 40W Bulb");
            jmDNS.registerService(si);
            
        } catch (IOException ex) {
            Logger.getLogger(LightService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
