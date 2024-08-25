package com.example.d_e_d_by_closo.strategies.dados

import kotlin.random.Random

class DadoD20 : iDado {

    override fun rola_dado() {
        val resultado = Random.nextInt(1, 21) // Gera um número aleatório entre 1 e 20
        println("O resultado do dado d20 é: $resultado")
    }

}