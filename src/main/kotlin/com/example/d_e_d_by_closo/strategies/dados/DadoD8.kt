package com.example.d_e_d_by_closo.strategies.dados

import kotlin.random.Random

class DadoD8 : iDado {

    override fun rola_dado() {
        val resultado = Random.nextInt(1, 9) // Gera um número aleatório entre 1 e 8
        println("O resultado do dado d8 é: $resultado")
    }

}