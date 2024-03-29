package nsv.smartmeetingspace.clients;

import java.io.IOException;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceEvent;
import javax.jmdns.ServiceInfo;
import javax.jmdns.ServiceListener;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;
import nsv.smartmeetingspace.clientUI.ClientManagerUI;

/**
 * @author Dr. Dominic Carr
 * This file is a part of ProjectSample made available by National College of Ireland 
 * available at https://moodle.ncirl.ie
 */
public class ClientManager implements ServiceListener {

    private final ClientManagerUI ui;
    private JmDNS jmdns;
    
    private final LightClient client = new LightClient();
    //private final LaptopClient client = new LaptopClient();
    //private final MobilePhoneClient client = new MobilePhoneClient();
    //private final PDAClient client = new PDAClient();
    //private final ProjectorClient client = new ProjectorClient();
    
    public ClientManager() {
        try {
            jmdns = JmDNS.create(InetAddress.getLocalHost());
            //jmdns.addServiceListener(client.getServiceType(), this);
            jmdns.addServiceListener(client.getServiceType(), this);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ui = new ClientManagerUI(this);
    }

    public void end() {
        try {
            jmdns.close();
        } catch (IOException ex) {
            Logger.getLogger(ClientManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void serviceAdded(ServiceEvent arg0) {
        System.out.println(arg0);
        arg0.getDNS().requestServiceInfo(arg0.getType(), arg0.getName(), 0);
    }

    public void serviceRemoved(ServiceEvent arg0) {
        System.out.println(arg0);
        String type = arg0.getType();
        String name = arg0.getName();
        ServiceInfo newService = null;
        if (client.getServiceType().equals(type) && client.hasMultiple()) {
            if (client.isCurrent(name)) {
                ServiceInfo[] a = jmdns.list(type);
                for (ServiceInfo in : a) {
                    if (!in.getName().equals(name)) {
                        newService = in;
                    }
                }
                client.switchService(newService);
            }
            client.remove(name);
        } else if (client.getServiceType().equals(type)) {
            ui.removePanel(client.returnUI());
            client.disable();
            client.initialized = false;
        }
    }

    public void serviceResolved(ServiceEvent arg0) {
        System.out.println(arg0);
        String address = arg0.getInfo().getHostAddress();
        int port = arg0.getInfo().getPort();
        String type = arg0.getInfo().getType();

        if (client.getServiceType().equals(type) && !client.isInitialized()) {
            client.setUp(address, port);
            ui.addPanel(client.returnUI(), client.getName());
            client.setCurrent(arg0.getInfo());
            client.addChoice(arg0.getInfo());
        } else if (client.getServiceType().equals(type)
                && client.isInitialized()) {
            client.addChoice(arg0.getInfo());

        }
    }

    public static void main(String[] args) {
        new ClientManager();

    }
}