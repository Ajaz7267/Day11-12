//a. Desc -> Write a program to read in Stock Names, Number of Share, Share Price.
//        Print a Stock Report with the total value of each Stock and the total value of
//        Stock.

//        b. I/P -> N number of Stocks, for Each Stock Read In the Share Name, Number of
//        Share, and Share Price

//        c. Logic -> Calculate the value of each stock and the total value

//        d. O/P -> Print the Stock Report.

//        e. Hint -> Create Stock and Stock Portfolio Class holding the list of Stocks read
//        from the input file. Have functions in the Class to calculate the value of each
//        stock and the value of total stocks.

package StockExchange;

import java.util.Scanner;

public class StockExchange {
    double Price = 0;
    int Stocks =0;
    int NofShare = 0;
    double ValueOfShare=0;
    double TotalValue=0;
    String Name = " ";

  private void NNumberOfStock() {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter The Number Of Stocks:");
      Stocks = sc.nextInt();
      System.out.println(Stocks);


      System.out.println("Enter The Number Of Share:");
      NofShare = sc.nextInt();
      System.out.println(NofShare);


      System.out.println("Enter The Share Price:");
      Price = sc.nextInt();
      System.out.println(Price);
  }
    public void ShareName(){
      Scanner sc =new Scanner(System.in);
      System.out.println("Enter The Share Name:");
      Name=sc.nextLine();
      System.out.println(Name);


  }
    void StockReport(){

      ValueOfShare = NofShare * Price; //Calculate the value of each stock and the total value

        TotalValue = Stocks * ValueOfShare;
      System.out.println("ValueOfShare: "+ValueOfShare);
      System.out.println("TotalValue: "+TotalValue);
     }

    public static void main(String[] args) {
        StockExchange se = new StockExchange();
        se.NNumberOfStock();
        se.ShareName();
        se.StockReport();


    }
}
