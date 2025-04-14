

public abstract class Payment {
    // 1️⃣ Abstract Class: Payment
    // Field: double amount (stores payment amount).
    // Constructor to initialize amount.
    // Abstract method: processPayment().    
   public Payment(double amount){
        this.amount=amount;

    }

    double amount;
    abstract void processPayment();


}
