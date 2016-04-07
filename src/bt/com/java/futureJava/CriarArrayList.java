package bt.com.java.futureJava;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class CriarArrayList implements Callable<List<Integer>> {

	private int tamanho;

	public CriarArrayList(int tamanho) {
		super();
		this.tamanho = tamanho;
	}

	@Override
	public List<Integer> call() throws Exception {
		return new ArrayList<>(tamanho);
	}
}
