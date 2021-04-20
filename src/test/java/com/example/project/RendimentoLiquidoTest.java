package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RendimentoLiquidoTest {
    @Test
    @DisplayName("Cálculo rendimento líquido")
    void calcularRendimentoLiquido() {
        Calculator calculadora = new Calculator();
        double capitalInicial = 4200.00;
        double imposto = 147.58;
        double rendimentoBruto = 983.84;
        assertEquals(19.9110, 
        calculadora.rendimentoLiquido(capitalInicial, imposto, rendimentoBruto),
        0.00001);
    }
}