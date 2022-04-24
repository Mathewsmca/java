public class Largest{
	public static void main(String []args){
		int[] a={22,44,65,72,88};
		int max=a[0];
		for(int i=0;i<a.length;i++){
			if (a[i]>max)
				max =a[i];
		}
		System.out.println("Largest element in the array:"+max);
	}
}
