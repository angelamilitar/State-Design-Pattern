public class ClosedState implements AccountState {

    public void deposit(Account account, Double amount) {
        System.out.println("You cannot deposit on closed account!");
        System.out.println(account.toString());
    }

    public void withdraw(Account account, Double amount) {
        System.out.println("You cannot withdraw on closed account!");
        System.out.println(account.toString());
    }

    public void activate(Account account) {
        System.out.println("You cannot activate closed account!");
    }

    public void suspend(Account account) {
        System.out.println("You cannot suspend closed account!");
    }

    public void close(Account account) {
        System.out.println("Account is already closed!");
    }
}
