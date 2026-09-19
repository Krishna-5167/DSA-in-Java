class bankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }

    public String getPassword(){
        return password;
    }


}

public class Access_Modifiers {
    public static void main(String[] args) {

        bankAccount myAcc = new bankAccount();

        myAcc.username = "Krishna";
        // myAcc.setPassword = "abcdef";        // This line is incorrect. It should be myAcc.setPassword("abcdef");

        myAcc.setPassword("abcdef");

        
        System.out.println(myAcc.getPassword());

    }
}
