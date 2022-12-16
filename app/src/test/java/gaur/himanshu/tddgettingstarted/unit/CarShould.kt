package gaur.himanshu.tddgettingstarted.unit

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.times
import com.nhaarman.mockitokotlin2.verify
import gaur.himanshu.tddgettingstarted.Car
import gaur.himanshu.tddgettingstarted.Engine
import org.junit.Assert
import org.junit.Test

class CarShould {

    private val engine = mock<Engine>()
    private val car:Car = Car(fuel = 10,engine)

    @Test
    fun looseFuelWhenTurnOn(){
        car.turnOn()
        Assert.assertEquals(9,car.fuel)

    }

    @Test
    fun carTurnOnEngine(){
        car.turnOn()
        verify(engine, times(1)).turnOn()
    }

}