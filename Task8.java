package Tasks;

public class Task8 {

	public static void main(String[] args) {
		/* Maximum and minimum number in the array*/

	

	int arr[] = { 25, 4, 87, 12, 45, 6 };
	int min = arr[0];
	int max=arr[0];

	for(
	int i = 0;i<arr.length;i++)
	{
		if (arr[i] < min) {
			min = arr[i];
		}
		if (arr[i] > max) {
			max = arr[i];
			System.out.println("Minimum of array is " + min + " and Maximum of array is " + max);
		}
	}

	}
}

