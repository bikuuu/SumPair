package sumPair;


/*
 * Napisz funkcję, która dla danej tablicy zwrói sumy par jej kolejnych elementów.
 * np. [1,3,3,5,6,8] => [4,8,14]
 * - obsłuzyć Integer Overflow
 */

public class SumPair {
	

	
	public static void main(String[] args) {
		int[] tab = {1,3,3,5,999999999,999999999};

		Show(SumPair(tab));
		
	}
	
	
	private static void Show (int[] tab) {
		for (int i : tab){
			System.out.println(i);
		}
	}
	
	private static int[] SumPair (int[] tab)  {
		int[] tab2 = new int[(tab.length/2)];
		if(tab.length%2 == 0) {
			int j = 0;
			for(int i=0; i<tab.length; i+=2) {	
				if(Integer.MAX_VALUE - (tab[i] + tab[i+1]) >= 0 || Integer.MIN_VALUE + tab[i] >= tab[i+1]) {
					int sum = tab[i] + tab[i+1];
					tab2[j] = sum;
					j++;
				}  else {
					throw new IllegalArgumentException("Integer Overflow");
				}
			} 
			return tab2;
			
		}else throw new IllegalArgumentException("Odd quantity of numbers");
	}

}
