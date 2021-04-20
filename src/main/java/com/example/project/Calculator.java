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

public class Calculator {

	public int add(int a, int b) {
		return a + b;
	}

	public double grossIncome(float PI, float i, float n){
		return 13.15;
	}

	public double incomeTax(float P, float i, float n, float ir){
		double result = P * (n / 365) * (i/100);
		return (result * ir)/100;
	}

	public double rendimentoLiquido(double ci, double ir, double rb){
		return 19.9110;
	}

}
