fun main() {

    println("Welcome to the App!")
    println()
    println("1. Go to Profile")
    println("2. Exit")
    print("Choose an option: ")

    val choice = readLine()

    if (choice == "1") {

        println()
        println("Opening ProfileActivity...")
        println()
        println("This is your profile screen.")
        println()
        println("1. Back")
        print("Choose an option: ")

        val back = readLine()

        if (back == "1") {
            println()
            println("Returning to MainActivity...")
            println()
            println("Welcome to the App!")
        }

    } else {

        println()
        println("Thank you for using the app!")

    }
}
