public class RefundableCreditCardPayment extends CreditCardPayment implements Refundable {

    // 4️⃣ Subclass: RefundableCreditCardPayment (Extends CreditCardPayment, Implements Refundable)
    // Implements refundPayment() to show a message like "Refunding $100 to credit card".
    public RefundableCreditCardPayment(double amount){
        super(amount);
    }
    @Override
    public void refundPayment() {
        System.out.println("Refunding "+"  $"+amount+"  to credit card");
    }
   

}
