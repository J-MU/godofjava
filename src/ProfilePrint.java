
public class ProfilePrint {
	byte age;
	String name;
	boolean isMarried;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte age=23;
		System.out.println("Profile Print class started");	
		ProfilePrint uk= new ProfilePrint();
		uk.setAge(age);
		uk.setName("MinUk");
		uk.setMarried(false);
		
		System.out.printf("Minuk's age= %d",uk.getAge());
		System.out.printf("Minuk's is %s",uk.getName());
		System.out.printf("Minkuk is married %b",uk.isMarried());
	}

	public void setAge(byte page) {
		age=page;
	}
	
	public byte getAge() {
		return age;
	}
	
	public void setName(String pname) {
		name=pname;
	}
	
	public String getName() {
		return name;
	}
	
	public void setMarried(boolean flag) {
		isMarried=flag;
	}
	
	public boolean isMarried() {
		return isMarried;
	}
}
