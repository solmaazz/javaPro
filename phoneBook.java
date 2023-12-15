import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class phoneBook {
    public static void main(String[] args) {
        int i=0;
        boolean empty=true;
        String[] nameArray = new String[100];
        String[] phoneNumberArray = new String[100];
        while (i<=100){
            System.out.println("--- My phone book ---");
            System.out.println("****** MENU ******");
            System.out.println("     1. ADD new contact");
            System.out.println("     2. DISPLAY");
            System.out.println("     3. EXIT");
            System.out.println("Please select one item: ");
            Scanner scanner = new Scanner(System.in);
            Scanner nameScan = new Scanner(System.in);
            Scanner phoneNumberScan = new Scanner(System.in);
            String inputValue = scanner.nextLine();
            switch (inputValue) {
                case "1":
                    System.out.println("Please enter contact name: ");
                    String nameValue = nameScan.nextLine();
                    System.out.println("Please enter phone number: ");
                    String phoneNumberValue = phoneNumberScan.nextLine();
                    if(nameValue!="" & phoneNumberValue!=""){
                        nameArray[i]=nameValue;
                        phoneNumberArray[i]=phoneNumberValue;
                        i++;
                        empty=false;
                        break;
                    }
                    else {
                        System.out.println(" Please check contact name or phone number ");
                        break;
                    }
                case "2":
                    if (empty==false){
                        for(int j=0;j<i;j++){
                            System.out.println(nameArray[j] + "'s phone number is: "+phoneNumberArray[j]);
                        }
                    }
                    else
                        System.out.println(" Phone book is empty!");
                    break;
                case "3":
                    System.out.println(" Exiting...! ");
                    System.exit(0);
                    break;
                default:
                    System.out.println(" *** Please choose one of the values 1, 2 or 3 ***");
            }




        }
    }
}
