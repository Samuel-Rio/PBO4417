public class TestTV {
    public static void main(String[] args){
        TV tv1 = new TV();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolumeLevel(3);
        
        TV tv2 = new TV();
        tv2.turnOn();
        tv2.channelUp();
        tv2.channelUp();
        tv2.volumeUp();
        
        System.out.println("Chanel TV Pertama adalah " + tv1.channel + 
                " dan volumenya adalah " + tv1.volumeLevel);
        System.out.println("Chanel TV kedua adalah " + tv2.channel +
                " dan volumenya adalah " + tv2.volumeLevel);
    }
}
