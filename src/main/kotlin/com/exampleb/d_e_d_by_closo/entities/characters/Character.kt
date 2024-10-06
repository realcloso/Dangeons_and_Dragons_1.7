package com.exampleb.d_e_d_by_closo.entities.characters

import com.exampleb.d_e_d_by_closo.strategies.behavior.atacks.iAtack
import com.exampleb.d_e_d_by_closo.strategies.race.iRace

abstract class Character(
    var name: String = "",
    var strength: Int = 8,
    var dexterity: Int = 8,
    var constitution: Int = 8,
    var intelligence: Int = 8,
    var wisdom: Int = 8,
    var charisma: Int = 8,
    var experiencePoints: Int = 0,
    var level: Int = 1,
    var lifePoints: Int = 10,
    var race: iRace,
    var atack: iAtack,
    var active: Boolean = true
) {
    init {
        applyRaceBonus()
    }

    private fun applyRaceBonus() {
        strength += race.strength
        dexterity += race.dexterity
        constitution += race.constitution
        intelligence += race.intelligence
        wisdom += race.wisdom
        charisma += race.charisma
    }
}
