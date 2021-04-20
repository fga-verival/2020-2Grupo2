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

	public double grossIncome(float PV, float i, float n) {
		double taxaAm = (i / 100.0) / 12.0;
		double prazoMes = n / 30.0;
		
		return PV * taxaAm * prazoMes;
	}
}
