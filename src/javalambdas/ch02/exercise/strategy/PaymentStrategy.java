package javalambdas.ch02.exercise.strategy;


import javalambdas.ch02.exercise.PaymentStatus;

import java.math.BigDecimal;

public interface PaymentStrategy {
	
	public PaymentStatus pay(BigDecimal money);

}
