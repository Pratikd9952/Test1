package hotelPayment.pratik;

public class Test {

	public static void main(String[] args) {
		
		RestaurantService rs=new RestaurantService();
		
		rs.payment =new CreditCardPayment();
		
		rs.payment=new DebitCardPayment();
		
		rs.collectBill(100.90);

	}

}
