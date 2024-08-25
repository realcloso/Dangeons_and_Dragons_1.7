package com.example.d_e_d_by_closo.strategies.dados

import kotlin.random.Random

class DadoD12 : iDado {

    override fun rola_dado() {
        val resultado = Random.nextInt(1, 13) // Gera um número aleatório entre 1 e 12
        println("O resultado do dado d12 é: $resultado")
    }

}