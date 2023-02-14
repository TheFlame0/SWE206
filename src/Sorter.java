public class Sorter {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
    static void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	public static int[] selectionSort(int[] array) {
		int min;
		for (int i = 0; i < array.length; i++) {
			min = i;
			for (int j = i; j < array.length; j++) {
				if (array[min] > array[j])
					min = j;
			}
			swap(array, i, min);
		}
		return array;
}
