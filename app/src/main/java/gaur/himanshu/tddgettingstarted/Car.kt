package gaur.himanshu.tddgettingstarted

class Car(var fuel:Int,val engine: Engine) {
    fun turnOn() {
        fuel--
        engine.turnOn()
    }


}