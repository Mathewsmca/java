public class SortAsc{
	public static void main(String [] args){
		int []a={22,20,43,56,73,55};
		int temp=0;
		
		System.out.println("elements of array:");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		for (int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]>a[j]){
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		System.out.println();
		System.out.println("Elements after sort  ascending order:");
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+ " ");
		}
			
	}
}