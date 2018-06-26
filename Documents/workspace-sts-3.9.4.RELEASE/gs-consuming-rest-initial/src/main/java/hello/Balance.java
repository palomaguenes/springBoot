package hello;

public class Balance {

    private final long id;
    private final String username;

    public Balance(long id, String username) {
        this.id = id;
        this.username = username;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return username;
    }
}