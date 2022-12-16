package gaur.himanshu.tddgettingstarted.acceptance

import gaur.himanshu.tddgettingstarted.Car
import gaur.himanshu.tddgettingstarted.Engine
import org.junit.Test

class CarFeature {

    private val engine:Engine = Engine(isTurnOn = false, temprature = 273.0)
    private val car: Car = Car(fuel = 5.0,engine)

    @Test
    fun carTurnOnAndReduceFuel() {

        car.turnOn()

        assert(true) {
            car.fuel == 4.0
        }

    }

    @Test
    fun carTurnOnIncreaseEngineTemprature() {
        car.turnOn()
        assert(true) {
            car.engine.isTurnOn
        }
        assert(true) {
            car.engine.temprature == 10.0
        }

    }

}


