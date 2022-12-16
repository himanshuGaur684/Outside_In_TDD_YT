package gaur.himanshu.tddgettingstarted.unit

import gaur.himanshu.tddgettingstarted.Engine
import org.junit.Assert
import org.junit.Test

class EngineShould {

    private val engine:Engine = Engine(isTurnOn = false, temprature = 273)

    @Test
    fun turnOnIncreaseTemprature(){
        engine.turnOn()

        Assert.assertEquals(true,engine.isTurnOn)

        Assert.assertEquals(274,engine.temprature)

    }

}