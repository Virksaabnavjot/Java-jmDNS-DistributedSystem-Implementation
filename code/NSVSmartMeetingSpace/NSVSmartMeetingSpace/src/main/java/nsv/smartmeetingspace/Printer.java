package nsv.smartmeetingspace;

/**
 *
 * @author Navjot Singh 
 * Class description: This class describes the printer
 * device and the functionality it supports
 */
public class Printer {

    private String deviceName, deviceLocation, documentName;
    private int inkLevel, noOfCopies;
    private boolean swichedOn, paper, printing;

    public Printer() {

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

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public int getInkLevel() {
        return inkLevel;
    }

    public void setInkLevel(int inkLevel) {
        this.inkLevel = inkLevel;
    }

    public int getNoOfCopies() {
        return noOfCopies;
    }

    public void setNoOfCopies(int noOfCopies) {
        this.noOfCopies = noOfCopies;
    }

    public boolean isSwichedOn() {
        return swichedOn;
    }

    public void setSwichedOn(boolean swichedOn) {
        this.swichedOn = swichedOn;
    }

    public boolean isPaper() {
        return paper;
    }

    public void setPaper(boolean paper) {
        this.paper = paper;
    }

    public boolean isPrinting() {
        return printing;
    }

    public void setPrinting(boolean printing) {
        this.printing = printing;
    }

}
