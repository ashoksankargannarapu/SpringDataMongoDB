package com.nt.runner;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.document.StockDetails;
import com.nt.service.IStockMgmtService;
@Component
public class MongoTemplateTestRunner implements CommandLineRunner {
	
	@Autowired
	private IStockMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		/*System.out.println("________Saved document operation_______");
		StockDetails details=new StockDetails(new Random().nextInt(1000), "ICICI", 99999, "BSE");
		String result=service.registerStockDetails(details);
		System.out.println(result);*/
		
		
		/*System.out.println("------insertAll() to save  multiple document");
		StockDetails details1=new StockDetails(new Random().nextInt(1000), "SBI", 999, "BSE");
		StockDetails details2=new StockDetails(new Random().nextInt(1000), "Bajaj", 4300, "BSE");
		StockDetails details3=new StockDetails(new Random().nextInt(1000), "Chaitanya", 1200, "BSE");
		String msg=service.registerStockDetailsBatch(List.of(details1,details2,details3));
		System.out.println(msg);*/
		
		/*System.out.println("----------------------------");
		service.fetchStocksDetailsByExchange("ABC").forEach(System.out::println);
		*/	
		
		//service.fetchStocksDetailsByPriceRange(100, 1000).forEach(System.out::println);
		
		//System.out.println("733 Stock details are::"+service.fetchStockDetailsByStockId(733));
		
		//System.out.println(service.fetchAndUpdateStockDetailsByStockId(733, 5000, "Mongo"));
		
		//System.out.println(service.modifyExchangeByStockPriceRange(100, 1200, "template"));
		//System.out.println(service.registerOrUpdateStockByStockName("Union", 3500,"java"));
		//System.out.println(service.fetchAndRemoveByStockName("Chaitanya"));
		System.out.println(service.fetchAndRemoveByPriceRange(100, 4000));
	}

}
