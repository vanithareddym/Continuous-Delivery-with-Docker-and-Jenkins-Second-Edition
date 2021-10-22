package com.leszko.calculator;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/** Calculator logic */
@Service
public class Calculator {
	@Cacheable("div")
	public int sum(int a, int b) {
		return a + b;
	}

        @Cacheable("sum")
        public int div(int a, int b) {
                return a / b;
        }
}
