package com.example.calculator;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorApplicationTests {

	private Calculator calculator;

	@BeforeEach
	public void setUp(){
		calculator = new Calculator();
	}

	@Test
	@DisplayName("test sum")
	void test1() {
		Integer first = 3;
		Integer second = 7;
		Integer expected = 10;

		assert calculator.sum(first,second).equals(expected);
	}

	@Test
	@DisplayName("test subtraction")
	void test2() {
		Integer first = 12;
		Integer second = 4;
		Integer expected = 8;

		assert calculator.subtraction(first,second).equals(expected);
	}

	@Test
	@DisplayName("test multiply")
	void test3() {
		Integer first = 5;
		Integer second = 3;
		Integer expected = 15;

		assert calculator.multiply(first,second).equals(expected);
	}

	@Test
	@DisplayName("test division")
	void test4() {
		Integer first = 30;
		Integer second = 6;
		Integer expected = 5;

		assert calculator.division(first,second).equals(expected);
	}

	@Test
	@DisplayName("test pow")
	void test5() {
		double first = 2;
		double second = 3;
		double expected = 8;

		assert calculator.pow(first,second).equals(expected);
	}

	@Test
	@DisplayName("test sqrt")
	void test6() {
		double first = 81;
		double expected = 9;

		assert calculator.sqrt(first).equals(expected);
	}

}
