import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("quiz3:박병조"); 
		Scanner input=new Scanner(System.in);
		int k;
		double average=0;
		double sum=0;
		int n;
		System.out.print("배열 크기 입력:");
		n=input.nextInt();
		int[] array=new int[n];
		
		for(k=0;k<array.length;k++) {
			System.out.print("배열 원소 입력:");
			array[k]=input.nextInt();
		}
		
		for(k=0;k<array.length;k++) {
			sum+=array[k];
		}
		average=sum/n;
		System.out.print("평균:"+average+"\n");
		
		System.out.print("평균 이상의 값:");
		for(k=0;k<array.length;k++) {
			if(array[k]>=average) {
				System.out.print(array[k]+" ");
			}
			else if(array[k]<average) {
				continue;
			}
		}
	}

}

