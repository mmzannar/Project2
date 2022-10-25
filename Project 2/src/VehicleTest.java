import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;



class VehicleTest {
    @org.junit.jupiter.api.Test

    void drive() {
        //arrange
        //act
        //assert
    }

    public VehicleTest() {
    }

    @org.junit.jupiter.api.Test

    void testConstructorAndGets(){
        //arrange
        String expectedMake = "Ford";
        String expectedModel = "F150";
        String expectedColor = "black";

   // Act
        Vehicle testCar = new Vehicle (expectedMake, expectedModel, expectedColor);

        String actualMake=testCar.getMake();
        String actualModel=testCar.getModel();
        String actualColor=testCar.getMake();
        // assert

        assertEquals(expectedMake, actualMake);
        assertEquals(expectedModel, actualModel);
        assertEquals(expectedColor, actualColor);



    }

}
