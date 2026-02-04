val rockPlanets = arrayOf<String>("mercury", "venus", "earth", "mars")
val gasPlanets = arrayOf<String>("jupiter", "saturn", "uranus", "neptune")
val solarSystem = rockPlanets + gasPlanets

val newSolarSystem = arrayOf(
    "mercuy",
    "venus",
    "earth",
    "mars",
    "jupiter",
    "saturn",
    "uranus",
    "neptune",
    "pluto"
)

fun main(){
    println(newSolarSystem[8])
}