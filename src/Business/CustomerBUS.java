package Business;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import DTO.CarCustomer;
import DTO.OrderCustomer;
import Dao.CustomerDAO;
import Entity.Customer;

public class CustomerBUS {
	/**
	 * @param sql
	 * @return
	 * @throws SQLException
	   @param
	   @return
	   @author
	   @throws
	Oct 16, 2018
	 */
	public List<Customer> getAllCustomer() throws SQLException{
		List<Customer> listCustomer=new ArrayList<>();
		try {
			CustomerDAO customerDAO = new CustomerDAO();
			String sql="select *from customer";
			listCustomer=customerDAO.getAllCustomer(sql);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return listCustomer;
	}
	/**
	 * @return
	   @param
	   @return
	   @author
	   @throws
	Oct 16, 2018
	 */
	public List<CarCustomer> getCarForEachCustomer(){
		List<CarCustomer>listCarCustomer=new ArrayList<>();
		try {
			CustomerDAO customerDAO=new CustomerDAO();
			String sql="select b.name,sum(a.amount) as 'so luong xe da mua' "
            + " from car_order a join customer b on a.customerid=b.customerId" + " where a.status=1"
            + " group by a.customerid,b.name" + " order by sum(a.amount) asc";
			listCarCustomer=customerDAO.getCarForEachCustomer(sql);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return listCarCustomer;
	}
	/**
	 * @param customerId
	 * @return
	   @param
	   @return
	   @author
	   @throws
	Oct 16, 2018
	 */
	public List<OrderCustomer> getAllCarCustomerBuy(Integer customerId){
		 List<OrderCustomer> list=new ArrayList<>();
		 try {
			CustomerDAO customerDAO=new CustomerDAO();
			 String sql="exec caue2 ?";
			 list=customerDAO.getAllCarCustomerBuy(sql, customerId);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		 return list;
	}
    
}
