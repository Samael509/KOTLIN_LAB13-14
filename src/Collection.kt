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
    val solarSystem = mutableListOf(
        "mercury", "venus", "earth", "mars", "jupiter",
        "saturn", "uranus", "neptune"
    )
    println(newSolarSystem.size)
    println(solarSystem[2])
    println(solarSystem.get(3))
    println(solarSystem.indexOf("earth"))
    println(solarSystem.indexOf("pluto"))

    for (planet in solarSystem) {
        println(planet)
    }
    solarSystem.add("pluto")
    solarSystem.add(3, "pluto")
    solarSystem[3] = "future moon"
    println(solarSystem[3])
    println(solarSystem[9])
    solarSystem.removeAt(9)
    println(solarSystem.contains("pluto"))
    println("future moon" in solarSystem)
}