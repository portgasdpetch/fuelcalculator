package pluginsplitwise

import java.util.Scanner

fun main() {
    val fc = FuelCalculator()
    val sc = Scanner(System.`in`)
    print("Enter number of vehicle(s) : ")
    fc.vehicleQuantity = sc.nextInt()
    fc.vehicleDistances()
    fc.consumeVehicles()
    print("Enter gas's price : ")
    fc.gasPrice = sc.nextDouble()
    print("Number of people : ")
    fc.people = sc.nextInt()
    fc.printEachVehicleDistance()
    fc.printAvgConsumption()
    fc.calAndPrintConsumption()
    fc.printTotalGasConsume()
    fc.printCostPerDistance()
    fc.printEachVehicleConsume()
    fc.printTotalPrice()
    fc.printPricePerPerson()
    sc.nextLine()
    println("\nPress Enter to exit")
    sc.nextLine()
    println("Bye")
    sc.close()
}

