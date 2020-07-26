
public class InterestManger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterestManger im=new InterestManger();
		
		for(int i=1; i<=365; i++) {
			im.calculateAmount(i,1000000);
		}
	}
	public double getInterestRate(int day) {
		double interest=-1;
		if(day<=90) {
			interest=0.005;
		}
		if(day>90 && day<=180) {
			interest=0.01;
		}
		if(day>180 && day<=364) {
			interest=0.02;
		}
		if(day>=365) {
			interest=0.056;
		}
		
		return interest;
	}
	
	public double calculateAmount(int day,long amount) {
		double interest=getInterestRate(day);
		double amountsum=amount+amount*(interest*((double)day/365));
		System.out.printf("%d day interest+amount = %f\n",day,amountsum);
		
		return amountsum;
	}
}
