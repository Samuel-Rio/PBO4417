public class MotorVehicle extends Vehicle {
    public int sizeofEngine = 1;
    public String licencePlate = "H 1 IDN";
    
    public MotorVehicle() {
    }

    public MotorVehicle(int sizeEng, String lcPlate) {
        sizeofEngine = sizeEng;
        licencePlate = lcPlate;
    }

    public void setSizeofEngine(int sizeEng) {
        sizeofEngine = sizeEng;
    }
    public void setlicencePlate(String lcPlate) {
        licencePlate = lcPlate;
    }

    public int getSizeofEngine() {
        return sizeofEngine;
    }

    public String getLicencePlate() {
        return licencePlate;
    }
}