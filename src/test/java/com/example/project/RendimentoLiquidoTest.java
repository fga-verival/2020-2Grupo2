package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RendimentoLiquidoTest {
    @Test
    @DisplayName("CI: R$ 4200.00\n IR: R$ 147.58\n RB: 983.84")
    void calcularRendimentoLiquido() {
        Calculator calculadora = new Calculator();
        double capitalInicial = 4200.00;
        double imposto = 147.58;
        double rendimentoBruto = 983.84;
        assertEquals(19.9110, 
        calculadora.rendimentoLiquido(capitalInicial, imposto, rendimentoBruto),
        0.001);
    }

    @Test
    @DisplayName("CI: R$ 1000,00\n IR: R$ 3,14\n RB: 13.97")
    void calcularRendimentoLiquido2() {
        Calculator calculadora = new Calculator();
        double capitalInicial = 1000.00;
        double imposto = 3.14;
        double rendimentoBruto = 13.97;
        assertEquals(1.0829, 
        calculadora.rendimentoLiquido(capitalInicial, imposto, rendimentoBruto),
        0.001);
    }
}