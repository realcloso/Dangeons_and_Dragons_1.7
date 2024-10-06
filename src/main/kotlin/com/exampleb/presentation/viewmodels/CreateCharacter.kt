/*package com.example.presentation.viewmodels

import com.example.d_e_d_by_closo.entities.characters.Character
import com.example.d_e_d_by_closo.entities.characters.CharacterRace

class CreateCharacter {

    fun createCharacter(selectedRace: CharacterRace): Character {
        println("Escolha um nome para o seu personagem:")
        val name = readLine().orEmpty().trim()

        val character = AttributeDistributor.distributeAttributes()
        character.name = name

        // Apply race bonuses
        RaceBonusApplier.applyRaceBonuses(character, selectedRace)

        println("Personagem '${character.name}' criado com sucesso!")
        return character
    }
}
*/