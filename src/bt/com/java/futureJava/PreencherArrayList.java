package bt.com.java.futureJava;

import java.util.List;
import java.util.concurrent.Callable;

public class PreencherArrayList implements Callable<List<Integer>> {

	private List<Integer> intergerList;
	private int j;

	public PreencherArrayList(List<Integer> intergerList, int j) {
		super();
		this.intergerList = intergerList;
		this.j = j;
	}

	@Override
	public List<Integer> call() throws Exception {
		for (int i = 0; i < j; i++) {
			intergerList.add(i);
		}
		return intergerList;
	}
}
