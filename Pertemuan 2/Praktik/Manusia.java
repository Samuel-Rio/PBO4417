class Manusia {
    private String nama;
    private boolean punyaTV;

    public Manusia() {
        nama = "noname";
        punyaTV = false;
    }

    public Manusia(String nama) {
        this.nama = nama;
    }

    public String nama_saya(){
        return nama;
    }

    public void beli_tv() {
        punyaTV = true;
    }

    public void jual_tv() {
        punyaTV = false;
    }

    public boolean cek_tv(){
        return punyaTV;
    }
}