package nsv.sms;

import java.util.List;

/**
 *
 * @author Navjot Singh 
 * Class description: This class describes the Light device
 * and the functionality it supports
 */
public class Light {

    private String deviceName, deviceLocation, powerConsumption, currentMode;
    private int brightness;
    private boolean swichedOn;
    private List<String> modes;

    //default constructor
    public Light() {

    }

    //parameterised constructor - overriding default constructor
    public Light(int brightness, boolean switchedOn, List<String> modes) {
        this.deviceName = "LightBulb";
        this.deviceLocation = "MeetingRoom 3";
        this.powerConsumption = "40W";
        this.currentMode = modes.get(0).toString();
        this.brightness = brightness;
        this.swichedOn = switchedOn;
        this.modes = modes;

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

    public String getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(String powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public boolean isSwichedOn() {
        return swichedOn;
    }

    public void setSwichedOn(boolean swichedOn) {
        this.swichedOn = swichedOn;
    }

    public String isCurrentMode() {
        return currentMode;
    }

    public void setCurrentMode(String currentMode) {
        this.currentMode = currentMode;
    }

    public List<String> getModes() {
        return modes;
    }

    public void setModes(List<String> modes) {
        this.modes = modes;
    }

}
