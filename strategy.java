
// - là 1 mẫu thiết kế với mục đích đóng gói thuật toán và làm cho 
// các thuật toán có thể  độc lập với việc sử dụng chúng  và thay
// đổi linh hoạt giữa chúng tùy thuộc vào yêu cầu

// - Strategy giải quyết việc áp dụng các thuật toán khác nhau
// cho cugnf 1 công việc cụ thể mà không làm thay đổi giao diện
// công việc đó. 

// - Ví dụ: thanh toán với các hình thức khác nhau 
// (Paypal, ví điện tử, shipcode) ta sử dụng mẫu Strategy để 
//  thực hiện điều này

interface PaymentStrategy {
    public void pay(int amount);
}

class PaypalPayment implements PaymentStrategy {

    PaypalPayment() {}
    @Override
    public void pay(int amount) {
        System.out.println("Pay " + amount + " with Paypal");
    }
}

class CreditCarPayment implements PaymentStrategy {
    CreditCarPayment() {}
    @Override
    public void pay(int amount) {
        System.out.println("Pay " + amount + " with Credit Card");
    }
}

/**
 * Innerstrategy
 */
class EWalletPayment implements PaymentStrategy {
    EWalletPayment() {}
    @Override
    public void pay(int amount) {
        System.out.println("Pay " + amount + " with EWallet");
    }

    
} 


class User {
    private PaymentStrategy paymentStrategy;
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    
    public PaymentStrategy getPaymentStrategy(){
        return this.paymentStrategy;
    }
     public void pay(int mount) {
        this.paymentStrategy.pay(mount);
    }
}


public class strategy {
    public static void main( String []args) {

        User user = new User();
        // PaypalPayment pp = new PaypalPayment();
        // pp.pay(100);
        user.setPaymentStrategy(new PaypalPayment());
        System.out.println("------------------");
        
        user.pay(10000);
        user.getPaymentStrategy();

    }
}