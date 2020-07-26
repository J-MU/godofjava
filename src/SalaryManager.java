
public class SalaryManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalaryManager sm=new SalaryManager();
		double monthlySalaryofsm=sm.getMonthlySalary(2000);
		System.out.printf("sm's monthSalary is %f",monthlySalaryofsm);
	}
	
	public double getMonthlySalary(int yearlySalary) {
		double MonthlySalary=(double)yearlySalary/12;
		double taxsum=0;
		SalaryManager sm=new SalaryManager();
		taxsum+=sm.calculateTax(MonthlySalary);
		taxsum+=sm.calculateNationalPension(MonthlySalary);
		taxsum+=sm.calculateHealthInsurance(MonthlySalary);
		
		MonthlySalary-=taxsum;
		
		return MonthlySalary;
	}
	
	public double calculateTax(double monthSalary) {
		double workTax=monthSalary*0.125;
		System.out.printf("workTax= %f\n",workTax);
		
		return workTax;
	}
	
	public double calculateNationalPension(double monthSalary) {
		double NationalPension=monthSalary*0.081;
		System.out.printf("NationalPension= %f\n",NationalPension);
		
		return NationalPension;
	}
	
	public double calculateHealthInsurance(double monthSalary) {
		double HealthInsurance=monthSalary*0.135;
		System.out.printf("HealthInsurance= %f\n",HealthInsurance);
		
		return HealthInsurance;
	}
	
	
}
