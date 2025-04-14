public class CreditCardPayment extends Payment {

    // 2️⃣ Subclass: CreditCardPayment (Extends Payment)
    // Implements processPayment() to show a message
    //  like "Processing credit card payment of $100".
    
public CreditCardPayment(double amount){   
    //   ✅ The CreditCardPayment constructor takes the value (amount)
    // ✅ It passes that value to the Payment superclass using super(amount)
    // ✅ The value is then used in both the superclass (Payment) and in the processPayment() method
super(amount);
}

    @Override
    void processPayment() {
        
        System.out.println("Processing credit card payment of:  "+" $"+amount);
    }



}
