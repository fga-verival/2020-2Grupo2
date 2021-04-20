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
	// FV = PV * i * n

	@Test
	@DisplayName("FV = PV * i * n")
	void calculateGrossIncome() {
		Calculator calculator = new Calculator();
		
		assertEquals(13.15, calculator.grossIncome(500, 8, 120), "500 reais * 8% a.a * 120 dias should equal 13,15");
		assertEquals(431.51, calculator.grossIncome(2500, 9, 700), "2500 reais * 9% a.a * 700 dias should equal 431.51");
	@Test
	@DisplayName("(PV * i * n * 22.5)/100")
	void testCalculationIncomeTax(){
		Calculator calculator = new Calculator();
		assertEquals(2.96, calculator.incomeTax(500, 8, 120, 22.5), "500 reais * 8% a.a * 120 dias should equal 2.96");
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
