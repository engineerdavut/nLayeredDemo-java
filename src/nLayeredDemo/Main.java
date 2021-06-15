package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.entities.concretes.Product;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ioc konteynýr ile çözülecek spring boot tarafýnda.
		ProductService productService=new ProductManager
				(new AbcProductDao(),new JLoggerManagerAdapter());
		
		Product product=new Product(1,2,"karpuz",5.6,50);
		
		productService.add(product);
		

	}

}
