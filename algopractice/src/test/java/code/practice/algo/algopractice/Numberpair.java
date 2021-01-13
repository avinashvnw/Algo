package code.practice.algo.algopractice;

import java.util.List;

public class Numberpair {

	public int getcount(List<Integer> numberList, int target) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int i = 0; i < numberList.size(); i++) {
			for (int j = i + 1; j < numberList.size(); j++) {
				if (numberList.get(i) + numberList.get(j) == target) {
					count++;
				}
			}
		}
		return count;
	}

}
