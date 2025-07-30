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

public class Payment {
	public static void main(String[] args) {
		PaymentGateway product= new PaymentGateway();
		card=product.makepayment("Card Number","ExpiryDate","CVV");
		System.out.println(card);
		upi=product.makepayment("UPIID");
		System.out.println(upi);
		cod=product.makepayment(35000);
		System.out.println(cod);
	}
}
