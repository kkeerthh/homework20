public class User {

    private String login;
    private Account account;

    public User(String login, String password) {
        this.login = login;
        this.account = new Account(password);
    }

    public Account getAccount() {
        return account;
    }

    public class Account {
        private String password;

        public Account(String password) {
            this.password = password;
        }

        public void displayAccount() {
            System.out.printf("Account Login successful! \nLogin: %s, password: %s", login, password);
        }
    }
}
