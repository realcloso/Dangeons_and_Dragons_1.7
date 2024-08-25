package com.example.d_e_d_by_closo.entities.characters

import com.example.d_e_d_by_closo.strategies.behavior.atacks.iAtack

open class Character : iAtack {
    var name: String = ""
    var strength: Int = 8
    var dexterity: Int = 8
    var constitution: Int = 8
    var intelligence: Int = 8
    var wisdom: Int = 8
    var charisma: Int = 8
    var experiencePoints: Int = 0
    var level: Int = 1
    var lifePoints: Int = 10
    var active: Boolean = true

    fun doAtack(atack: iAtack) {
        atack.doAtack()
    }

    override fun doAtack() {
        println("Ataque padrão.")
    }
}

enum class CharacterRace {
    human,
    elf,
    dwarf,
    orc,
    gnome,
    halfling,
    tiefling,
    dragonborn
}
