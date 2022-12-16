package gaur.himanshu.tddgettingstarted.acceptance

import gaur.himanshu.tddgettingstarted.Car
import gaur.himanshu.tddgettingstarted.Engine
import org.junit.Assert
import org.junit.Test

class CarFeature {

    private val engine:Engine = Engine(isTurnOn = false, temprature = 273)
    private val car: Car = Car(fuel = 10,engine)

    @Test
    fun carTurnOnLooseFuel(){
        car.turnOn()

        Assert.assertEquals(9,car.fuel)
    }


    @Test
    fun carTurnOnIncreasesEngineTemprature(){
        car.turnOn()

        Assert.assertEquals(true,car.engine.isTurnOn)

        Assert.assertEquals(274,car.engine.temprature)
    }


}