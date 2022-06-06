package bank;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class TransactionHistory {
    private long id;
    private LocalDate dayTrading;
    private String description;
    private String benficiaryAccount;
    private long money;

    public TransactionHistory(String description, String benficiaryAccount,long money){
        this.id =IdGenerate.getNewID();
        this.dayTrading=LocalDate.now();
        this.benficiaryAccount = benficiaryAccount;
        this.money=money;
    }
    public String getBenficiaryAccount(){return benficiaryAccount;}
    public void setBenficiaryAccount(String benficiaryAccount) {this.benficiaryAccount =benficiaryAccount;}
    public long getId(){return id;}
    public LocalDate getDayTrading(){return dayTrading;}
    public String getDescription(){return description;}
    public void setDescription(String description){this.description = description;}
    public long getMoney(){return money;}
    public void setMoney(long money){this.money = money;}
    public String toString(){
        DateTimeFormatter myFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return id + " - " + dayTrading.format(myFormatter)+ " - "+ description+" - " + Controller.formatMoney(money) + " - "+ benficiaryAccount + "\n";
    }
}
