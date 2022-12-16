package gaur.himanshu.tddgettingstarted.unit

import gaur.himanshu.tddgettingstarted.Engine
import org.junit.Test

class EngineShould {

    private val engine:Engine= Engine(isTurnOn = false, temprature = 273.0)

    @Test
    fun turnOnIncreaseTemprature(){
        engine.turnOn()

        assert(true){
            engine.isTurnOn
        }

        assert(true){
            engine.temprature == 274.0
        }

    }

}