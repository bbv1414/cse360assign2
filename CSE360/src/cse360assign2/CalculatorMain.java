package cse360assign2;

import cse360assign2.Calculator;

public class CalculatorMain {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(3);
		calc.subtract(1);
		calc.multiply(4);
		calc.divide(2);
		System.out.println(calc.getTotal());
		System.out.println();
		System.out.println(calc.getHistory());
	}
}
