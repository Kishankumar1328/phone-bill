import java.util.Scanner;

class PhoneBillGenerator{
    int consumerNumber;
    String consumerName;
    int NoOfCalls;
    public PhoneBillGenerator(int consumerNumber,String consumerName,int NoOfCalls){
        this.consumerNumber=consumerNumber;
        this.consumerName=consumerName;
        this.NoOfCalls=NoOfCalls;
    }
    public double generateBill(){
        double billAmount=0.0;
        
        if(NoOfCalls<=99){
            billAmount=50.0;
        }
        else if(NoOfCalls>=100&&NoOfCalls<=199){
            billAmount=50.0+0.5*(NoOfCalls-99);
        }
        else if(NoOfCalls>=200&&NoOfCalls<=299){
            billAmount=50.0+50.0+0.75*(NoOfCalls-199);
        }
        else{
            billAmount=50.0+50.0+50.0+1.0*(NoOfCalls-299);
        }
        return billAmount;
    }
    public void displayBill(){
        System.out.println("consumer Name:"+consumerName);
        System.out.println("consumer Number:"+consumerNumber);
        System.out.print("No Of Calls:"+NoOfCalls);
        System.out.println("Bill Amount:"+generateBill());
        
    }
}
public class Main{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("Enter consumer Number:");
        int consumerNumber=scanner.nextInt();
        
        System.out.println("Enter consumer Name:");
        String consumerName=scanner.next();
        
        System.out.println("Enter NoOfCalls:");
        int NoOfCalls=scanner.nextInt();
        
        PhoneBillGenerator pb=new PhoneBillGenerator(consumerNumber,consumerName,NoOfCalls);
        pb.displayBill();
    }
}
