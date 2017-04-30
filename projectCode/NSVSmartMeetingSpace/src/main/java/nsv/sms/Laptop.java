package nsv.sms;

import java.util.Random;

/**
 *
 * @author Navjot Singh
 * Class description: This class describes the laptop device and the functionality it supports
 */
public class Laptop {
    private String deviceName, deviceLocation;
    private int batteryStatus, brightness, volume;
    private boolean swichedOn, chargerPlugged;
    
    public Laptop(){
        
    }
    
    public Laptop(int volume, boolean switchedOn){
        this.deviceName = "Nav's Mackbook Pro";
        this.deviceLocation = "Meeting Room: SCR 3";
        Random random = new Random();
        //generating random number 1-100
        int randomNumber = random.nextInt((100 - 0) + 1) + 0;
        this.brightness = randomNumber;
        this.volume = volume;
        this.swichedOn = switchedOn;
        this.chargerPlugged = true;
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

    public boolean isChargerPlugged() {
        return chargerPlugged;
    }

    public void setChargerPlugged(boolean chargerPlugged) {
        this.chargerPlugged = chargerPlugged;
    }
    
}
