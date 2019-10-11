package Enkapsulasi;

/**
 *
 * @author Rifky
 */
public class TV {
    private String power;
    private int ch;
    private int vol;
    
    public TV(){
        power = "OFF";
        ch = 0;
        vol = 0;
    }
    public TV(String power, int ch, int vol){
        this.power = power;
        this.ch = ch;
        this.vol = vol;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public int getCh() {
        return ch;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }
    
    public void printInfo(){
        System.out.println("power = "+getPower()
                            +"\nchannel = "+getCh()
                            +"\nvolume = "+getVol());
    }
    
}
