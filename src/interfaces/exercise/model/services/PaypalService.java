package interfaces.exercise.model.services;

public class PaypalService implements OnlinePaymentService {

	private static final double taxFee = 0.02;
	private static final double msi = 0.01; // Monthly Simple Interest

	@Override
	public Double paymentFee(Double amount) {
		return amount * taxFee;
	}
	
	@Override
	public Double interest(Double amount, Integer months) {
		return amount * msi * months;
	}
}
