package hello;

public class Balance {

    private final long id;
    private final String username;
    private long balance;
    private char currency;

    public Balance(long id, String username) {
        this.id = id;
        this.username = username;
        this.balance = id*id;
        this.currency = username.charAt(0);
    }

    public long getBalance() {
        return balance;
    }

    public char getCurrency() {
        return currency;
    }
    
}