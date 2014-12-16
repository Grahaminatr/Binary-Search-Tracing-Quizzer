
public class binarySearch {
	public static int binarySearch(int[ ] elements, int target)
	{
		int left = 0;
		int right = elements.length - 1;
		while (left <= right)
			{
			int middle = (left + right) / 2;
			if (target < elements[middle])
				{
				right = middle - 1;
				}
			else if (target > elements[middle])
				{
				left = middle + 1;
				}
			else
				{
				return middle;
				}
			}
	return -1;
	}
}
