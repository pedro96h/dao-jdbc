package application;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Seller;

public class Main {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.CreateSellerDao();
		
		Seller seller = sellerDao.findById(2);
		
		System.out.println(seller);

	}

}
