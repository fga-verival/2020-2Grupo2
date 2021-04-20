package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

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

    @ParameterizedTest(name = "CI: R$ {0}\n IR: R$ {1}\n RB: {2}\nRendimento Líquido: {3}")
    @CsvSource({
            "500.00,     2.96,     13.15,     2.0384",
            "3000.00,   35.51,    177.53,     4.7342",
            "2000.00,   25.15,    125.75,     5.0301",
            "100.00,     1.40,      8.01,     6.6113",
            "250.00,     4.03,     23.01,     7.5945",
            "400.00,     8.44,     48.22,     9.9452",
            "800.00,    20.56,    117.48,    12.1151",
            "2500.00,   75.51,    431.51,    14.2397",
            "100.00,     3.08,     20.55,    17.4658",
    })
    void calcularRendimentoLiquido3(double ci, double ir, double rb, double expectedResult) {
		Calculator calculadora = new Calculator();
		assertEquals(expectedResult, 
        calculadora.rendimentoLiquido(ci, ir, rb),
        0.01);
	}
}