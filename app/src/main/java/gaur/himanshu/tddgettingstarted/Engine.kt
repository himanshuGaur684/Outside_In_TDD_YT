package gaur.himanshu.tddgettingstarted

class Engine(var isTurnOn: Boolean, var temprature: Int) {
    fun turnOn() {
        isTurnOn = true
        temprature++
    }

}