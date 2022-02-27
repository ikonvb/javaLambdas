package javalambdas.ch02.exercise.strategy;


import javalambdas.ch02.exercise.PaymentStatus;

import java.math.BigDecimal;

public class DebitCardPayment implements PaymentStrategy {

	@Override
	public PaymentStatus pay(BigDecimal money) {
		System.out.println("Paying by debit card : " + money);
		return PaymentStatus.SUCCESS;
	}

}
