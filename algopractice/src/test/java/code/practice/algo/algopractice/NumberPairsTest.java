package code.practice.algo.algopractice;



import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class NumberPairsTest {
	
	
	@Test
	public void testPossiblePairCountTest() {
	
	Numberpair pair = new Numberpair();
	
	List<Integer> numlist = new ArrayList<>();
	numlist.add(10);
	numlist.add(5);
	numlist.add(15);
	numlist.add(0);
	numlist.add(25);
	
	int target = 15;
	
	int pairCount = pair.getcount(numlist, target);
	assertEquals(2, pairCount);
	
	}
	

}
