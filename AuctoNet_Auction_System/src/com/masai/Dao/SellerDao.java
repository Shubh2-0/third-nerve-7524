package com.masai.Dao;

import java.sql.ResultSet;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.masai.Dto.BuyerImpl;
import com.masai.Dto.ProductImpl;
import com.masai.Dto.RefundProductImpl;
import com.masai.Dto.SellerImpl;
import com.masai.Dto.TransactionImpl;


public interface SellerDao {
	
//	String registerSeller(UserImpl u);
//	String updateSellerDetails(UserImpl u);
//	ArrayList<ProductImpl> getAllProductForSell();
//	String purchaseItem(int productId);
//	String returnGoods(LocalDate date,int productId);
//	ArrayList<TransactionImpl> viewAllTransactions(String UuserName);
//	ArrayList<RefundProductImpl> viewAllrefundProduct();
//	String updateProductDetails(ProductImpl product);
//    String deleteAcount(String username,String password);
//    
//    

	SellerImpl getSellerByUsername(String username);

	SellerImpl loginSeller(String username, String password);

	String updateSellerDetails(SellerImpl u);

	double getSellerIncome(String username);

	String registerNewSeller(SellerImpl s);


	boolean unhideSellerProducts(String username);

	boolean hideSellerProducts(String username);

	ResultSet getSellerAllProductsByCategory(String item, String username);

	boolean amountWithrowBySeller(double amount, String unsername);

	boolean deleteSeller(String username, String password);

	ResultSet getAllSellerProducts(String username);

	List<Integer> getSellerProductsID(String username);

	ResultSet getAllSellerProductsOrderByQuantity(String username);

	ResultSet getAllSellerProductsOrderByPrice(String username);

	double getSellerPendingAmount(String username);



	boolean getSellerPaidPendingAmount(double pendingAamount, String username, double income);
    
}
