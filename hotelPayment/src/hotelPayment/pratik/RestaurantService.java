package hotelPayment.pratik;

public class RestaurantService {

	
	IPayment payment;
	
	
	public void collectBill(double amt) {
		
		boolean status=payment.payBill(amt);
		
		if(status) {
			System.out.println("Payment success...Thank You");
		}
		else {
			System.out.println("Card Decline");
		}
	}
}
