

public class InternalCombustionEngine extends Vehicle {
    private double kilometersPerLiter, maxLitersInTank, currentLitersInTank;

    public InternalCombustionEngine(String make, String model, String color, double odometer, double kilometersPerLiter
            , double maxLitersInTank, double currentLitersInTank) {
        super(make, model, color, odometer);
        this.kilometersPerLiter = kilometersPerLiter ;
        this.kilometersPerLiter = maxLitersInTank ;
        this.currentLitersInTank= 0;
    }

    public InternalCombustionEngine(String expectedMake, String expectedModel, String expectedColor, double kilometersPerLiter, double kilometersPerLiter1, double currentLitersInTank) {
    }

    public double getKilometersPerLiter() {
        return kilometersPerLiter;
    }

    public void setKilometersPerLiter(double kilometersPerLiter) {
        this.kilometersPerLiter = kilometersPerLiter;
    }

    public double getMaxLitersInTank() {
        return maxLitersInTank;
    }

    public void setMaxLitersInTank(double maxLitersInTank) {
        this.maxLitersInTank = maxLitersInTank;
    }

    public double getCurrentLitersInTank() {
        return currentLitersInTank;
    }

    public void setCurrentLitersInTank(double currentLitersInTank) {
        this.currentLitersInTank = currentLitersInTank;
    }

    private void validateCurrentKilowattsInBattery() {
        double currentKilowattsInBattery = 0;
    }
    public void addGas (double litersOfGas){
        currentLitersInTank+= litersOfGas;
        if (currentLitersInTank>maxLitersInTank){
            this.currentLitersInTank= maxLitersInTank;
        }
    }

    @Override
    public boolean drive (int kilometersToDrive){
        double litersNeeded= kilometersToDrive/kilometersPerLiter;
        if (litersNeeded > currentLitersInTank){
            currentLitersInTank = 0;
            return false;}
        else { currentLitersInTank -= litersNeeded;
            return true;
        }
    }
}
