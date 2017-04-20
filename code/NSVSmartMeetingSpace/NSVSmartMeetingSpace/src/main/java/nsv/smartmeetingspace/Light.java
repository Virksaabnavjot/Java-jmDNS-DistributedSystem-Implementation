package nsv.smartmeetingspace;

import java.util.List;

/**
 *
 * @author Navjot Singh Class description: This class describes the Light device
 * and the functionality it supports
 */
public class Light {

    private String deviceName, deviceLocation, powerConsumption;
    private int brightness;
    private boolean swichedOn, currentMode;
    private List<String> modes;

    public Light() {

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

    public boolean isCurrentMode() {
        return currentMode;
    }

    public void setCurrentMode(boolean currentMode) {
        this.currentMode = currentMode;
    }

    public List<String> getModes() {
        return modes;
    }

    public void setModes(List<String> modes) {
        this.modes = modes;
    }

}
