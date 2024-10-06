package com.exampleb.d_e_d_by_closo.strategies.dados

import kotlin.random.Random

class DadoD10 : iDado {

    override fun rola_dado() {
        val resultado = Random.nextInt(1, 11) // Gera um número aleatório entre 1 e 10
        println("O resultado do dado d10 é: $resultado")
    }

}