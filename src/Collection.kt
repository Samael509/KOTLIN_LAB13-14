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

fun main() {
    val solarSystem = mutableMapOf(
        "mercury" to 0,
        "venus" to 0,
        "earth" to 1,
        "mars" to 2,
        "jupiter" to 79,
        "saturn" to 82,
        "uranus" to 27,
        "neptune" to 14
    )
    solarSystem["pluto"] = 5
    println(solarSystem.size)
    solarSystem["jupiter"] = 78
    println(solarSystem["jupiter"])
//    println(newSolarSystem.size)
//    println(solarSystem[2])
//    println(solarSystem.get(3))
//    println(solarSystem.indexOf("earth"))
//    println(solarSystem.indexOf("pluto"))
//
//    for (planet in solarSystem) {
//        println(planet)
//    }
//    solarSystem.add("pluto")
//    solarSystem.add(3, "pluto")
//    solarSystem[3] = "future moon"
//    println(solarSystem[3])
//    println(solarSystem[9])
//    solarSystem.removeAt(9)
//    println(solarSystem.contains("pluto"))
//    println("future moon" in solarSystem)
}