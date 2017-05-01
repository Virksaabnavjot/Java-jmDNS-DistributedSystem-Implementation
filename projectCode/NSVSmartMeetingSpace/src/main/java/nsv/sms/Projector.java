package nsv.sms;

import java.util.List;

/**
 *
 * @author Navjot Singh Class description: This class describes the projector
 * device and the functionality it supports
 */
public class Projector {

    private String deviceName, deviceLocation, resolution, currentlyProjectedFile;
    private boolean switchedOn;
    private List<String> connectionType;
    private String currentConnectionType;

    public Projector() {
    
    }
    
    public Projector(List<String> connectionType, String currentConnectionType){
        this.deviceName = "Projector";
        this.deviceLocation = "SCR2";
        this.resolution = "1024px";
        this.currentlyProjectedFile = "Myfile.docx";
        this.switchedOn = true;
        this.connectionType = connectionType; 
        this.currentConnectionType = currentConnectionType;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceLocation() {
        return deviceLocation;
    }

    public void setDeviceLocation(String deviceLocation) {
        this.deviceLocation = deviceLocation;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getCurrentlyProjectedFile() {
        return currentlyProjectedFile;
    }

    public void setCurrentlyProjectedFile(String currentlyProjectedFile) {
        this.currentlyProjectedFile = currentlyProjectedFile;
    }

    public boolean isSwitchedOn() {
        return switchedOn;
    }

    public void setSwitchedOn(boolean switchedOn) {
        this.switchedOn = switchedOn;
    }

    public List<String> getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(List<String> connectionType) {
        this.connectionType = connectionType;
    }

    public String getCurrentConnectionType() {
        return currentConnectionType;
    }

    public void setCurrentConnectionType(String currentConnectionType) {
        this.currentConnectionType = currentConnectionType;
    }
}
