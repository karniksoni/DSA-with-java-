public class Oops_1 {
    public static void main(String args[]){
        BankAccount myacc = new BankAccount();
        myacc.username = "Karnik soni";
        myacc.setPassword("qwertyuiop");

    }
}

class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password = pwd;
    }
}
