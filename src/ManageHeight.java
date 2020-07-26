
public class ManageHeight {
	int gradeHeights[][];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManageHeight mh=new ManageHeight();
		mh.setData();
		mh.printHeight();
		mh.printAverage(0);
		mh.printAverage(1);
		mh.printAverage(2);
		mh.printAverage(3);
		mh.printAverage(4);
		
		
	}
	
	public void setData() {
		gradeHeights=new int[5][];
		gradeHeights[0]=new int[] {170,180,173,175,177};
		gradeHeights[1]=new int[] {160,165,167,186};
		gradeHeights[2]=new int[] {158,177,187,176};
		gradeHeights[3]=new int[] {173,182,181};
		gradeHeights[4]=new int[] {170,180,165,177,172};
	}
	public void printHeight() {
		for(int i=0; i<5; i++) {
			System.out.println("Class No.:"+(i+1));
			for(int j=0; j<gradeHeights[i].length; j++) {
				System.out.println(gradeHeights[i][j]);
			}
		}
	}
	
	public void printAverage(int classNo) {
		System.out.println((classNo+1)+" class height average");
		double sum=0;
		double average=-1;
		
		for(int data : gradeHeights[classNo]) {
			sum+=data;
		}
		average=sum/gradeHeights[classNo].length;
		
		System.out.println(average);
	}
}
