fun main(args: Array<String>) {

    val Like = 11111
    var Text = " людям"

    if ((Like % 100) === 11) {
        Text = " людей"
    } else
        if ((Like % 10) === 1) {
            Text = " человеку"
        }

    println("Понравилось " + Like + Text)

}