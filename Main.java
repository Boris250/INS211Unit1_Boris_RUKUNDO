import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Account> accList = new ArrayList<>();
        accList.add(new Account(1, "Thibaut", " Debit  ", "10000","0.2"));
        accList.add(new Account(2, " Safari", " Credit ", "20000","0.3"));
        accList.add(new Account(3, " Divine", "Checking", "30000","0.4"));
        accList.add(new Account(4, " Desire", " Saving ", "40000","0.5"));
        accList.add(new Account(5, " Boris ", "Checking", "50000","0.6"));
        accList.add(new Account(6, " Bosco ", " Debit  ", "60000","0.7"));
        accList.add(new Account(7, " Ismael", " Credit ", "70000","0.8"));
        accList.add(new Account(8, "J Darcy", " Debit  ", "80000","0.9"));
        accList.add(new Account(9, " Prime ", " Saving ", "90000","0.2"));
        accList.add(new Account(10, " Gaby ", "Checking", "100000","0.4"));



        for (Account acc:accList){
            System.out.println(acc);
        }
    }
}