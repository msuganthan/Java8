package Consumer;

import java.util.function.Consumer;

/**
 * Created by sugan_000 on 3/1/2016.
 */
public class Consumer01 {
    public static void main(String[] args) {
        Consumer01 consumer01 = new Consumer01();
        Customer customer = new Customer("232", "Suganthan", 5000);
        System.out.println("Before ->->"+customer.getBalance());
        consumer01.applyConsumer( customer1 -> customer1.setBalance( customer1.getBalance() + 2000), customer);
        System.out.println("After ->->"+customer.getBalance());
    }

    public void applyConsumer(Consumer<Customer> consumer, Customer customer) {
        consumer.accept(customer);
    }
}

class Customer {
    String ssn;
    String name;
    Integer balance;

    public Customer(String cSsn, String cName, Integer cBalance) {
        this.ssn = cSsn;
        this.name = cName;
        this.balance = cBalance;
    }

    public String getSsn() {return this.ssn;}
    public String getName() {return this.name;}
    public Integer getBalance() {return this.balance;}

    public void setBalance(Integer bal) { this.balance = bal; }
}

