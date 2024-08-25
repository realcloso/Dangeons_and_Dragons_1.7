package test.kotlin

import com.example.d_e_d_by_closo.entities.characters.Character
import com.example.d_e_d_by_closo.entities.characters.CharacterRace
import com.example.d_e_d_by_closo.usecases.RaceBonusApplier
import org.junit.jupiter.api.Assertions.*
import kotlin.test.Test

class MainKtTest {
    @Test
    fun `test race bonus application`() {
        // Arrange
        val character = Character()

        // Act
        RaceBonusApplier.applyRaceBonuses(character, CharacterRace.human)

        // Assert
        assertEquals(9, character.strength, "Human strength bonus should be +1")
        assertEquals(9, character.dexterity, "Human dexterity bonus should be +1")
        assertEquals(9, character.constitution, "Human constitution bonus should be +1")
        assertEquals(9, character.intelligence, "Human intelligence bonus should be +1")
        assertEquals(9, character.wisdom, "Human wisdom bonus should be +1")
        assertEquals(9, character.charisma, "Human charisma bonus should be +1")
    }
}