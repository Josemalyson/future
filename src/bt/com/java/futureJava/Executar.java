package bt.com.java.futureJava;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Executar implements Callable<List<Integer>> {

	private List<Integer> liIntegers;
	private int tamanho;
	
	public Executar(List<Integer> liIntegers, int tamanho) {
		this.liIntegers = liIntegers;
		this.tamanho = tamanho;
	}

	public List<Integer> call() throws Exception {
		ExecutorService es1 = Executors.newCachedThreadPool();
		Future<List<Integer>> futureList = es1.submit(new PreencherArrayList(liIntegers, tamanho));
		es1.isShutdown();
		return futureList.get();
	}

}
