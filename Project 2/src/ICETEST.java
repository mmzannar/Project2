import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ICETEST {

    @org.junit.jupiter.api.Test

    void testConstructorAndGets(){
        //arrange
        String expectedMake = "make";
        String expectedModel = "model";
        String expectedColor = "color";
        double kilometersPerLiter = Double.parseDouble("1000");
        double maxLitersInTank = Double.parseDouble("50");
        double currentLitersInTank = Double.parseDouble("0");


        // Act
        InternalCombustionEngine iCECar = new InternalCombustionEngine (expectedMake, expectedModel, expectedColor, kilometersPerLiter, kilometersPerLiter,
                currentLitersInTank);

        double actualKilometersPerLiter= iCECar.getKilometersPerLiter();
        double actualMaxLitersInTank= iCECar.getCurrentLitersInTank();
        double actualCurrentLitersInTank= iCECar.getCurrentLitersInTank();



        // assert



    }
    @Test
    void fuel(){}

    void drive(){}
}
