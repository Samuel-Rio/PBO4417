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
				
				
        Manusia orang1 = new Manusia("Samuel Rio");
        System.out.println(orang1.nama_saya());
		
        Manusia tvku = new Manusia();
        orang1.beli_tv();
        System.out.println(orang1.cek_tv());
		
        orang1.jual_tv();
        System.out.println(orang1.cek_tv());
    }
}

