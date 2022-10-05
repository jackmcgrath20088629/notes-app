import java.lang.System.exit
import utils.ScannerInput


fun main(args: Array<String>) {
    runMenu()
}

fun mainMenu() : Int {
    return ScannerInput.readNextInt ("""
         > ----------------------------------
         > |        NOTE KEEPER APP         |
         > ----------------------------------
         > | NOTE MENU                      |
         > |   1) Add a note                |
         > |   2) List all notes            |
         > |   3) Update a note             |
         > |   4) Delete a note             |
         > ----------------------------------
         > |   0) Exit                      |
         > ----------------------------------
         > ==>> """.trimMargin(">"))
}

fun runMenu () {
    do {
        val option = mainMenu ()
        when (option) {
            1 -> addNote()
            2 -> listNotes()
            3 -> updateNote()
            4 -> deleteNote()
            0 -> exitApp()
            else -> println("Invalid option entered: ${option}")
        }
        } while(true)
    }

fun addNote() {
    println("You chose to add a note.")
}

fun listNotes() {
    println("You chose to list the notes.")
}

fun updateNote() {
    println("You chose to update a note.")
}
fun deleteNote() {
    println("You chose to delete a note.")
}

fun exitApp() {
    println("You chose to quit the app. :( aw c'mon man")
    exit(0)
}

