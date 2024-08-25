package com.example.d_e_d_by_closo.usecases
import com.example.d_e_d_by_closo.entities.characters.Character
import com.example.d_e_d_by_closo.entities.characters.CharacterRace


object RaceBonusApplier {
    fun applyRaceBonuses(character: Character, race: CharacterRace) {
        when (race) {
            CharacterRace.human -> {
                character.strength += 1
                character.dexterity += 1
                character.constitution += 1
                character.intelligence += 1
                character.wisdom += 1
                character.charisma += 1
            }
            CharacterRace.elf -> {
                character.strength += 0
                character.dexterity += 2
                character.constitution += 2
                character.intelligence += 1
                character.wisdom += 2
                character.charisma += 2
            }
            CharacterRace.dwarf -> {
                character.strength += 2
                character.dexterity += 0
                character.constitution += 2
                character.intelligence += 0
                character.wisdom += 1
                character.charisma += 0
            }
            CharacterRace.orc -> {
                character.strength += 2
                character.dexterity += 0
                character.constitution += 1
                character.intelligence += 0
                character.wisdom += 0
                character.charisma += 0
            }
            CharacterRace.gnome -> {
                character.strength += 0
                character.dexterity += 1
                character.constitution += 1
                character.intelligence += 2
                character.wisdom += 0
                character.charisma += 0
            }
            CharacterRace.halfling -> {
                character.strength += 0
                character.dexterity += 2
                character.constitution += 1
                character.intelligence += 0
                character.wisdom += 0
                character.charisma += 1
            }
            CharacterRace.tiefling -> {
                character.strength += 0
                character.dexterity += 0
                character.constitution += 1
                character.intelligence += 1
                character.wisdom += 0
                character.charisma += 2
            }
            CharacterRace.dragonborn -> {
                character.strength += 2
                character.dexterity += 0
                character.constitution += 0
                character.intelligence += 0
                character.wisdom += 0
                character.charisma += 1
            }
        }
    }
}
