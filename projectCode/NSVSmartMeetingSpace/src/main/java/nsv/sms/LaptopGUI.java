package nsv.sms;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import javax.jmdns.JmDNS;
import javax.jmdns.ServiceInfo;

/**
 *
 * @author Navjot Virk Class description: Laptop device service class with a
 * light weight gui to display information. The class is done with the help of
 * project example available on https://moodle.ncirl.ie by NCI.
 */
public class LaptopGUI extends javax.swing.JFrame {

    private static Laptop laptop;
    private static JmDNS jmdns;
    private static Gson gson;
    private static int volumeSliderNumber;
    private static PrintWriter out;
    private static BufferedReader in;

    private static String SERVICE_TYPE;
    private static String SERVICE_NAME;
    private static int SERVICE_PORT;
    private static int my_backlog = 5;
    private static ServerSocket my_serverSocket;
    private static Socket socket;
    private static String status;
    private static ServiceInfo info;
    private final String BAD_COMMAND = "bad Command";
    private static String STATUS_REQUEST = "get_status";

    /**
     * Creates new form LaptopGUI
     */
    public LaptopGUI() {
        initComponents();
        laptop = new Laptop(20, true);
        gson = new Gson();
        dnLbl.setText(laptop.getDeviceName());
        dlLbl.setText(laptop.getDeviceLocation());
        bsLbl.setText(Integer.toString(laptop.getBatteryStatus()));
        bLbl.setText(Integer.toString(laptop.getBrightness()));
        vLbl.setText(Integer.toString(laptop.getVolume()));
        //reference Boolean to string http://beginnersbook.com/2015/05/java-boolean-to-string/
        soLbl.setText(String.valueOf(laptop.isSwichedOn()));
        cpLbl.setText(String.valueOf(laptop.isChargerPlugged()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        laptopScreenPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        laptopScreenLbl = new javax.swing.JLabel();
        controlsList = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        switchOnBtn = new javax.swing.JButton();
        volumeSlider = new javax.swing.JSlider();
        bsLbl = new javax.swing.JLabel();
        vLbl = new javax.swing.JLabel();
        bLbl = new javax.swing.JLabel();
        cpLbl = new javax.swing.JLabel();
        soLbl = new javax.swing.JLabel();
        dnLbl = new javax.swing.JLabel();
        dlLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        laptopScreenPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Laptop ");

        laptopScreenLbl.setText("laptop screen");

        javax.swing.GroupLayout laptopScreenPanelLayout = new javax.swing.GroupLayout(laptopScreenPanel);
        laptopScreenPanel.setLayout(laptopScreenPanelLayout);
        laptopScreenPanelLayout.setHorizontalGroup(
            laptopScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(laptopScreenPanelLayout.createSequentialGroup()
                .addGroup(laptopScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(laptopScreenPanelLayout.createSequentialGroup()
                        .addGap(208, 208, 208)
                        .addComponent(jLabel1))
                    .addGroup(laptopScreenPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(laptopScreenLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        laptopScreenPanelLayout.setVerticalGroup(
            laptopScreenPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(laptopScreenPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(laptopScreenLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel2.setText("Battery Status:");

        jLabel3.setText("Volume:");

        jLabel4.setText("Brightness:");

        jLabel5.setText("Charger Plugged:");

        jLabel6.setText("Switched On:");

        jLabel7.setText("Device Name:");

        jLabel8.setText("Device Location:");

        switchOnBtn.setText("Switch On/off");
        switchOnBtn.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                switchOnBtnStateChanged(evt);
            }
        });
        switchOnBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                switchOnBtnMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                switchOnBtnMouseClicked(evt);
            }
        });
        switchOnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchOnBtnActionPerformed(evt);
            }
        });

        volumeSlider.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                volumeSliderMouseDragged(evt);
            }
        });

        bsLbl.setText("jLabel9");

        vLbl.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        vLbl.setText("jLabel10");

        bLbl.setText("jLabel11");

        cpLbl.setText("jLabel12");

        soLbl.setText("jLabel13");

        dnLbl.setText("jLabel14");

        dlLbl.setText("jLabel15");

        javax.swing.GroupLayout controlsListLayout = new javax.swing.GroupLayout(controlsList);
        controlsList.setLayout(controlsListLayout);
        controlsListLayout.setHorizontalGroup(
            controlsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlsListLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(controlsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(controlsListLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bsLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(switchOnBtn)
                        .addGap(75, 75, 75))
                    .addGroup(controlsListLayout.createSequentialGroup()
                        .addGroup(controlsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(controlsListLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(soLbl))
                            .addGroup(controlsListLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dnLbl))
                            .addGroup(controlsListLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dlLbl))
                            .addGroup(controlsListLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bLbl))
                            .addGroup(controlsListLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cpLbl)))
                        .addContainerGap(291, Short.MAX_VALUE))
                    .addGroup(controlsListLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(vLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(volumeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        controlsListLayout.setVerticalGroup(
            controlsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(controlsListLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(controlsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(controlsListLayout.createSequentialGroup()
                        .addGroup(controlsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(switchOnBtn)
                            .addComponent(bsLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(controlsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(vLbl)))
                    .addComponent(volumeSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cpLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(soLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(dnLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(controlsListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(dlLbl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(laptopScreenPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(controlsList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(laptopScreenPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(controlsList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void volumeSliderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volumeSliderMouseDragged
        volumeSliderNumber = volumeSlider.getValue();
        vLbl.setText(Integer.toString(volumeSliderNumber));
        laptop.setVolume(volumeSliderNumber);
        out.print(gson.toJson(laptop));
    }//GEN-LAST:event_volumeSliderMouseDragged

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        //unregistering Service on window close
        jmdns.unregisterService(info);
        try {
            my_serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_formWindowClosed

    private void switchOnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchOnBtnActionPerformed
        boolean switchedOn = true;
        if (switchedOn == true) {
            laptopScreenLbl.setText("Laptop is Switched on");
            laptop.setSwichedOn(true);
            out.println(gson.toJson(laptop));
            switchedOn = false;
        } else if (switchedOn == false) {
            laptopScreenLbl.setText("Laptop is Switched off");
            laptop.setSwichedOn(false);
            out.println(gson.toJson(laptop));
            switchedOn = true;
        } else {
            laptopScreenLbl.setText("Need Repair");
        }
    }//GEN-LAST:event_switchOnBtnActionPerformed

    private void switchOnBtnStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_switchOnBtnStateChanged

    }//GEN-LAST:event_switchOnBtnStateChanged

    private void switchOnBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchOnBtnMouseClicked

    }//GEN-LAST:event_switchOnBtnMouseClicked

    private void switchOnBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_switchOnBtnMousePressed

    }//GEN-LAST:event_switchOnBtnMousePressed

    public static int findFreePort() throws IOException {
        ServerSocket server = new ServerSocket(0);
        int port = server.getLocalPort();
        server.close();
        return port;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LaptopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LaptopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LaptopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LaptopGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LaptopGUI().setVisible(true);
            }
        });
        SERVICE_NAME = "LaptopService";
        try {
            SERVICE_PORT = findFreePort();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        SERVICE_TYPE = "_laptop._udp.local.";
        try {
            my_serverSocket = new ServerSocket(SERVICE_PORT, my_backlog);
        } catch (IOException e) {
            try {
                SERVICE_PORT = findFreePort();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            e.printStackTrace();
        }
        try {
            //creating a JmDNS instance
            jmdns = JmDNS.create(InetAddress.getLocalHost());
            info = ServiceInfo.create(SERVICE_TYPE, SERVICE_NAME, SERVICE_PORT, "");

            //registering service
            jmdns.registerService(info);

            /**
             * listen the server socket forever and prints each incoming message
             * to the console.
             */
            try {
                socket = my_serverSocket.accept();
                out = new PrintWriter(socket.getOutputStream());

                in = new BufferedReader(new InputStreamReader(socket
                        .getInputStream()));

                String msg = in.readLine();
                in.close();

                out.println(gson.toJson(laptop));
                socket.close();

            } catch (IOException ioe) {
                ioe.printStackTrace();
            } catch (SecurityException se) {
                se.printStackTrace();
            } finally {
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bLbl;
    private javax.swing.JLabel bsLbl;
    private javax.swing.JPanel controlsList;
    private javax.swing.JLabel cpLbl;
    private javax.swing.JLabel dlLbl;
    private javax.swing.JLabel dnLbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel laptopScreenLbl;
    private javax.swing.JPanel laptopScreenPanel;
    private javax.swing.JLabel soLbl;
    private javax.swing.JButton switchOnBtn;
    private javax.swing.JLabel vLbl;
    private javax.swing.JSlider volumeSlider;
    // End of variables declaration//GEN-END:variables
}
