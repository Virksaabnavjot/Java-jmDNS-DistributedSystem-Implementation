package nsv.sms;

import java.util.List;

/**
 *
 * @author Soffyan Ali Class description: This class describes the Mobile Phone
 * and the functionality it supports
 */

public class MobilePhone {

    private String deviceName, network;
    private int batteryStatus, brightness, volume;
    private boolean swichedOn, screenLocked, chargerPlugged, onMute;
    private List<String> call, message;

    public MobilePhone() {

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

    public List<String> getCall() {
        return call;
    }

    public void setCall(List<String> call) {
        this.call = call;
    }

    public List<String> getMessage() {
        return message;
    }

    public void setMessage(List<String> message) {
        this.message = message;
    }

}