/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsv.sms.reusable;

import java.io.IOException;
import java.net.ServerSocket;

/**
 *
 * @author Navjot Singh
 */
public class FreePort {
    
    public FreePort(){
        //default constructor
    }
    
    public static int findFreePort() throws IOException {
        ServerSocket server = new ServerSocket(0);
        int port = server.getLocalPort();
        server.close();
        return port;
    }
    
}
