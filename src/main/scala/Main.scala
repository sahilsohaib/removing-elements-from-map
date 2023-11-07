object MapRemoveProgram {
  def main(args: Array[String]): Unit = {
    var myMap: Map[String, Int] = Map("Alice" -> 25, "Bob" -> 30, "Charlie" -> 22, "David" -> 28)

    while (true) {
      println("Options:")
      println("1. Remove a key-value pair from the map")
      println("2. Show the map")
      println("3. Exit")
      print("Enter your choice (1/2/3): ")
      val choice = scala.io.StdIn.readLine()

      choice match {
        case "1" =>
          println("Enter a key to remove:")
          val key = scala.io.StdIn.readLine()
          if (myMap.contains(key)) {
            myMap -= key
            println(s"Removed key-value pair with key: $key")
          } else {
            println(s"Key '$key' not found in the map.")
          }

        case "2" =>
          if (myMap.isEmpty) {
            println("The map is empty.")
          } else {
            println("Current map:")
            myMap.foreach { case (key, value) =>
              println(s"$key -> $value")
            }
          }

        case "3" =>
          println("Exiting the program.")
          sys.exit(0)

        case _ =>
          println("Invalid choice. Please enter 1, 2, or 3.")
      }
    }
  }
}
