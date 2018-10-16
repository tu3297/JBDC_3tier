package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Commom.ConnectDatabase;
import Entity.Order;

public class OrderDAO {
	private Connection conn;

	/**
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public OrderDAO() throws SQLException, ClassNotFoundException {
		conn = ConnectDatabase.getSQLServerConnection();
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
	public List<Order> getAllOrder(String sql){
		List<Order>listOrder=new ArrayList<>();
		try {
			Statement state=conn.createStatement();
			ResultSet rs=state.executeQuery(sql);
			while(rs.next()){
				Order order=new Order();
				order.setOderId(rs.getInt(1));
				order.setCustomerId(rs.getInt(2));
				order.setCarId(rs.getInt(3));
				order.setAmount(rs.getDouble(4));
				order.setSalePrice(rs.getDouble(5));
				order.setOrderDate(rs.getDate(6)+"");
				order.setDeliveryDate(rs.getString(7)+"");
				order.setDeliveryAddress(rs.getString(8)+"");
				order.setStatus(rs.getInt(9));
				order.setNote(rs.getString(10));
				listOrder.add(order);
			}
			return listOrder;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listOrder;
		
	}
	public int removeOrderCancle(String sql){
		int numberOfOrderCanle=0;
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs=ps.executeQuery();
			while(rs.next()){
				numberOfOrderCanle=rs.getInt(1);
			}
			return numberOfOrderCanle;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
}
