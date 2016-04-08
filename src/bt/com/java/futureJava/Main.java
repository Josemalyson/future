package bt.com.java.futureJava;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) throws InterruptedException, ExecutionException {

		long tempoInicio = System.currentTimeMillis();
		ExecutorService es = Executors.newCachedThreadPool();
		es.submit(new Executar(new ArrayList<Integer>(), 100000));
		es.submit(new Executar(new ArrayList<Integer>(), 200000));
		es.submit(new Executar(new ArrayList<Integer>(), 300000));
		es.submit(new Executar(new ArrayList<Integer>(), 400000));
		es.submit(new Executar(new ArrayList<Integer>(), 500000));
		es.submit(new Executar(new ArrayList<Integer>(), 600000));
		es.submit(new Executar(new ArrayList<Integer>(), 700000));
		es.submit(new Executar(new ArrayList<Integer>(), 800000));
		es.submit(new Executar(new ArrayList<Integer>(), 900000));
		es.submit(new Executar(new ArrayList<Integer>(), 1000000));
		System.out.println("Tempo Total com Future: " + (System.currentTimeMillis() - tempoInicio) + " milisegundos " + Thread.currentThread().getName());
		es.shutdown();

		long tempoInicio1 = System.currentTimeMillis();
		List<Integer> lista1 = new ArrayList<>(100000);
		List<Integer> lista2 = new ArrayList<>(200000);
		List<Integer> lista3 = new ArrayList<>(300000);
		List<Integer> lista4 = new ArrayList<>(400000);
		List<Integer> lista5 = new ArrayList<>(500000);

		for (int i = 0; i < 100000; i++) {
			lista1.add(i);
		}
		for (int i = 0; i < 200000; i++) {
			lista2.add(i);
		}
		for (int i = 0; i < 300000; i++) {
			lista3.add(i);
		}
		for (int i = 0; i < 400000; i++) {
			lista4.add(i);
		}
		for (int i = 0; i < 500000; i++) {
			lista5.add(i);
		}
		System.out.println("Tempo Total sem Future: " + (System.currentTimeMillis() - tempoInicio1) + " milisegundos " + Thread.currentThread().getName());
	}

}
