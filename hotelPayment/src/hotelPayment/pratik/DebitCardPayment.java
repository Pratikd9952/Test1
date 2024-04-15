package hotelPayment.pratik;

public class DebitCardPayment implements IPayment {

	@Override
	public boolean payBill(double amt) {
		
		System.out.println("Debit-card payment done");
		
		return true;
	}

}
