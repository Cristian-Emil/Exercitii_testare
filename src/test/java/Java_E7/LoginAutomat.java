package Java_E7;

// Acesta este un exercitiu de logare automata care se poate aplica oriunde:

import java.util.Scanner;

class LoginAutomat {

        Scanner sc;
        String ur,pass;
        public LoginAutomat(Scanner sc){
        this.sc=sc;
        insertData();
    }
    public void insertData(){
        System.out.println("Enter Username: ");
        ur = sc.nextLine();

        System.out.println("Enter Password: ");
        pass = sc.nextLine();
        validation();
    }
    public void validation(){
        if (ur.equals("USER")) {
            if (pass.equals("PASS")) {
                System.out.println("Succesful Login");
            } else {
                System.out.println("Wrong Password, please try another Password");
            }
        }else{
                System.out.println("Wrong Username, please try another User");
            }
        }
class Login_Test{}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LoginAutomat l = new LoginAutomat(sc);
    }
}




