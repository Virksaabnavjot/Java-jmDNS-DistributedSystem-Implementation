package nsv.sms;

import java.util.List;

/**
 *
 * @author Soffyan Ali Class description: This class describes the Mobile Phone
 * and the functionality it supports Edited: 1st may 2017, Navjot singh at 6:46
 * pm
 */
public class MobilePhone {

    private String deviceName, network, call;
    /*using string for call all through in this prototype as we are not making 
    any calls its just demo, in order to avoid parsing at different stages.*/
    private int batteryStatus, brightness, volume;
    private boolean swichedOn, screenLocked, chargerPlugged, onMute;

    public MobilePhone() {
        //default constructor
    }

    public MobilePhone(String call, int brightness, int volume) {
        this.deviceName = "Nav's Iphone 5s";
        this.network = "3 Ireland";
        this.call = call;
        this.batteryStatus = 89;
        this.brightness = brightness;
        this.volume = volume;
        this.swichedOn = true;
        this.screenLocked = true;
        this.chargerPlugged = true;
        this.onMute = false;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public int getBatteryStatus() {
        return batteryStatus;
    }

    public void setBatteryStatus(int batteryStatus) {
        this.batteryStatus = batteryStatus;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isSwichedOn() {
        return swichedOn;
    }

    public void setSwichedOn(boolean swichedOn) {
        this.swichedOn = swichedOn;
    }

    public boolean isScreenLocked() {
        return screenLocked;
    }

    public void setScreenLocked(boolean screenLocked) {
        this.screenLocked = screenLocked;
    }

    public boolean isChargerPlugged() {
        return chargerPlugged;
    }

    public void setChargerPlugged(boolean chargerPlugged) {
        this.chargerPlugged = chargerPlugged;
    }

    public boolean isOnMute() {
        return onMute;
    }

    public void setOnMute(boolean onMute) {
        this.onMute = onMute;
    }
}
