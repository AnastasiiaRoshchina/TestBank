/**
 * 
 */
package bank;
 
import java.util.Scanner;
 
public class Bank {
    //***********globaalsed muutujad*******************
    
    private static Scanner scanner = new Scanner(System.in);
    //-------------------------------------------------
    public static int Arvutus(double P, double Contribution, double Final){
        int countMonths = 0;
        while (Contribution <= Final) {        
        countMonths++;
        Contribution = Contribution + Contribution*P / 100;
    }
        return countMonths;
    }
    //-------------------------------------------------------
    public static void main(String[] args) {
    double Contribution = 1000;
    double Final = 1100;
 
    System.out.print("введите процент:");
    double persent = scanner.nextDouble();
    int countMonths = Arvutus(persent,Contribution,Final);
    System.out.println("Через " + countMonths + " месяц ваш взнос будет > " + Final);   
    }
}