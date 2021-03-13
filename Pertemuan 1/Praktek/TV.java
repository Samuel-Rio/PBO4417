public class TV {
    int channel;
    int volumeLevel;
    boolean on;
    
    TV(){
        this.channel = 1;
        this.volumeLevel = 3;
        this.on = false;
    }
    
    public void turnOn(){
        this.on = true;
    }
    public void turnOff(){
        this.on = false;
    }
    public void setChannel(int channel){
        this.channel = channel;
    }
    public void setVolumeLevel(int volumeLevel){
        this.volumeLevel = volumeLevel;
    }
    public void channelUp(){
        if(this.channel < 120){
            this.channel += 1;
        }
    }
    public void channelDown(){
        if(this.channel > 1){
            this.channel -= 1;
        }
    }
    public void volumeUp(){
        if(this.volumeLevel < 7){
            this.volumeLevel += 1;
        }
    }
    public void volumeDown(){
        if(this.volumeLevel > 1){
            this.volumeLevel -= 1;
        }
    }
}
