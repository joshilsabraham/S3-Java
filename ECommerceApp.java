class PaymentGateway {
	public void makePayment(String cardNumber,String expiryDate,String cvv) {
		System.out.println("Credit Card Payment Successful");
	}
	
	public void makePayment(String upiid) {
		System.out.println("UPI Payment Successful");
	}
	
	public void makePayment(double amount) {
		System.out.println("Cash on Delivery Payment Successful");
	}
	
}

public class ECommerceApp {
	public static void main(String[] args) {
		PaymentGateway product= new PaymentGateway();
		product.makePayment("Card Number","ExpiryDate","CVV");
		upi=product.makePayment("UPIID");
		cod=product.makePayment(35000);
		}
}
	}
}
