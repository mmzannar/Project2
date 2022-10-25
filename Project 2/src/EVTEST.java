import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class EVTEST {

    @org.junit.jupiter.api.Test

    void testConstructorAndGets(){
        //arrange
        String expectedMake = "Ford";
        String expectedModel = "F150";
        String expectedColor = "Black";
        double maxKilowattsInBattery = Double.parseDouble("1000");
        double kilometersPerKilowattHour = Double.parseDouble("10");
        double currentKilowattsInBattery = Double.parseDouble("0");


        // Act
        ElectricVehicle eVCar = new ElectricVehicle (expectedMake, expectedModel, expectedColor, maxKilowattsInBattery,
                kilometersPerKilowattHour, currentKilowattsInBattery );


        double actualKilometersPerKilowattHour= eVCar.getKilometersPerKilowattHour();
        double actualMaxKilowattsInBattery= eVCar.getMaxKilowattsInBattery();
        double actualCurrentKilowattsInBattery= eVCar.getCurrentKilowattsInBattery();
        // assert

        assertEquals(kilometersPerKilowattHour, actualKilometersPerKilowattHour);
        assertEquals(maxKilowattsInBattery, actualMaxKilowattsInBattery);
        assertEquals(currentKilowattsInBattery, actualCurrentKilowattsInBattery);


    }
    @Test
    void charge(){}


    void drive(){}
}
