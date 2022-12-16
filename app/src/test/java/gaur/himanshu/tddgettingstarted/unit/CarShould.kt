package gaur.himanshu.tddgettingstarted.unit

import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.verify
import gaur.himanshu.tddgettingstarted.Car
import gaur.himanshu.tddgettingstarted.Engine
import org.junit.Test
import org.mockito.Mockito.mock

class CarShould {

    private val engine: Engine = mock(Engine::class.java)
    private val car:Car = Car(fuel = 10.0,engine)

    @Test
    fun looseFuelWhenTurnOn(){
        car.turnOn()
        assert(true){
            car.fuel == 9.0
        }

    }

    @Test
    fun carTurnOnAlsoTurnOnEngine(){
        car.turnOn()
        verify(engine,times(1)).turnOn()

    }

}