
public class Main {
public static void main(String[] args) {
    // 5️⃣ Main Class (Main)
    // Create objects of CreditCardPayment and RefundableCreditCardPayment.
    // Call processPayment() and refundPayment() methods.    
    CreditCardPayment obj=new CreditCardPayment(100.0);
    obj.processPayment();
    RefundableCreditCardPayment obj1=new RefundableCreditCardPayment(500.8);
    obj1.refundPayment();
}
}
