package com.exampleb.d_e_d_by_closo.strategies.dados

import kotlin.random.Random

class DadoD4 : iDado {

    override fun rola_dado(){
        val resultado = Random.nextInt(1, 5) // Gera um número aleatório entre 1 e 4
        println("O resultado do dado d4 é: $resultado")
    }

}