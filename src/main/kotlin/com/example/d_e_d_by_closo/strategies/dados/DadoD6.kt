package com.example.d_e_d_by_closo.strategies.dados

import kotlin.random.Random

class DadoD6 : iDado {

    override fun rola_dado() {
        val resultado = Random.nextInt(1, 7) // Gera um número aleatório entre 1 e 6
        println("O resultado do dado d6 é: $resultado")
    }

}