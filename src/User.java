public abstract class User {
    private String username;
    private String email;
    private String password;

    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public abstract void login();

    public abstract void register();

    public abstract void logout();

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
class Admin extends User {

    public Admin(String username, String email, String password) {
        super(username, email, password);
    }

    @Override
    public void login() {
        System.out.println("Đăng nhập admin");
    }

    @Override
    public void register() {
        System.out.println("Đăng ký admin");
    }

    @Override
    public void logout() {
        System.out.println("Đăng xuất admin");
    }
}

class Customer extends User {

    public Customer(String username, String email, String password) {
        super(username, email, password);
    }

    @Override
    public void login() {
        System.out.println("Đăng nhập customer");
    }

    @Override
    public void register() {
        System.out.println("Đăng ký customer");
    }

    @Override
    public void logout() {
        System.out.println("Đăng xuất customer");
    }
}

class Moderator extends User {

    public Moderator(String username, String email, String password) {
        super(username, email, password);
    }

    @Override
    public void login() {
        System.out.println("Đăng nhập Moderator");
    }

    @Override
    public void register() {
        System.out.println("Đăng ký Moderator");
    }

    @Override
    public void logout() {
        System.out.println("Đăng xuất Moderator");
    }
}
class Mainss {

    public static void main(String[] args) {

        User admin = new Admin("ha thanh tinh", "tinh@gmail.com", "123");
        System.out.println(admin);
        admin.login();
        admin.register();
        admin.logout();

        User customer = new Customer("ha huu nam", "nam@gmail.com", "123");
        System.out.println(customer);
        customer.login();
        customer.register();
        customer.logout();

        User moderator = new Moderator("hihi", "hihi@gmail.com", "123");
        System.out.println(moderator);
        moderator.login();
        moderator.register();
        moderator.logout();
    }
}

