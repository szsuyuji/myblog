package com.szsuyuji.test;

import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;

import org.testng.annotations.Test;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;

@SuppressWarnings("unchecked")
public class GuavaTest {

	@Test(groups = { "g1" })
	public void testFuture() throws InterruptedException, ExecutionException {
		ListeningExecutorService service = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(10));
		ListenableFuture<String> future = service.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				System.out.println(Thread.currentThread().getId());
				Thread.sleep(5000);
				return "hello";
			}
		});
		ListenableFuture<String> future2 = service.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				System.out.println(Thread.currentThread().getId());
				Thread.sleep(5000);
				return "world!";
			}
		});
		ListenableFuture<List<String>> futureList = Futures.allAsList(future, future2);
		List<String> list = futureList.get();
		System.out.println(list);
	}

	@Test
	public void testEventBus() {
		EventBus eb = new EventBus();
		eb.register(this);
		eb.post(new ChangedEvent("event1"));
	}

	@Subscribe
	public void handler1(ChangedEvent event) {
		System.out.println(event.getName());
	}

	public class ChangedEvent {
		private String name;

		public ChangedEvent(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
	}
}
