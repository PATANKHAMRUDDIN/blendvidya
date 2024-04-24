class EEbill{
import java.util.Scanner;
public static void main(String args[])
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter the bill number");
int elctricittybill = scanner.nextint();
if (elctricittybill>300units){
System.out.println("Your E bill is more than 300units");}
else{
System.out.println("Your E bill is more than 100units");}
scanner.close();
}
}