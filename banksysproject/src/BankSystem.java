import java.util.HashMap;

class BankSystem{
    static void withDraw(HashMap<Integer,Integer> accountBalance,int accountNumber,int amount){
        if (!accountBalance.containsKey(accountNumber)){
            System.out.println(".(wrong account number)");
            return;
        }
    
       int currentBalance=accountBalance.get(accountNumber) ;
       if (amount > currentBalance) {
        System.out.println("❌ Insufficient balance!");
        return;
    } else
    accountBalance.put(accountNumber, currentBalance-amount);
    System.out.println("✅ Withdrawal successful! New balance: $" + accountBalance.get(accountNumber));
    }
    public static void main(String[] args) {
//         🔥 BONUS CHALLENGE!
// 🔹 Task: Implement a Bank System using HashMap

// accountBalance.put(accountNumber, balance)
// Add 3 accounts with balance.
// Allow deposit & withdrawal by updating balance.
// Print updated balances.
// 💡 Hint: Use .put(), .get(accountNumber) + update.
HashMap<Integer,Integer> accounts=new HashMap<>();
accounts.put(34, 500);
accounts.put(59, 100);
accounts.put(79, 2000);
System.out.println(accounts);
withDraw(accounts,34,100);


    

}
 }
