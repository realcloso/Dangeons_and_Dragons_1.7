package com.example.presentation.viewmodels

import com.example.d_e_d_by_closo.entities.characters.Character
import com.example.d_e_d_by_closo.usecases.AttributeCosts

object AttributeDistributor {

    fun distributeAttributes(): Character {
        var pointsLeft = 27
        val attributes = mutableMapOf(
            "Força" to 8,
            "Destreza" to 8,
            "Constituição" to 8,
            "Inteligência" to 8,
            "Sabedoria" to 8,
            "Carisma" to 8
        )

        // Mapeamento de abreviações para nomes completos dos atributos
        val abbreviationMap = mapOf(
            "for" to "Força",
            "des" to "Destreza",
            "con" to "Constituição",
            "int" to "Inteligência",
            "sab" to "Sabedoria",
            "car" to "Carisma"
        )

        while (pointsLeft > 0) {
            println("Pontos restantes: $pointsLeft")
            attributes.forEach { (attribute, value) ->
                println("$attribute: $value")
            }

            println("Escolha um atributo para aumentar (use 3 primeiras letras do atributo):")
            println("CUSTO NÍVEL/PONTOS:| 9 = 1 | 10 = 2 | 11 = 3 | 12 = 4 | 13 = 5 | 14 = 7 | 15 = 9 |")
            val chosenAbbreviation = readLine()?.lowercase() ?: ""
            val chosenAttribute = abbreviationMap[chosenAbbreviation]

            if (chosenAttribute == null || chosenAttribute !in attributes) {
                println("Atributo inválido. Tente novamente.")
                continue
            }

            val currentAttributeValue = attributes[chosenAttribute] ?: 8
            println("Escolha um valor entre ${currentAttributeValue + 1} e 15 para o atributo $chosenAttribute:")
            val newValue = readLine()?.toIntOrNull()

            if (newValue != null && newValue in (currentAttributeValue + 1)..15) {
                val cost = AttributeCosts.costs[newValue]!! - AttributeCosts.costs[currentAttributeValue]!!

                if (cost <= pointsLeft) {
                    attributes[chosenAttribute] = newValue
                    pointsLeft -= cost
                } else {
                    println("Você não tem pontos suficientes para essa mudança.")
                }
            } else {
                println("Valor inválido. Escolha um valor entre ${currentAttributeValue + 1} e 15.")
            }
        }

        return createCharacterFromAttributes(attributes)
    }


    private fun createCharacterFromAttributes(attributes: Map<String, Int>): Character {
        val character = Character()

        character.strength = attributes["Força"] ?: 8
        character.dexterity = attributes["Destreza"] ?: 8
        character.constitution = attributes["Constituição"] ?: 8
        character.intelligence = attributes["Inteligência"] ?: 8
        character.wisdom = attributes["Sabedoria"] ?: 8
        character.charisma = attributes["Carisma"] ?: 8

        return character
    }
}