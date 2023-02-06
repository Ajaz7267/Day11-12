//        Modify class Account to provide a method called debit that withdraws money
//        from an Account. Ensure that the debit amount does not exceed the Account’s
//        balance. If it does, the balance should be left unchanged and the method
//        should print a message indicating ―Debit amount exceeded account balance.
//        Modify class AccountTest to test method debit.

package Day11And12;

import java.util.Scanner;

public class Account {
    int Card_Number = 1925630000;



    Scanner sc = new Scanner(System.in);
    private void Debit() {
        System.out.print("Enter Your Card: ");
        int CardNumber = sc.nextInt();
        if (Card_Number == CardNumber) {
            System.out.println("Card Will Accepted");
        } else{
            System.out.println("Your Card is Rejected");
        }

    }
//     PIN NUMBER
    private void PinNumber() {
            int PinNumber =7267;
            System.out.print("Enter Your Pin Number: ");
            int CorrectPin = sc.nextInt();
            if (PinNumber == CorrectPin) {
                System.out.println("Pin Number is Correct....");
            } else {
                System.out.println("Pin Number is Not Corrected");
            }
        }
//        AMOUNT
      private  void Amount(){
            System.out.print("Enter The Amount: ");
            int Amount = sc.nextInt();
            if(20000>=Amount){
                System.out.println("Debited");
            }
            else if(20000<Amount) {
                System.out.println("Your Amount Not Proceed... Please Enter Below 20000 ");
            }
            else  {
                System.out.println("Debit Amount Exceeded account balance");
            }
        }


    public static void main(String[] args) {
        Account ac =new Account();
        ac.Debit();
        ac.PinNumber();
        ac.Amount();
    }
}
