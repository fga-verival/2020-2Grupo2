/*
 * Copyright 2015-2018 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTests {
	@Test
	@DisplayName("J = PV * i * n")
	void calculateGrossIncome() {
		Calculator calculator = new Calculator();

		assertEquals(13.33, calculator.grossIncome(500, 8, 120), 0.01, "500 reais * 8% a.a * 120 dias should equal 13,15");
		assertEquals(437.5, calculator.grossIncome(2500, 9, 700), 0.01, "2500 reais * 9% a.a * 700 dias should equal 431.51");
	}

	@Test
	@DisplayName("(PV * i * n * 22.5)/100")
	void testCalculationIncomeTax(){
		Calculator calculator = new Calculator();
		assertEquals(2.96, calculator.incomeTax(500.0f, 8.0f, 120.0f, 22.5f), 0.1f, "500 reais * 8% a.a * 120 dias should equal 2.96");
	}

	@Test
	@DisplayName("(PV * i * n * 17.5)/100")
	void testCalculationIncomeTax2(){
		Calculator calculator = new Calculator();
		assertEquals(75.51, calculator.incomeTax(2500.0f, 9.0f, 700.0f, 17.5f), 0.1f, "2500 reais * 9% a.a * 700 dias should equal 75.51");
	}

	@ParameterizedTest(name = "{1} * {1} * {1} = {1}")
	@CsvSource({
			"1000,    8.5,   60, 14.16",
			"3000,    9.0,   240, 180.0",
			"2000,  8.5, 270, 127.50",
			"4200,  9.5, 900, 997.5"
	})
	void calculateGrossIncome(double PV, double i, double n, double expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.grossIncome(PV, i, n), 0.01,
				() -> PV + " * " + i + " * " + n + " shoud be equal to " + expectedResult);
	}

	@ParameterizedTest(name = "Aplicacao Inicial: R$ {0}\nTaxa de juros: R$ {1}\nDias: {2}\nAliquota: {3}\nImpost de Renda: {4}\n")
	@CsvSource({
			"1000.00f,    8.5f,     60.0f,     	 	22.5, 	3.14",
			"500.00f,   	8.0f,    	120.0f,     	22.5,		2.96",
			"3000.00f,   	9.0f,    	240.0f,     	20.0,		35.51",
			"2000.00f,   	8.5f,    	270.0f,     	20.0,		25.15",
			"100.00f,     7.5f,     390.0f,     	17.5,		1.40",
			"250.00f,     8.0f,    	420.0f,     	17.5,		4.03",
			"400.00f,    	8.0f,    	550.0f,    		17.5,		8.44",
			"800.00f,   	8.0f,    	670.0f,    		17.5,		20.56",
			"2500.00f,   	9.0f,    	700.0f,    		17.5,		75.51",
			"4200.00f,   	9.5f,    	900.0f,    		15.0,		147.58",
			"100.00f,    	7.5f,     1000.0f,    	15.0,		3.08",
	})
	void testCalculationIncomeTax3(float P, float i, float n, float ir, double expectedResult) {
	Calculator calculator = new Calculator();
	assertEquals(expectedResult, calculator.incomeTax(P, i, n, ir), 0.1f);
}	

	@Test
	@DisplayName("1 + 1 = 2")
	void addsTwoNumbers() {
		Calculator calculator = new Calculator();
		assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
	}

	@ParameterizedTest(name = "{0} + {1} = {2}")
	@CsvSource({
			"0,    1,   1",
			"1,    2,   3",
			"49,  51, 100",
			"1,  100, 101"
	})
	void add(int first, int second, int expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.add(first, second),
				() -> first + " + " + second + " should equal " + expectedResult);
	}
}
