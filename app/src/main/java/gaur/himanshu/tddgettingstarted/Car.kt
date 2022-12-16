package gaur.himanshu.tddgettingstarted

class Car(var fuel:Double,val engine: Engine) {
    fun turnOn() {
        fuel-1
        engine.turnOn()
    }
}