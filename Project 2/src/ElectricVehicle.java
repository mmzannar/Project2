

    public class ElectricVehicle extends Vehicle {
    private double maxKilowattsInBattery, kilometersPerKilowattHour, currentKilowattsInBattery;

        public ElectricVehicle(String make, String model, String color, double odometer, double kilometersPerKilowattHour
        , double maxKilowattsInBattery, double currentKilowattsInBattery) {
            super(make, model, color, odometer);
            this.kilometersPerKilowattHour = kilometersPerKilowattHour;
            this.maxKilowattsInBattery = maxKilowattsInBattery;
            this.currentKilowattsInBattery= 0;
        }

        public ElectricVehicle(String expectedMake, String expectedModel, String expectedColor, double maxKilowattsInBattery, double kilometersPerKilowattHour, double currentKilowattsInBattery) {
        }

        public double getKilometersPerKilowattHour() {
        return kilometersPerKilowattHour;
    }

    public void setKilometersPerKilowattHour(double kilometersPerKilowattHour) {
        this.kilometersPerKilowattHour = kilometersPerKilowattHour;
    }

    public double getMaxKilowattsInBattery() {
        return maxKilowattsInBattery;
    }

    public void setMaxKilowattsInBattery(double maxKilowattsInBattery) {
        this.maxKilowattsInBattery = maxKilowattsInBattery;
    }

    public double getCurrentKilowattsInBattery() {
        return currentKilowattsInBattery;
    }

    public void setCurrentKilowattsInBattery(double currentKilowattsInBattery) {
        this.currentKilowattsInBattery = currentKilowattsInBattery;
    }



    private void validateCurrentKilowattsInBattery() {
        double currentKilowattsInBattery = 0;
    }
    public void charge (double kilowattsToCharge){
            currentKilowattsInBattery+= kilowattsToCharge;
            if (currentKilowattsInBattery>maxKilowattsInBattery){
                this.currentKilowattsInBattery= maxKilowattsInBattery;
            }
    }

    @Override
        public boolean drive (int kilometersToDrive){
            double kilowatts= kilometersToDrive/kilometersPerKilowattHour;
            if (kilowatts > currentKilowattsInBattery){
                currentKilowattsInBattery = 0;
                return false;}
            else { currentKilowattsInBattery -= kilowatts;
                return true;
            }
    }
}


