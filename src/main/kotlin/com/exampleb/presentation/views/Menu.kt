package com.exampleb.presentation.views

import com.exampleb.presentation.viewmodels.CreateCharacter
import com.exampleb.d_e_d_by_closo.entities.characters.Character
import com.exampleb.d_e_d_by_closo.entities.characters.CharacterRace
import com.exampleb.d_e_d_by_closo.strategies.behavior.atacks.*
import com.exampleb.d_e_d_by_closo.usecases.AttributeModifiers

class Menu(private val createCharacter: CreateCharacter) {

    private var character: Character? = null

    fun showMenu() {
        do {
            println("Escolha uma opção:")
            if (character == null) {
                println("1 - Criar Personagem")
            }
            if (character != null) {
                println("2 - Mostrar Personagem")
                println("3 - Treinar combate")
            }
            println("4 - Sair")
            val choice = readLine()?.toIntOrNull()

            when (choice) {
                1 -> if (character == null) createCharacter()
                2 -> if (character != null) showCharacter()
                3 -> character?.doAtack(AtackWithWoodenSword())
                4 -> println("Saindo...")
                else -> println("Opção inválida. Tente novamente.")
            }
        } while (choice != 4)
    }

    private fun createCharacter() {
        println(" ___________________________________________________________________________________")
        println("| Human = +1 em tudo | Elf = des/con/sab/car +2, int +1 | Anão = for/con +2, sab +  |")
        println("| Orc = for +2, con +1 | Gnome = int +2, des/con +1 | Halfling = des +2, con/car +1 |")
        println("| Tiefling = car +2, con/int +1 | Dragonborn = for +2, car +1                       |")
        println("|___________________________________________________________________________________|")

        println("Escolha a raça do personagem:")
        CharacterRace.values().forEachIndexed { index, race ->
            println("${index + 1} - ${race.name}")
        }

        val raceChoice = readLine()?.toIntOrNull()
        val selectedRace = CharacterRace.values().getOrNull(raceChoice?.minus(1) ?: -1)

        if (selectedRace != null) {
            character = createCharacter.createCharacter(selectedRace)
            println("Personagem '${character?.name}' criado com sucesso!")
        } else {
            println("Raça inválida. Tente novamente.")
        }
    }

    private fun showCharacter() {
        character?.let {
            println("Detalhes do Personagem:")
            println("Nome: ${it.name}")
            println("Raça: ${it.javaClass.simpleName}")
            println("Força: ${it.strength}")
            println("Destreza: ${it.dexterity}")
            println("Constituição: ${it.constitution}")
            println("Inteligência: ${it.intelligence}")
            println("Sabedoria: ${it.wisdom}")
            println("Carisma: ${it.charisma}")
            println("Pontos de Experiência: ${it.experiencePoints}")
            println("Nível: ${it.level}")
            print("Pontos de Vida: ")
            println(calculateLifePoints(it.lifePoints, it.constitution))

        } ?: println("Nenhum personagem criado.")
    }

    fun calculateLifePoints(lifePoints: Int, constitution: Int): Int {
        val modifier = AttributeModifiers.modifiers[constitution] ?: 0
        return lifePoints + modifier
    }

}
