package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import Commom.ConnectDatabase;
import DTO.CarCustomer;
import DTO.OrderCustomer;
import Entity.Car;
import Entity.Customer;

public class CustomerDAO {
	private Connection conn;

	/**
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public CustomerDAO() throws SQLException, ClassNotFoundException {
		conn = ConnectDatabase.getSQLServerConnection();
	}
	/**
	 * @param sql
	 * @return
	   @param
	   @return
	   @author
	   @throws
	Oct 15, 2018
	 */
	public List<Customer> getAllCustomer(String sql){
		List<Customer> listCustomer=new ArrayList<>();
		try {
			Statement statement = conn.createStatement();
			// get list data
			ResultSet rs = statement.executeQuery(sql);
			// for retrieven data
			while (rs.next()) {
				Customer cs=new Customer();
				cs.setCustomerId(rs.getInt(1));
				cs.setCustomerName(rs.getString(2));
				cs.setCustomerPhone(rs.getString(3));
				cs.setCustomerEmail(rs.getString(4));
				cs.setCustomerAddress(rs.getString(5));
				cs.setCustomerNote(rs.getString(6));
				listCustomer.add(cs);
			}
			return listCustomer;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	/**
	 * @param sql
	 * @return
	   @param
	   @return
	   @author
	   @throws
	Oct 16, 2018
	 */
	public List<CarCustomer> getCarForEachCustomer(String sql){
		List<CarCustomer> list=new ArrayList<>();
		try {
			Statement statement=conn.createStatement();
			ResultSet rs=statement.executeQuery(sql);
			while(rs.next()){
				CarCustomer carCustomer=new CarCustomer();
			    carCustomer.setName(rs.getString(1));
			    carCustomer.setAmount(rs.getInt(2));
			    list.add(carCustomer);
			}
			return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	public List<OrderCustomer> getAllCarCustomerBuy(String sql,Integer customerId){
		List<OrderCustomer>list=new ArrayList<>();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			 ps.setInt(1, customerId);
		     ResultSet rs = ps.executeQuery();
		     while(rs.next()){
		    	 OrderCustomer orderCustomer=new OrderCustomer();
		    	 orderCustomer.setName(rs.getString(1));
		    	 orderCustomer.setAmount(rs.getInt(2));
		    	 orderCustomer.setAmount(rs.getInt(3));
		    	 orderCustomer.setMarker(rs.getString(4));
		    	 list.add(orderCustomer);
		     }
		     return list;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		
	}
}
