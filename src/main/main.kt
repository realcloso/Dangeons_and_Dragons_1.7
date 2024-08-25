import com.example.presentation.views.Menu
import com.example.presentation.viewmodels.CreateCharacter

fun main() {
    val createCharacter = CreateCharacter()
    val menu = Menu(createCharacter)
    menu.showMenu()
}